package net.kkv.app;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

public class ImageGallery extends Activity implements OnClickListener{

	private static int RESULT_LOAD_IMAGE = 1;
	
	//GUI components
	private Button button;		//The button
	private ImageView image;	//ImageView
	
	@Override
	public void onCreate (Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		//Find references to the GUI objects
		button = (Button)findViewById(R.id.buttonLoadPictures);
		image = (ImageView)findViewById(R.id.imgView);
		
		//Set button's onClick listener object.
		button.setOnClickListener(this);
	}

	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data)
	{
		super.onActivityResult(requestCode, resultCode, data);
		/**
		 * Here we need to check if the activity that was triggered was the Image Gallery.
		 * If it is, the requestCode will match the RESULT_LOAD_IMAGE value.
		 * If the resultCode is RESULT_OK and there is some data we know that an image was picked.
		 */
		if(requestCode == RESULT_LOAD_IMAGE && resultCode == RESULT_OK && null != data)
		{
			//Let's read picked image data - its URI
			Uri selectedImage = data.getData();
			//Let's read picked image path using content resolver
			String[] filePath = { MediaStore.Images.Media.DATA };
			Cursor cursor = getContentResolver().query(selectedImage, filePath,  null,  null,  null);
			cursor.moveToFirst();
			String imagePath = cursor.getString(cursor.getColumnIndex(filePath[0]));
			
			//Now we need to set the GUI ImageView data with data read from the picked file
			image.setImageBitmap(BitmapFactory.decodeFile(imagePath));
			
			//At the end remember to close the cursor or you will end with the RunTimeException!
			cursor.close();
		}
	}
	
		@Override
		public void onClick(View v) 
		{
			//Create the Intent for Image Gallery
			Intent i = new Intent(Intent.ACTION_PICK, android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
			startActivityForResult(i, RESULT_LOAD_IMAGE);
		}
	}
