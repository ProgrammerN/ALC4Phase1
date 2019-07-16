package com.nigel.alc4.phase1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MyProfileActivity extends AppCompatActivity {

    TextView mTrack;
    TextView mCountry;
    TextView mEmail;
    TextView mPhone;
    TextView mSlackUsername;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_profile);

        mTrack = findViewById(R.id.tv_track);
        mCountry = findViewById(R.id.tv_country);
        mEmail = findViewById(R.id.tv_email);
        mPhone = findViewById(R.id.tv_phone);
        mSlackUsername = findViewById(R.id.tv_slack_username);

        mTrack.setText("Android");
        mCountry.setText("Zimbabwe");
        mEmail.setText("nigelchomba90@gmail.com");
        mPhone.setText("+27 840 928225");
        mSlackUsername.setText("@Nigel");
    }
}
