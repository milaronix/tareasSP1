package com.tareassp1.milaronix.tareassp1.fragments;

//import android.app.Fragment;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

import com.tareassp1.milaronix.tareassp1.R;
import com.tareassp1.milaronix.tareassp1.data.flagPagerAdapter;

/**
 * Created by milaronix on 14/02/15.
 */
public class mapas_fragment extends Fragment {

    ViewPager viewPager;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        flagPagerAdapter adapter = new flagPagerAdapter(getChildFragmentManager());
        viewPager.setAdapter(adapter);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.mapas_fragment,container,false);
        viewPager = (ViewPager) view.findViewById(R.id.pager_bandera);
        return view;
    }

}
