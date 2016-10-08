package com.example.danielasanchezollervides.list;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import java.util.ArrayList;
import static java.util.Arrays.asList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


       ListView myListView = (ListView) findViewById(R.id.List);

        // ArrayList<> to hold the items that will be shown in the ListView item
        // The ArrayList<> will hold family member's names, so it must be of String type.
        final ArrayList<String> myFamily = new ArrayList<String>();

       // We use the add method to populate the ArrayList.  This method receives data
        // of the ArrayList<> data type and appends it to the end of the list.
        myFamily.add("Dante");
        myFamily.add("Daniela");
        myFamily.add("Octavio");
        myFamily.add("Maria");
        myFamily.add("Karen");
        myFamily.add("Luis");
        myFamily.add("Roberto");

        // We need and adapter to link our ArrayList to our ListView.
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, myFamily);

        // We link our ArrayList to our ListView
        myListView.setAdapter(arrayAdapter);

        // We add a Listener to have more control over what happens when the user clicks on any
        // of our ListView cells (item)
        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            // We override the onItemClick function
            // AdapterView<> has an unidentified data type (?) so it can manage any type.
            // It is also an AdapterView so it can handle Lists, Spinners, Grids and so on
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                //If for some reason we would want the list to disappear wen the user clicks on it:
                //parent.setVisibility(View.GONE);

                //If we wanted that the name the user clicks on appears on the log
                //Log.i("Person tapped: ",myFamily.get(position));

                //Toast to the person clicked
                Toast.makeText(getApplicationContext(),"Hello " + myFamily.get(position), Toast.LENGTH_LONG);

            }
        });


    }
}
