package com.example.he.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.net.URL;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    String[] names;
    int imageResource[] = {R.drawable.diaolong,R.drawable.zhafupi,R.drawable.sanhuazhi,R.drawable.niurouwan,R.drawable.xiongkouyou,R.drawable.nenniurou};

    MyOwnAdapter ad ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView)findViewById(R.id.recycler);
        names = getResources().getStringArray(R.array.names);
        ad= new MyOwnAdapter(this,names,imageResource);
        recyclerView.setAdapter(ad);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    public void openMap(View view) {
        Intent intent= new Intent(Intent.ACTION_VIEW, Uri.parse("geo:40.04,116.34"));
        startActivity(intent);
    }

    public void openCall(View view) {
        Intent intent= new Intent(Intent.ACTION_VIEW, Uri.parse("tel:62959199"));
        startActivity(intent);
    }
}
