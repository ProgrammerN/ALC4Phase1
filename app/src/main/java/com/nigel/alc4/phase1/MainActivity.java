package com.nigel.alc4.phase1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button mActivityB = findViewById(R.id.btn_about_alc);
        mActivityB.setOnClickListener(this);
        Button mActivityC = findViewById(R.id.btn_my_profile);
        mActivityC.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {

        if( view.getId() == R.id.btn_about_alc){

            startActivity(new Intent(this, AboutALCActivity.class));

        }

        if( view.getId() == R.id.btn_my_profile){

            startActivity(new Intent(this,MyProfileActivity.class));
        }

    }
}
