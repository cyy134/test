package com.example.cyy12.learne;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import org.litepal.LitePal;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void GogrampList(View view){
        Intent intent=new Intent(this,Gramp_list.class);
        startActivity(intent);
    }
    public void CreateDb(View view){
        LitePal.getDatabase();
    }
}
