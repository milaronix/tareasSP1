package com.tareassp1.milaronix.tareassp1.fragments;

//import android.app.Fragment;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tareassp1.milaronix.tareassp1.R;

/**
 * Created by milaronix on 14/02/15.
 */
public class mapas_fragment extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.mapas_fragment,container,false);
    }

}
