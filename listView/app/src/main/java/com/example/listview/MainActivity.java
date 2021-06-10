package com.example.listview;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    String arr[] = {"item 0","item 1","item 2","item 3","item 4","item 5","item 6","item 7","item 8","item 9","item 2","item 2","item 2"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);

        // using built-in array adapter
        // ArrayAdapter ad = new ArrayAdapter(this,android.R.layout.simple_list_item_1,arr);
        // listView.setAdapter(ad);

        // creating a custom adapter
        AsharAdapter ad = new AsharAdapter(this, R.layout.ashar_layout,arr);
        listView.setAdapter(ad);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                
            }
        });
    }
}