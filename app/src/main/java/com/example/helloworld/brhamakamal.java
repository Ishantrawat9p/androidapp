package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class brhamakamal extends AppCompatActivity {


    Button but1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brhamakamal);

        but1 =findViewById(R.id.b6);
        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goLink("https://wiki.nurserylive.com/t/brahma-kamal-rare-legendary-mythological-plant-of-india/273");
            }

            private void goLink(String s) {
                Uri uri= Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW,uri));
            }
        });

        getSupportActionBar().setTitle("brhamakamal");
    }
}