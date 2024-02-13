package com.firstapp.mobileshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText name,pass;
    private Button but;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=findViewById(R.id.editTextText);
        pass=findViewById(R.id.editTextTextPassword);
        but=findViewById(R.id.button);
        Bundle bundle=new Bundle();
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username=name.getText().toString();
                String password=pass.getText().toString();
                Intent i=new Intent(MainActivity.this,SecondActivity.class);
                bundle.putString("keyName",username);
                bundle.putString("keyPass",password);
                i.putExtras(bundle);
                i.putExtra("keyName",username);
                i.putExtra("keyPass",password);
                startActivity(i);
            }
        });

    }
}