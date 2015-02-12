package com.tareassp1.milaronix.tareassp1;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class ImgLogo extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_img_logo);
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
