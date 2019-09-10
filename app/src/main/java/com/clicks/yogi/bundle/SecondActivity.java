package com.clicks.yogi.bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    Button button3;
    TextView textView3,textView4;
    Bundle Accept1,Accept2;
    String Receives1,Receives2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        button3 = (Button)findViewById(R.id.btn3);
        textView3 = (TextView)findViewById(R.id.txt3);
        textView4 = (TextView)findViewById(R.id.txt4);

        button3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

// Type 1 : Fetching data from firstActivity using Bundle
// storage class...

                Accept1 = getIntent().getExtras();
                textView3.setText(Accept1.getString("Value1"));
                Accept2 = getIntent().getExtras();
                textView4.setText(Accept2.getString("Value2"));

// Type 2 : Fetching data from firstActivity using String ...
/*
    Receives1 = getIntent().getExtras().getString("Value1");
    textView3.setText(Receives1);
    Receives2 = getIntent().getExtras().getString("Value2");
    textView4.setText(Receives2);
*/
            }
        });
    }
}