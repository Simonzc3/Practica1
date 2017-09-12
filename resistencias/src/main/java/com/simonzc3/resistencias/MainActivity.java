package com.simonzc3.resistencias;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Spinner sPrimer, sSegundo, sMult, sTol;
    private String primer, segundo, tol;
    double mult,res;
    private TextView tinfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sPrimer = (Spinner) findViewById(R.id.sPrimer);
        sSegundo = (Spinner) findViewById(R.id.sSegundo);
        sMult = (Spinner) findViewById(R.id.sMult);
        sTol = (Spinner) findViewById(R.id.sTol);
        tinfo = (TextView) findViewById(R.id.tInfo);

// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this,
                R.array.Banda12, android.R.layout.simple_spinner_item);
// Specify the layout to use when the list of choices appears
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        sPrimer.setAdapter(adapter1);
        sSegundo.setAdapter(adapter1);

        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this,
                R.array.Banda3, android.R.layout.simple_spinner_item);
// Specify the layout to use when the list of choices appears
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        sMult.setAdapter(adapter2);

        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter3 = ArrayAdapter.createFromResource(this,
                R.array.Banda4, android.R.layout.simple_spinner_item);
// Specify the layout to use when the list of choices appears
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        sTol.setAdapter(adapter3);

        sPrimer.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                primer = String.valueOf(i);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


        sSegundo.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                segundo = String.valueOf(i);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        sMult.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                mult = Math.pow(10,i);
                if(i==10){mult = 0.1;}
                else if(i==11){mult=0.01;}
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        sTol.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Log.d("cuales",String.valueOf(i));
                switch(i) {
                    case 0:
                        tol = "1%";
                        break;
                    case 1:
                        tol = "2%";
                        break;
                    case 2:
                        tol = "5%";
                        break;
                    case 3:
                        tol = "10%";
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });




    }

    public void Calcular(View view) {
        res=Double.parseDouble(primer+segundo)*mult;
        tinfo.setText(Double.toString(res)+"Ohms"+"\n Tolerancia: "+tol);


    }
    }

