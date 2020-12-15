package com.example.harshitrajpal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    Button add_button;
    TextView a,b,sum;
    double add=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        a=(TextView)findViewById(R.id.num1);
        b=(TextView)findViewById(R.id.num2);
        add_button=(Button) findViewById(R.id.add_button);
        sum=(TextView)findViewById(R.id.sum);

        add_button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                sum.setText(Double.toString(returnValue()));
            }
        });
    }
    double returnValue(){
        double a1 = 10;
        double b1 = 50;
        add= a1 + b1;
        return add;
    }
}