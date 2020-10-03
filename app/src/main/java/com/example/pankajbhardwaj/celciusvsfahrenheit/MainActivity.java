package com.example.pankajbhardwaj.celciusvsfahrenheit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = (Button) findViewById(R.id.ftoc);
        Button btnn = (Button) findViewById(R.id.ctof);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("myApp","Inside on click function");
                int ans = 0;
                EditText etxt = (EditText) findViewById(R.id.editText);
                int f = Integer.parseInt(etxt.getText().toString());
                double c = (f - 32) * 5 / 9.0;
                TextView txt = (TextView) findViewById(R.id.rlt);
                txt.setText(String.format("%.3f",c));
            }
        });
        btnn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("myApp","Inside on click function");
                int ans = 0;
                EditText etxt = (EditText) findViewById(R.id.editText);
                int c = Integer.parseInt(etxt.getText().toString());
                double f = 1.8 * c + 32;
                TextView temp = (TextView) findViewById(R.id.rlt);
                temp.setText(String.format("%.3f",f));
            }
        });
    }
}
