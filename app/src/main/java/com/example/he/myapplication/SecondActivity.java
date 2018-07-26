package com.example.he.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView T1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        T1 = (TextView)findViewById(R.id.t2);
        Bundle bundle = getIntent().getExtras();
       String s1 =  bundle.getString("msg");
       T1.setText(s1);
    }
}
