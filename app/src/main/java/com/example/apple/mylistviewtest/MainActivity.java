package com.example.apple.mylistviewtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String[] Drink = {"紅茶","奶茶", "綠茶", "菊花茶", "拿鐵"};
    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = (ListView) findViewById(R.id.listView);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                MainActivity.this,
                R.layout.myitem,
                Drink);
        lv.setAdapter(adapter);
        //長壓式Click
        lv.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
                                          @Override
                                          public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                                              Toast.makeText(MainActivity.this, "Click"+Drink[position], Toast.LENGTH_SHORT).show();
                                              return true;
                                          }
                                      }
        );

    }
}
