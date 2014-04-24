package net.kkv.app.tabswipe.adapter;

import net.kkv.app.R;
import net.kkv.app.R.layout;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
 
public class KoaAinaFragment extends Fragment {
 
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.koa_aina, container, false);
         
        return rootView;
    }
}