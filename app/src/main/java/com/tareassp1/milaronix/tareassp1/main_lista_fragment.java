package com.tareassp1.milaronix.tareassp1;

//import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
//import android.support.annotation.Nullable;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v4.app.Fragment;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by milaronix on 12/02/15.
 */
public class main_lista_fragment extends Fragment{

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.lista_fragment,container,false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        final String[] nombres = {"Pollo Campero", "Taco Bell", "Pizza Hut", "Go Green", "Subway", "Burguer King"};
        final String[] direcciones = {"20 calle 4-65 zona 1", "20 calle 4-65 zona 2", "20 calle 4-65 zona 3", "20 calle 4-65 zona 4", "20 calle 4-65 zona 5", "21256789"};
        final String[] telefonos = {"24203536", "23232525", "21256363", "21256365", "21259854", "21256789"};
        ListView lv = (ListView) getActivity().findViewById(R.id.main_lista);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(getActivity().getApplicationContext(),midetalle.class);
                i.putExtra("elnombre", nombres[position]);
                i.putExtra("ladireccion", direcciones[position]+", Guatemala, Guatemala");
                i.putExtra("eltelefono", telefonos[position]);
                i.putExtra("elmail",telefonos[position]+"@gmail.com");
                i.putExtra("elwebsite","www."+telefonos[position]+".com");
                startActivity(i);
            }
        });

        lv.setAdapter(new ArrayAdapter<String>(getActivity().getBaseContext(), android.R.layout.simple_list_item_1, nombres));
    }
}
