package com.tareassp1.milaronix.tareassp1;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.util.Linkify;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;


public class midetalle extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_midetalle);

        TextView textoEst = (TextView) findViewById(R.id.nombreEst);
        TextView direccionEst = (TextView) findViewById(R.id.dirEst);
        TextView telefonoEst = (TextView) findViewById(R.id.telEst);
        TextView correoEst = (TextView) findViewById(R.id.mailEst);
        TextView websiteEst = (TextView) findViewById(R.id.sitioEst);

        Intent i = getIntent();

        String nombre = i.getStringExtra("elnombre");
        textoEst.setText(nombre);

        String direccion = i.getStringExtra("ladireccion");
        direccionEst.setText(direccion);
        Linkify.addLinks(direccionEst,Linkify.MAP_ADDRESSES);

        String telefono = i.getStringExtra("eltelefono");
        telefonoEst.setText(telefono);
        Linkify.addLinks(telefonoEst,Linkify.ALL);

        String mail = i.getStringExtra("elmail");
        correoEst.setText(mail);
        Linkify.addLinks(correoEst,Linkify.ALL);

        String sitio = i.getStringExtra("elwebsite");
        websiteEst.setText(sitio);
        Linkify.addLinks(websiteEst,Linkify.ALL);

        Button boton = (Button) findViewById(R.id.bimagen);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_midetalle, menu);
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
                intent.putExtra(intent.EXTRA_TEXT, msg);
                intent.setType("text/plain");
                startActivity(Intent.createChooser(intent,getString(R.string.action_share)));
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }

    public void elclick (View view){
        Intent i = new Intent(getApplicationContext(),ImgLogo.class);
        startActivity(i);
    }
}
