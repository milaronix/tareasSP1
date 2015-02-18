package com.tareassp1.milaronix.tareassp1.data;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.tareassp1.milaronix.tareassp1.R;
import com.tareassp1.milaronix.tareassp1.fragments.*;

/**
 * Created by milaronix on 15/02/15.
 */
public class flagPagerAdapter extends FragmentPagerAdapter {


    public flagPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        int[] arrayFlags = new int[]{
            R.drawable.campero,
            R.drawable.taco,
            R.drawable.pizzahut,
            R.drawable.gogreen,
            R.drawable.subway,
            R.drawable.burguer
        };
        Fragment fragment = new flagfragment();
        Bundle args = new Bundle();
        args.putInt(flagfragment.RESOURCE, arrayFlags[position]);
        fragment.setArguments(args);
        return null;
    }

    @Override
    public int getCount() {
        return 6;
    }
}
