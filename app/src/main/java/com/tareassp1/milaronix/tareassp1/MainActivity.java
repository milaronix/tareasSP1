package com.tareassp1.milaronix.tareassp1;

/**
 * Created by Milaronix on 25/01/2015.
 */

import android.app.ActionBar;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final String[] nombres = {"Pollo Campero", "Taco Bell", "Pizza Hut", "Go Green", "Subway", "Burguer King"};
        final String[] direcciones = {"20 calle 4-65 zona 1", "20 calle 4-65 zona 2", "20 calle 4-65 zona 3", "20 calle 4-65 zona 4", "20 calle 4-65 zona 5", "21256789"};
        final String[] telefonos = {"24203536", "23232525", "21256363", "21256365", "21259854", "21256789"};
        ListView lv = (ListView) findViewById(R.id.list);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(getApplicationContext(),midetalle.class);
                i.putExtra("elnombre", nombres[position]);
                i.putExtra("ladireccion", direcciones[position]+", Guatemala, Guatemala");
                i.putExtra("eltelefono", telefonos[position]);
                i.putExtra("elmail",telefonos[position]+"@gmail.com");
                i.putExtra("elwebsite","www."+telefonos[position]+".com");
                startActivity(i);
            }
        });

        lv.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, nombres));

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