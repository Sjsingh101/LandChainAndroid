package com.simranjeet.landchain;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    EditText et1,et2,et3,et4,et5;
    Button btn,bt1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);


        et1=findViewById(R.id.name);
        et2=findViewById(R.id.Phone);
        et3=findViewById(R.id.Uid);
        et4=findViewById(R.id.Password);
        btn=findViewById(R.id.btn);
       // et5=findViewById(R.id.Otp);
       // bt1=findViewById(R.id.btn1);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent indeIntent = new Intent(LoginActivity.this,MainActivity.class);
                indeIntent.putExtra("Flag","1");
                indeIntent.putExtra("Uid",et3.toString());
                indeIntent.putExtra("Password",et4.toString());
                indeIntent.putExtra("name",et1.toString());
                indeIntent.putExtra("Phone",et2.toString());
                startActivity(indeIntent);
            }
        });

    }
}
