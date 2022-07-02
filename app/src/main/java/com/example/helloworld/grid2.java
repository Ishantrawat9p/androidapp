package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class grid2 extends AppCompatActivity {

    LinearLayout rlb;
    LinearLayout rlbu;
    LinearLayout rlo;
    LinearLayout rlm;
    LinearLayout rlp;
    LinearLayout rlsa;
    LinearLayout rlsi;
    LinearLayout rlc;
    LinearLayout rlv;
    LinearLayout rld;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid2);

        rlb=findViewById(R.id.bri);
        rlbu=findViewById(R.id.bui);
        rlo=findViewById(R.id.ori);
        rlm=findViewById(R.id.mei);
        rlp=findViewById(R.id.pii);
        rlsa=findViewById(R.id.sali);
        rlsi=findViewById(R.id.sai);
        rlc=findViewById(R.id.cii);
        rlv=findViewById(R.id.vii);
        rld=findViewById(R.id.dei);

        rlb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(grid2.this,brhamakamal.class);
                startActivity(intent);
            }
        });

        rlbu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goLink("https://www.euttaranchal.com/tourism/burans-flower-blooming-uttarakhand.php");
            }

            private void goLink(String s) {
                Uri uri= Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW,uri));
            }
        });

        rlc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goLink("https://valleyofflowers.info/flowers-found-in-valley-of-flowers/vajardanti-potentilla-flower-in-the-valley-of-flowers/");
            }

            private void goLink(String s) {
                Uri uri= Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW,uri));
            }
        });

        rld.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goLink("https://geographyhost.com/deodar-tree-the-wood-of-the-gods/");
            }

            private void goLink(String s) {
                Uri uri= Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW,uri));
            }
        });

        rlm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goLink("https://www.indiavideo.org/uttarakhand/travel/himalayan-blue-poppies-3916.php");
            }

            private void goLink(String s) {
                Uri uri= Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW,uri));
            }
        });

        rlo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goLink("https://www.researchgate.net/publication/242249207_Diversity_Of_Orchids_In_Uttarakhand_And_Their_Conservation_Strategy_With_Special_Reference_To_Their_Medicinal_Importance");
            }

            private void goLink(String s) {
                Uri uri= Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW,uri));
            }
        });

        rlp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goLink("https://en.wikipedia.org/wiki/Pinus_roxburghii#:~:text=Pinus%20roxburghii%2C%20commonly%20known%20as,roxburghii%20in%20Uttarakhand%2C%20India");
            }

            private void goLink(String s) {
                Uri uri= Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW,uri));
            }
        });

        rlsa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goLink("https://en.wikipedia.org/wiki/Shorea_robusta");
            }

            private void goLink(String s) {
                Uri uri= Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW,uri));
            }
        });

        rlsi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goLink("https://sites.google.com/site/efloraofindia/species/m---z/s/saxifragaceae/saxifraga/saxifraga-jacquemontiana");
            }

            private void goLink(String s) {
                Uri uri= Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW,uri));
            }
        });

        rlv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goLink("https://en.wikipedia.org/wiki/Engelhardia_spicata");
            }

            private void goLink(String s) {
                Uri uri= Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW,uri));
            }
        });

        getSupportActionBar().setTitle("FLORA");

    }
}