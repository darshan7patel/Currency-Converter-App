package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.util.Formatter;

public class MainActivity extends AppCompatActivity {

    Button euro, dollar, pound, yen, dinar, bitcoin, rubel, ausdollar, candollar;
    EditText editText;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        euro = findViewById(R.id.euro);
        dollar = findViewById(R.id.dollar);
        pound = findViewById(R.id.pound);
        yen = findViewById(R.id.yen);
        dinar = findViewById(R.id.dinar);
        bitcoin = findViewById(R.id.bitcoin);
        rubel = findViewById(R.id.rubel);
        ausdollar = findViewById(R.id.ausdollar);
        candollar = findViewById(R.id.candollar);
        editText = findViewById(R.id.editText);
        textView = findViewById(R.id.textView);

        euro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String z = editText.getText().toString();

                if(TextUtils.isEmpty(z))
                {
                    editText.setError("Empty User Input");
                }
                else
                {
                    Double ans,n;
                    n = Double.parseDouble(z);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    ans = n * 0.013;

                    DecimalFormat decimalFormat = new DecimalFormat("#.00");
                    textView.setText("" + decimalFormat.format(ans));
//                    textView.setText("" + ans);
                }
            }
        });

        dollar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String z = editText.getText().toString();

                if(TextUtils.isEmpty(z))
                {
                    editText.setError("Empty User Input");
                }
                else
                {
                    Double ans,n;
                    n = Double.parseDouble(z);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    ans = n * 0.014;

                    DecimalFormat decimalFormat = new DecimalFormat("#.00");
                    textView.setText("" + decimalFormat.format(ans));
//                    textView.setText("" + ans);
                }
            }
        });

        pound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String z = editText.getText().toString();

                if(TextUtils.isEmpty(z))
                {
                    editText.setError("Empty User Input");
                }
                else
                {
                    Double ans,n;
                    n = Double.parseDouble(z);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    ans = n * 0.011;

                    DecimalFormat decimalFormat = new DecimalFormat("#.00");
                    textView.setText("" + decimalFormat.format(ans));
//                    textView.setText("" + ans);
                }
            }
        });

        yen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String z = editText.getText().toString();

                if(TextUtils.isEmpty(z))
                {
                    editText.setError("Empty User Input");
                }
                else
                {
                    Double ans,n;
                    n = Double.parseDouble(z);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    ans = n * 1.51;

                    DecimalFormat decimalFormat = new DecimalFormat("#.00");
                    textView.setText("" + decimalFormat.format(ans));
//                    textView.setText("" + ans);
                }
            }
        });

        dinar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String z = editText.getText().toString();

                if(TextUtils.isEmpty(z))
                {
                    editText.setError("Empty User Input");
                }
                else
                {
                    Double ans,n;
                    n = Double.parseDouble(z);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    ans = n * 0.0043;

                    DecimalFormat decimalFormat = new DecimalFormat("#.00");
                    textView.setText("" + decimalFormat.format(ans));
//                    textView.setText("" + ans);
                }
            }
        });

        bitcoin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String z = editText.getText().toString();

                if(TextUtils.isEmpty(z))
                {
                    editText.setError("Empty User Input");
                }
                else
                {
                    Double ans,n;
                    n = Double.parseDouble(z);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    ans = n * 0.0000014;

                    DecimalFormat decimalFormat = new DecimalFormat("#.00");
                    textView.setText("" + decimalFormat.format(ans));
//                    textView.setText("" + ans);
                }
            }
        });

        rubel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String z = editText.getText().toString();

                if(TextUtils.isEmpty(z))
                {
                    editText.setError("Empty User Input");
                }
                else
                {
                    Double ans,n;
                    n = Double.parseDouble(z);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    ans = n * 0.90;

                    DecimalFormat decimalFormat = new DecimalFormat("#.00");
                    textView.setText("" + decimalFormat.format(ans));
//                    textView.setText("" + ans);
                }
            }
        });

        ausdollar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String z = editText.getText().toString();

                if(TextUtils.isEmpty(z))
                {
                    editText.setError("Empty User Input");
                }
                else
                {
                    Double ans,n;
                    n = Double.parseDouble(z);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    ans = n * 0.021;

                    DecimalFormat decimalFormat = new DecimalFormat("#.00");
                    textView.setText("" + decimalFormat.format(ans));
//                    textView.setText("" + ans);
                }
            }
        });

        candollar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String z = editText.getText().toString();

                if(TextUtils.isEmpty(z))
                {
                    editText.setError("Empty User Input");
                }
                else
                {
                    Double ans,n;
                    n = Double.parseDouble(z);
                    textView.setText(null);
                    Formatter formatter = new Formatter();
                    ans = n * 0.019;

                    DecimalFormat decimalFormat = new DecimalFormat("#.00");
                    textView.setText("" + decimalFormat.format(ans));
//                    textView.setText("" + ans);
                }
            }
        });

    }
}
