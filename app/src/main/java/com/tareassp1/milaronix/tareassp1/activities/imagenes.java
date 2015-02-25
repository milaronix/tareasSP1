package com.tareassp1.milaronix.tareassp1.activities;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.Menu;
import android.view.MenuItem;

import com.tareassp1.milaronix.tareassp1.R;
import com.tareassp1.milaronix.tareassp1.fragments.*;

/**
 * Created by milaronix on 21/02/15.
 */
public class imagenes extends FragmentActivity {

    public static final String EXTRA_IMAGE = "extra_image";
    //private static final int numeroPaginas = 5;
    private ViewPager mPager;
    private ImagePagerAdapter mAdapter;

    public final static int[] arrayFlags = new int[]{
            R.drawable.campero,
            R.drawable.taco,
            R.drawable.pizzahut,
            R.drawable.gogreen,
            R.drawable.subway,
            R.drawable.burguer
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mPager = (ViewPager) findViewById(R.id.pager);
        mAdapter = new ImagePagerAdapter(getSupportFragmentManager(),arrayFlags.length);
        mPager.setAdapter(mAdapter);
    }

    @Override
    public void onBackPressed() {
        if(mPager.getCurrentItem() == 0){
            super.onBackPressed();
        } else {
            mPager.setCurrentItem(mPager.getCurrentItem() - 1);
        }
    }

    private class ImagePagerAdapter extends FragmentStatePagerAdapter {
        private final int mSize;

        public ImagePagerAdapter(FragmentManager fm, int size) {
            super(fm);
            mSize = size;
        }

        @Override
        public Fragment getItem(int position) {

            return deslizador.newInstance(position);
        }

        @Override
        public int getCount() {
            return mSize;
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
