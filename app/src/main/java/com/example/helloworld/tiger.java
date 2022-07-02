package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class tiger extends AppCompatActivity {


    Button but;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tiger);

        but =findViewById(R.id.b5);
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goLink("https://www.euttaranchal.com/tourism-theme/tiger-reserve-99.php#:~:text=Uttarakhand%20is%20land%20to%20a,the%20Tiger%20Reserves%20of%20Uttarakhand.");
            }

            private void goLink(String s) {
                Uri uri= Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW,uri));
            }
        });
        getSupportActionBar().setTitle("TIGER");
    }
}