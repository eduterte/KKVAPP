package net.kkv.app.tabswipe.adapter;

//import net.kkv.app.tabswipe.KoaAina;
//import net.kkv.app.tabswipe.HoaAina;
//import net.kkv.app.tabswipe.LoheAina;
//import net.kkv.app.tabswipe.MahiAina;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class TabsPagerAdapter extends FragmentPagerAdapter {

	public TabsPagerAdapter(FragmentManager fm) {
		super(fm);
	}
	
	@Override
	public Fragment getItem(int index) {
		
		switch (index) {
		case 0:
			// Koa Aina fragment activity
			return new KoaAinaFragment();
		case 1:
			// Hoa Aina fragment activity
			return new HoaAinaFragment();
		case 2:
			// Lohe Aina fragment activity
			return new LoheAinaFragment();
		case 3:
			// Mahi Aina fragment activity
			return new MahiAinaFragment();
		}
		
		return null;
	}
	
	@Override
	public int getCount() {
		// get item count - equal to number of tabs
		return 4;
	}
}
