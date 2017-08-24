package com.simonzc3.figuras;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private RadioButton rCuadro, rCirculo, rTriangulo, rCubo;
    private TextView tLado,tRadio,tLado3,res;
    private EditText eLado,eLado3 ,eRadio;
    private Button cal;
    private double op1=0,op2=0,op3=0,per=0,area=0,vol=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rCuadro=(RadioButton)findViewById(R.id.rCuadro);
        rCirculo=(RadioButton)findViewById(R.id.rCirculo);
        rTriangulo=(RadioButton) findViewById(R.id.rTriangulo);
        rCubo=(RadioButton)findViewById(R.id.rCubo);
        tLado=(TextView) findViewById(R.id.tvLado);
        tRadio=(TextView)findViewById(R.id.tvRadio);
        tLado3=(TextView) findViewById(R.id.tLado3);
        res=(TextView)findViewById(R.id.tInfo);
        eLado=(EditText)findViewById(R.id.eLado);
        eRadio=(EditText)findViewById(R.id.eRadio);
        cal=(Button) findViewById(R.id.bCalcular);
        eLado3=(EditText)findViewById(R.id.eLado3);

    }

    public void calcular(View view) {
        if(rCubo.isChecked()){
            op1=Double.parseDouble(eLado.getText().toString());
            vol=op1*op1*op1;
            per=12*op1;
            area=6*(op1*op1);
            res.setText("Perímetro="+ String.valueOf(per) + "\nÁrea="+String.valueOf(area) + "\nVolúmen="+ String.valueOf(vol));
        }
        if(rTriangulo.isChecked()){
            op1=Double.parseDouble(eLado.getText().toString());
            op2=Double.parseDouble(eRadio.getText().toString());
            op3=Double.parseDouble(eLado3.getText().toString());
            per=(op1+op2+op3)/2;
            area=Math.sqrt((per*(per-op1)*(per-op2)*(per-op3)));
            per=2*per;
            res.setText("Perímetro="+ String.valueOf(per) + "\nÁrea="+String.valueOf(area));
        }

        if(rCirculo.isChecked()){
            op1=Double.parseDouble(eRadio.getText().toString());
            per=Math.PI*2*op1;
            area=Math.PI*op1*op1;
            res.setText("Perímetro="+ String.valueOf(per) + "\nÁrea="+String.valueOf(area));
        }

        if(rCuadro.isChecked()){
            op1=Double.parseDouble(eLado.getText().toString());
            per=4*op1;
            area=op1*op1;
            res.setText("Perímetro="+ String.valueOf(per) + "\nÁrea="+String.valueOf(area));
        }
    }

    public void cuadro(View view) {
        tLado.setText(R.string.lado);
        tLado.setVisibility(View.VISIBLE);
        eLado.setVisibility(View.VISIBLE);
        tRadio.setVisibility(View.GONE);
        eRadio.setVisibility(View.GONE);
        tLado3.setVisibility(View.GONE);
        eLado3.setVisibility(View.GONE);
    }

    public void circulo(View view) {
        tRadio.setText(R.string.radio);
        tLado.setVisibility(View.GONE);
        eLado.setVisibility(View.GONE);
        tRadio.setVisibility(View.VISIBLE);
        eRadio.setVisibility(View.VISIBLE);
        tLado3.setVisibility(View.GONE);
        eLado3.setVisibility(View.GONE);
    }

    public void triangulo(View view) {
        tLado.setText(R.string.lado);
        tRadio.setText(R.string.lado2);
        tLado.setVisibility(View.VISIBLE);
        eLado.setVisibility(View.VISIBLE);
        tRadio.setVisibility(View.VISIBLE);
        eRadio.setVisibility(View.VISIBLE);
        tLado3.setVisibility(View.VISIBLE);
        eLado3.setVisibility(View.VISIBLE);
    }

    public void cubo(View view) {
        tLado.setText(R.string.lado);
        tLado.setVisibility(View.VISIBLE);
        eLado.setVisibility(View.VISIBLE);
        tRadio.setVisibility(View.GONE);
        eRadio.setVisibility(View.GONE);
        tLado3.setVisibility(View.GONE);
        eLado3.setVisibility(View.GONE);
    }
}
