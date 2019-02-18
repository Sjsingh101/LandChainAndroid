package com.simranjeet.landchain;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SignupActivity extends AppCompatActivity {

    EditText et1,et2;
    Button btn;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);


        et1=findViewById(R.id.Uid);
        et2=findViewById(R.id.Password);
        btn=findViewById(R.id.btn);
        tv=findViewById(R.id.link_signup);
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(intent);
            }
        });
        // et5=findViewById(R.id.Otp);
        // bt1=findViewById(R.id.btn1);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent indeIntent = new Intent(SignupActivity.this,MainActivity.class);
                indeIntent.putExtra("Flag","0");
                indeIntent.putExtra("Uid",et1.toString());
                indeIntent.putExtra("Password",et2.toString());
                startActivity(indeIntent);
            }
        });
    }
}
