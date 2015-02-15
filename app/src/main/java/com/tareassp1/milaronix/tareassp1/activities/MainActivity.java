package com.tareassp1.milaronix.tareassp1.activities;

/**
 * Created by Milaronix on 25/01/2015.
 */

//import android.app.ActionBar;
//import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.*;
import android.support.v7.app.*;
import android.support.v7.app.ActionBar.TabListener;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.tareassp1.milaronix.tareassp1.R;
import com.tareassp1.milaronix.tareassp1.fragments.*;



public class MainActivity extends ActionBarActivity implements TabListener {

    Fragment[] fragments = new Fragment[] {new main_lista_fragment(),new mapas_fragment()};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setNavigationMode(actionBar.NAVIGATION_MODE_TABS);

        FragmentManager manager = getSupportFragmentManager();
        manager.beginTransaction().add(R.id.contenedor_main, fragments[0]).add(R.id.contenedor_main, fragments[1]).commit();

        actionBar.addTab(
                actionBar.newTab()
                        .setText(getString(R.string.titulo_pestaña_establcimiento))
                        .setTabListener(this));
        actionBar.addTab(
                actionBar.newTab()
                        .setText(getString(R.string.titulo_pestaña_mapas))
                        .setTabListener(this));

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

    @Override
    public void onTabSelected(ActionBar.Tab tab, android.support.v4.app.FragmentTransaction fragmentTransaction) {
        Fragment toHide = null;
        Fragment toShow = null;

        switch (tab.getPosition()){
            case 0:
                toHide = fragments[0];
                toShow = fragments[1];

                break;
            case 1:
                toHide = fragments[1];
                toShow = fragments[0];
                break;
        }

        fragmentTransaction.hide(toHide).show(toShow);

    }

    @Override
    public void onTabUnselected(ActionBar.Tab tab, android.support.v4.app.FragmentTransaction fragmentTransaction) {

    }

    @Override
    public void onTabReselected(ActionBar.Tab tab, android.support.v4.app.FragmentTransaction fragmentTransaction) {

    }
}