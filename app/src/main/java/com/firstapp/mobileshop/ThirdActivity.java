package com.firstapp.mobileshop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class ThirdActivity extends AppCompatActivity {
    private TextView display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        display=findViewById(R.id.textView4);
        Bundle bundle=getIntent().getExtras();
        String Name=bundle.getString("key_user");
        display.setText(Name);
        Toast.makeText(getApplicationContext(),"Welcome back,"+Name,Toast.LENGTH_LONG).show();

    }
}