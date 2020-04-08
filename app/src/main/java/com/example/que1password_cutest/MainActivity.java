package com.example.que1password_cutest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static android.widget.Toast.makeText;

public class MainActivity extends AppCompatActivity  {

    EditText et1, et2;
    Button Gen;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = findViewById(R.id.name);
        et2 = findViewById(R.id.room);
        Gen = findViewById(R.id.gen);
        tv = findViewById(R.id.tview);
        Gen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a = et1.getText().toString();
                String u = getunit(a);
                String tens = getten(et2.getText().toString());
                String hund = gethund(et2.getText().toString());
                tv.setText(hund+tens+u);
            }
        });
    }


            public String gethund(String a) {
                int sum = (Integer.parseInt(a));
                if (sum == 0) {
                    sum = sum + 1;
                }

                return String.valueOf(sum);
            }

            public String getunit(String a) {
                int i = a.length();
                int ascii = 96 + i;
                String s = new Character((char) ascii).toString();
                return s;
            }


            public String getten(String a) {

                int b = sumno(Integer.parseInt(a));

                return String.valueOf(b);
            }


    public int sumno(int i) {
        int c = 0;
        while (c!=0){
            c = c + i % 10;
            c = c/10;
        }

        return i;
    }

}

