package com.example.myeongsic.howllogin;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class NextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        TextView textView = (TextView)findViewById(R.id.user_name);

        textView.setText(getIntent().getStringExtra("id"));
    }
}
