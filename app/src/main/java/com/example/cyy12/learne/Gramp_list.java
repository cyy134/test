package com.example.cyy12.learne;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Gramp_list extends AppCompatActivity {
     private List<String> list=new ArrayList<>();
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gramp_list);
        initGramp();
       ArrayAdapter arrayAdapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,list);
        ListView listView=(ListView)findViewById(R.id.lv);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(Gramp_list.this, "diyiz ", Toast.LENGTH_SHORT).show();
            }
        });
    }
    public  void initGramp(){
        for(int i=1;i<35;i++) {
           String s="第"+i+"组";
            list.add(s);
        }
    }
}
