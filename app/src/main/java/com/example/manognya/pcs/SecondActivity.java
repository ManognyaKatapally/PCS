package com.example.manognya.pcs;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class SecondActivity extends Activity {
    private ImageView sync;
    private ImageView add;
    private ImageView tax;
    private ImageView search;

    private TextView T;
    private TextView Tname;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_second);
         add = (ImageView) findViewById(R.id.imgadd);
         tax = (ImageView) findViewById(R.id.imgtax);
         search= (ImageView) findViewById(R.id.imgsearch);
         sync= (ImageView) findViewById(R.id.imgsync);
        T=(TextView)findViewById(R.id.tvuser);
        T.setText(""+getIntent().getExtras().getString("desig"));
        Tname=(TextView)findViewById(R.id.tvdesig);
        Tname.setText(""+getIntent().getExtras().getString("user"));
       add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this, map.class);
                startActivity(intent);


            }

            });
        tax.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this, tax.class);
                startActivity(intent);


            }

        });
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this, map.class);
                startActivity(intent);


            }

        });
        sync.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this, map.class);
                startActivity(intent);


            }

        });

    }
}
