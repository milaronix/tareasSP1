package com.tareassp1.milaronix.tareassp1.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.tareassp1.milaronix.tareassp1.R;
import com.tareassp1.milaronix.tareassp1.fragments.*;

/**
 * Created by milaronix on 15/02/15.
 */


public class flagfragment extends Fragment {
    public final static String RESOURCE = "resource";

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_flag, null);
        ImageView imageView = (ImageView)   view.findViewById(R.id.banderas);
        Bundle args = getArguments();

        imageView.setImageResource(args.getInt(RESOURCE));


        return super.onCreateView(inflater, container, savedInstanceState);
    }
}
