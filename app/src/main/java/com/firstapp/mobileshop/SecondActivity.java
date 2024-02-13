package com.firstapp.mobileshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class SecondActivity extends AppCompatActivity {
    private TextView name;
    private Button btn,back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        name=findViewById(R.id.textView);
        btn=findViewById(R.id.button2);
        back=findViewById(R.id.button3);
        Bundle bundle=getIntent().getExtras();
        Bundle pack =new Bundle();

       String userName=bundle.getString("keyName");
       String passWord=bundle.getString("keyPass");
        String Name=new String("pavish");
        String Pass=new String("Pavish");
        boolean find=false;
        if(Pass.equals(passWord))
        {
            name.setText("User : "+userName);
            find=true;
            Toast.makeText(SecondActivity.this,"Ciick Home to Go!",Toast.LENGTH_LONG).show();
        }
        else {
            Toast.makeText(SecondActivity.this,"Invalid Login Info",Toast.LENGTH_LONG).show();
            name.setText("InValid Login Info.");
            find=false;
        }

        if (find)
        {
            btn.setOnClickListener(new View.OnClickListener()
            {
                public void onClick(View view) {
                    Intent i=new Intent(SecondActivity.this,ThirdActivity.class);
                    pack.putString("key_user",userName);
                    i.putExtras(pack);
                    i.putExtra("key_user",userName);
                    Toast.makeText(SecondActivity.this,"Openeing Home",Toast.LENGTH_SHORT).show();
                    startActivity(i);

                }

            });

        }
        else {
            btn.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Toast.makeText(SecondActivity.this, "Please Relogin press back.", Toast.LENGTH_SHORT).show();

                }
            });
        }
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in =new Intent(SecondActivity.this,MainActivity.class);
                startActivity(in);
                finish();
            }
        });

    }
}