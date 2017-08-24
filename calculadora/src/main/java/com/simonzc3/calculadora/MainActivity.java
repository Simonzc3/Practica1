package com.simonzc3.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, bpt, bPor, bDiv, bIgual, bMas, bMenos;
    private TextView Tv;
    private String tx = "", op = "=";
    private double res = 0, op1 = 0;
    private int fmas = 0, fmenos = 0, fmult = 0, fdiv = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b0 = (Button) findViewById(R.id.b0);
        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);
        b4 = (Button) findViewById(R.id.b4);
        b5 = (Button) findViewById(R.id.b5);
        b6 = (Button) findViewById(R.id.b6);
        b7 = (Button) findViewById(R.id.b7);
        b8 = (Button) findViewById(R.id.b8);
        b9 = (Button) findViewById(R.id.b9);
        bpt = (Button) findViewById(R.id.bPunto);
        bPor = (Button) findViewById(R.id.bPor);
        bDiv = (Button) findViewById(R.id.bDiv);
        bIgual = (Button) findViewById(R.id.bIgual);
        bMas = (Button) findViewById(R.id.bMas);
        bMenos = (Button) findViewById(R.id.bMenos);
        Tv = (TextView) findViewById(R.id.Tv);
    }

    public void Div(View view) {
        if (fdiv == 0) {

            if (tx == "") {
                op1 = 0;
            } else {
                op1 = Double.parseDouble(tx);
            }
            tx = "";
            switch (op) {
                case "+":
                    res = res + op1;
                    break;
                case "-":
                    res = res - op1;
                    break;
                case "*":
                    res = res * op1;
                    break;
                case "/":
                    res = res / op1;
                    break;
                default:
                    res = res + op1;
            }
            op = "/";
            if (res == (int) res) {
                Tv.setText(String.valueOf((int) res));
            } else {
                Tv.setText(String.valueOf(res));
            }
        }
    }

    public void Mult(View view) {

        if (fmult == 0) {
            op1 = Double.parseDouble(tx);
            if (tx == "") {
                op1 = 0;
            } else {
                op1 = Double.parseDouble(tx);
            }
            tx = "";
            switch (op) {
                case "+":
                    res = res + op1;
                    break;
                case "-":
                    res = res - op1;
                    break;
                case "*":
                    res = res * op1;
                    break;
                case "/":
                    res = res / op1;
                    break;
                default:
                    res = res + op1;
            }
            op = "*";
            if (res == (int) res) {
                Tv.setText(String.valueOf((int) res));
            } else {
                Tv.setText(String.valueOf(res));
            }
        }
    }

    public void Menos(View view) {
        if (fmenos == 0) {
            if (tx == "") {
                op1 = 0;
            } else {
                op1 = Double.parseDouble(tx);
            }
            switch (op) {
                case "+":
                    res = res + op1;
                    break;
                case "-":
                    res = res - op1;
                    break;
                case "*":
                    res = res * op1;
                    break;
                case "/":
                    res = res / op1;
                    break;
                default:
                    res = res + op1;
            }
            op = "-";
            if (res == (int) res) {
                Tv.setText(String.valueOf((int) res));
            } else {
                Tv.setText(String.valueOf(res));
            }
            tx = "";
        }
    }

    public void Mas(View view) {

        if (fmas == 0) {
            if (tx == "") {
                op1 = 0;
            } else {
                op1 = Double.parseDouble(tx);
            }
            tx = "";

            switch (op) {
                case "+":
                    res = res + op1;
                    break;
                case "-":
                    res = res - op1;
                    break;
                case "*":
                    res = res * op1;
                    break;
                case "/":
                    res = res / op1;
                    break;
                default:
                    res = res + op1;
            }

            if (res == (int) res) {
                Tv.setText(String.valueOf((int) res));
            } else {
                Tv.setText(String.valueOf(res));
            }
            fmas = 1;
            op = "+";
        }
    }

    public void Igual(View view) {
        if (op != "=") {
            if ((tx == "") | (op == ".")) {
                op1 = 0;
            } else {
                op1 = Double.parseDouble(tx);
            }
            tx = "";
            switch (op) {
                case "+":
                    res = res + op1;
                    break;
                case "-":
                    res = res - op1;
                    break;
                case "*":
                    res = res * op1;
                    break;
                case "/":
                    res = res / op1;
                    break;
                default:
                    res = res + op1;
            }
            op = "=";
            if (res == (int) res) {
                Tv.setText(String.valueOf((int) res));
            } else {
                Tv.setText(String.valueOf(res));
            }
            op1 = 0;
            res = 0;
        }

    }

    public void bt6(View view) {
        tx = tx + "6";
        Tv.setText(tx);
        fmas = 0;
        fmenos = 0;
        fmult = 0;
        fdiv = 0;
    }

    public void bt9(View view) {
        tx = tx + "9";
        Tv.setText(tx);
        fmas = 0;
        fmenos = 0;
        fmult = 0;
        fdiv = 0;
    }

    public void bt0(View view) {
        tx = tx + "0";
        Tv.setText(tx);
        fmas = 0;
        fmenos = 0;
        fmult = 0;
        fdiv = 0;
    }

    public void bt2(View view) {
        tx = tx + "2";
        Tv.setText(tx);
        fmas = 0;
        fmenos = 0;
        fmult = 0;
        fdiv = 0;
    }

    public void bt5(View view) {
        tx = tx + "5";
        Tv.setText(tx);
        fmas = 0;
        fmenos = 0;
        fmult = 0;
        fdiv = 0;
    }

    public void bt8(View view) {
        tx = tx + "8";
        Tv.setText(tx);
        fmas = 0;
        fmenos = 0;
        fmult = 0;
        fdiv = 0;
    }

    public void btp(View view) {
        if (op != ".") {
            tx = tx + ".";
            Tv.setText(tx);
            op = ".";
        }
    }

    public void bt1(View view) {
        tx = tx + "1";
        Tv.setText(tx);
        fmas = 0;
        fmenos = 0;
        fmult = 0;
        fdiv = 0;
    }

    public void bt4(View view) {
        tx = tx + "4";
        Tv.setText(tx);
        fmas = 0;
        fmenos = 0;
        fmult = 0;
        fdiv = 0;
    }

    public void bt7(View view) {
        tx = tx + "7";
        Tv.setText(tx);
        fmas = 0;
        fmenos = 0;
        fmult = 0;
        fdiv = 0;
    }

    public void bt3(View view) {
        tx = tx + "3";
        Tv.setText(tx);
        fmas = 0;
        fmenos = 0;
        fmult = 0;
        fdiv = 0;
    }
}
