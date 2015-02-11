package com.tareassp1.milaronix.tareassp1;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.util.Linkify;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
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

        ImageButton boton = (ImageButton) findViewById(R.id.logo);

        /*boton.setOnClickListener(new View.OnClickListener(){
            @Override
                    public void onClick(View v){
                Toast.makeText(getApplicationContext(),"mensaje",Toast.LENGTH_LONG);
            }
        });*/

        /*Intent in = new Intent(getApplicationContext(),ImgLogo.class);
        startActivity(in);*/
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

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
