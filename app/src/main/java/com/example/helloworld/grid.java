package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class grid extends AppCompatActivity {

    LinearLayout rlt;
    LinearLayout rlc;
    LinearLayout rlm;
    LinearLayout rle;
    LinearLayout rls;
    LinearLayout rlmd;
    LinearLayout rlb;
    LinearLayout rlg;
    LinearLayout rll;
    LinearLayout rlsb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid);

        rlt=findViewById(R.id.ti);
        rlc=findViewById(R.id.coi);
        rlm=findViewById(R.id.moi);
        rle=findViewById(R.id.eli);
        rls=findViewById(R.id.sli);
        rlmd=findViewById(R.id.mdi);
        rlb=findViewById(R.id.bhi);
        rlg=findViewById(R.id.goi);
        rll=findViewById(R.id.lei);
        rlsb=findViewById(R.id.sbi);

        rlt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(grid.this,tiger.class);
                startActivity(intent);
            }
        });

        rlc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goLink("https://www.wildlifeconservationtrust.org/the-little-known-king-of-kumaon/");
            }

            private void goLink(String s) {
                Uri uri= Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW,uri));
            }
        });

        rls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goLink("https://en.wikipedia.org/wiki/Snow_leopard");
            }

            private void goLink(String s) {
                Uri uri= Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW,uri));
            }
        });

        rlm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goLink("https://www.navuttarakhand.com/himalayan-monal-state-bird-uttarakhand/");
            }

            private void goLink(String s) {
                Uri uri= Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW,uri));
            }
        });

        rlb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goLink("https://en.wikipedia.org/wiki/Bharal");
            }

            private void goLink(String s) {
                Uri uri= Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW,uri));
            }
        });

        rle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goLink("https://forest.uk.gov.in/uploads/wildlife_management_more_information/1616766038.pdf");
            }

            private void goLink(String s) {
                Uri uri= Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW,uri));
            }
        });

        rlg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goLink("http://www.wilddocu.de/himalayan-goral-nemorhaedus-goral/");
            }

            private void goLink(String s) {
                Uri uri= Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW,uri));
            }
        });

        rll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goLink("https://india.mongabay.com/2020/07/living-with-leopards-taking-forward-corbetts-legacy/");
            }

            private void goLink(String s) {
                Uri uri= Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW,uri));
            }
        });

        rlmd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goLink("https://en.wikipedia.org/wiki/Alpine_musk_deer#:~:text=The%20Alpine%20musk%20deer%20(Moschus,to%20the%20highlands%20of%20Tibet.&text=The%20Alpine%20musk%20deer%20recorded,the%20state%20animal%20of%20Uttarakhand.");
            }

            private void goLink(String s) {
                Uri uri= Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW,uri));
            }
        });

        rlsb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goLink("https://en.wikipedia.org/wiki/Sloth_bear");
            }

            private void goLink(String s) {
                Uri uri= Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW,uri));
            }
        });

        getSupportActionBar().setTitle("FAUNA");
    }
}