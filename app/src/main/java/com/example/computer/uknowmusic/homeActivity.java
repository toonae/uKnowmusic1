package com.example.computer.uknowmusic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class homeActivity extends AppCompatActivity {

    Button startbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        startbtn=findViewById(R.id.b1);
        startbtn=findViewById(R.id.b2);
        startbtn=findViewById(R.id.b3);
        startbtn=findViewById(R.id.b4);

        startbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent starIntent = new Intent(homeActivity.this, GameActivity.class);
                startActivity(starIntent);
            }
        });





    }
}
