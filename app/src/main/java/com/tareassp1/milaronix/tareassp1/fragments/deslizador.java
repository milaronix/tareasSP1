package com.tareassp1.milaronix.tareassp1.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.tareassp1.milaronix.tareassp1.R;

import com.tareassp1.milaronix.tareassp1.activities.imagenes;

/**
 * Created by milaronix on 21/02/15.
 */
public class deslizador extends Fragment{
    private static final String IMAGE_DATA_EXTRA = "resId";
    private int mImageNum;
    private ImageView mImageView;

    public static deslizador newInstance(int imageNum){
        final deslizador f = new deslizador();
        final Bundle args = new Bundle();
        args.putInt(IMAGE_DATA_EXTRA,imageNum);
        f.setArguments(args);

        return f;
    }

    public deslizador() {}

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mImageNum = getArguments() != null ? getArguments().getInt(IMAGE_DATA_EXTRA) : -1;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        final View v = inflater.inflate(R.layout.deslizador, container, false);
        mImageView = (ImageView) v.findViewById(R.id.bandera);

        return v;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        final int resId = imagenes.arrayFlags[mImageNum];
        mImageView.setImageResource(resId); // Load image into ImageView
    }

}
