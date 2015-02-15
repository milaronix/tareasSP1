package com.tareassp1.milaronix.tareassp1;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;


public class ImgLogo extends ActionBarActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_img_logo);


        Intent iproviene = getIntent();
        String nombre = iproviene.getStringExtra("nombre");

        ImageView imagen = (ImageView) findViewById(R.id.logo);

        switch (nombre){
            case "Pollo Campero":
                imagen.setImageResource(R.drawable.campero);
                break;
            case "Taco Bell":
                imagen.setImageResource(R.drawable.taco);
                break;
            case "Pizza Hut":
                imagen.setImageResource(R.drawable.pizzahut);
                break;
            case "Go Green":
                imagen.setImageResource(R.drawable.gogreen);
                break;
            case "Subway":
                imagen.setImageResource(R.drawable.subway);
                break;
            case "Burguer King":
                imagen.setImageResource(R.drawable.burguer);
                break;
        }

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_img_logo, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        Intent i = getIntent();

        switch (id){
            case R.id.action_share:
                String nombre = i.getStringExtra("elnombre");
                String compartir = "Mensaje para compartir" + nombre;
                String msg = getString(R.string.msg_compartir, nombre);
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_SEND);
                intent.putExtra(intent.EXTRA_STREAM, Uri.parse("@drawable/phut"));
                intent.setType("image/*");
                startActivity(Intent.createChooser(intent,getString(R.string.action_share)));
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }
}
