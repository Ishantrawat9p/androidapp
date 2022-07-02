package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class activity2 extends AppCompatActivity {

    RelativeLayout rll;
    RelativeLayout rla;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        rll=findViewById(R.id.rl44);

        rll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(activity2.this,grid.class);
                startActivity(intent);
            }
        });

        rla=findViewById(R.id.rl33);

        rla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(activity2.this,grid2.class);
                startActivity(intent);
            }
        });
        getSupportActionBar().setTitle("Chooose");

    }
}