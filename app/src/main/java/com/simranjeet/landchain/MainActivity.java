package com.simranjeet.landchain;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity {

    private TextView mTextMessage,mTextMessage1,mTextMessage2;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.land_owned:
                    l1.setVisibility(View.VISIBLE);
                    l2.setVisibility(View.INVISIBLE);
                    l3.setVisibility(View.INVISIBLE);
                    l4.setVisibility(View.INVISIBLE);
                    l5.setVisibility(View.INVISIBLE);
                    return true;
                case R.id.land_trans:
                    l1.setVisibility(View.INVISIBLE);
                    l2.setVisibility(View.VISIBLE);
                    l3.setVisibility(View.INVISIBLE);
                    l4.setVisibility(View.INVISIBLE);
                    l5.setVisibility(View.INVISIBLE);
                    return true;
                case R.id.new_land:
                    l1.setVisibility(View.INVISIBLE);
                    l2.setVisibility(View.INVISIBLE);
                    l3.setVisibility(View.VISIBLE);
                    l4.setVisibility(View.INVISIBLE);
                    l5.setVisibility(View.INVISIBLE);
                    return true;
                case R.id.profile:
                    l1.setVisibility(View.INVISIBLE);
                    l2.setVisibility(View.INVISIBLE);
                    l3.setVisibility(View.INVISIBLE);
                    l4.setVisibility(View.VISIBLE);
                    l5.setVisibility(View.INVISIBLE);
                    return true;
                case R.id.land_reg:
                    l1.setVisibility(View.INVISIBLE);
                    l2.setVisibility(View.INVISIBLE);
                    l3.setVisibility(View.INVISIBLE);
                    l4.setVisibility(View.INVISIBLE);
                    l5.setVisibility(View.VISIBLE);
                    return true;
            }
            return false;
        }
    };


     RequestQueue mRequestQueue;
     StringRequest mStringRequest;
     String url = "http://www.mocky.io/v2/5c6974c0370000ca0707fd51";
    ViewGroup l1,l2,l3,l4,l5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      /*  FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("land-chain");

        // Read from the database
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
          String value=null;
              for(DataSnapshot ds :dataSnapshot.getChildren())
              {
                  for(DataSnapshot ds1 :ds.getChildren()){
                      value=ds1.getValue().toString();
                  }
              }
                Log.d("Firebase", "Value is: " + value.toString());
                Toast.makeText(MainActivity.this,value.toString(),Toast.LENGTH_LONG).show();
            }

            @Override
            public void onCancelled(DatabaseError error) {
                // Failed to read value
                Log.w("Firebase", "Failed to read value.", error.toException());
                Toast.makeText(MainActivity.this,"FAlse",Toast.LENGTH_LONG).show();
            }
        });
*/


       // mRequestQueue = Volley.newRequestQueue(this);
     /*   mStringRequest = new StringRequest(Request.Method.GET, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {

              //  Toast.makeText(getApplicationContext(),"Response :" + response.toString(), Toast.LENGTH_LONG).show();//display the response on screen
                mTextMessage.setText(response.toString());
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

                Log.i(" TAG MSG","Error :" + error.toString());
            }
        });*/

        String a,b,c,d;
        Intent intent = getIntent();

  /*      if (Integer.parseInt(intent.getStringExtra("Flag"))==0){
            a=intent.getStringExtra("Uid");
            b=intent.getStringExtra("Password");
        }
        else
        {
            a=intent.getStringExtra("Uid");
            b=intent.getStringExtra("Password");
            c=intent.getStringExtra("name");

            d=intent.getStringExtra("Phone");
        }*/


//        mRequestQueue.add(mStringRequest);


       // mTextMessage = (TextView) findViewById(R.id.message);
      /*  mTextMessage1 = (TextView) findViewById(R.id.message1);
        mTextMessage2 = (TextView) findViewById(R.id.message2);*/
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        l1=findViewById(R.id.id1);
        l2=findViewById(R.id.id2);
        l3=findViewById(R.id.id3);
        l4=findViewById(R.id.id4);
        l5=findViewById(R.id.id5);






    }

}
