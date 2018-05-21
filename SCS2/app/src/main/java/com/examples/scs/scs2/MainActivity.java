package com.examples.scs.scs2;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button0 = findViewById(R.id.button0);
        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);
        Button button4 = findViewById(R.id.button4);
        Button button5 = findViewById(R.id.button5);
        Button button6 = findViewById(R.id.button6);
        Button button7 = findViewById(R.id.button7);
        Button button8 = findViewById(R.id.button8);
        Button button9 = findViewById(R.id.button9);
        Button buttonDel = findViewById(R.id.buttonDel);
        Button buttonDot = findViewById(R.id.buttonDot);
        Button buttonPlus = findViewById(R.id.buttonPlus);
        Button buttonMinus = findViewById(R.id.buttonMinus);
        Button buttonMultiply = findViewById(R.id.buttonMultiply);
        Button buttonDivide = findViewById(R.id.buttonDivide);
        Button buttonEquals = findViewById(R.id.buttonEquals);
        final TextView result = findViewById(R.id.result);

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String actual = result.getText().toString();
                actual = actual.concat("0");
                result.setText(actual);
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String actual = result.getText().toString();
                actual = actual.concat("1");
                result.setText(actual);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String actual = result.getText().toString();
                actual = actual.concat("2");
                result.setText(actual);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String actual = result.getText().toString();
                actual = actual.concat("3");
                result.setText(actual);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String actual = result.getText().toString();
                actual = actual.concat("4");
                result.setText(actual);
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String actual = result.getText().toString();
                actual = actual.concat("5");
                result.setText(actual);
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String actual = result.getText().toString();
                actual = actual.concat("6");
                result.setText(actual);
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String actual = result.getText().toString();
                actual = actual.concat("7");
                result.setText(actual);
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String actual = result.getText().toString();
                actual = actual.concat("8");
                result.setText(actual);
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String actual = result.getText().toString();
                actual = actual.concat("9");
                result.setText(actual);
            }
        });
        buttonDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String actual = result.getText().toString();
                if (!actual.contains(".")){
                    actual = actual.concat(".");
                    result.setText(actual);
                }
            }
        });

        buttonDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String actual = result.getText().toString();
                if (actual.length() > 0) {
                    actual = actual.substring(0, actual.length() - 1);
                    result.setText(actual);
                }
            }
        });

        buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String actual = result.getText().toString();
                Pattern patt = Pattern.compile("[-+]?[0-9]*\\.?[0-9]+([eE][-+]?[0-9]+)?");
                Matcher matcher = patt.matcher(actual);
                if (matcher.matches()){
                    actual = actual.concat("+");
                    result.setText(actual);
                }
            }
        });
        buttonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String actual = result.getText().toString();
                Pattern patt = Pattern.compile("[-+]?[0-9]*\\.?[0-9]+([eE][-+]?[0-9]+)?");
                Matcher matcher = patt.matcher(actual);
                if (matcher.matches()){
                    actual = actual.concat("-");
                    result.setText(actual);
                }
            }
        });
        buttonMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String actual = result.getText().toString();
                Pattern patt = Pattern.compile("[-+]?[0-9]*\\.?[0-9]+([eE][-+]?[0-9]+)?");
                Matcher matcher = patt.matcher(actual);
                if (matcher.matches()){
                    actual = actual.concat("*");
                    result.setText(actual);
                }
            }
        });
        buttonDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String actual = result.getText().toString();
                Pattern patt = Pattern.compile("[-+]?[0-9]*\\.?[0-9]+([eE][-+]?[0-9]+)?");
                Matcher matcher = patt.matcher(actual);
                if (matcher.matches()){
                    actual = actual.concat("/");
                    result.setText(actual);
                }
            }
        });
        buttonEquals.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                String actual = result.getText().toString();
                if (actual.contains("+")){
                    String[] values = actual.split("\\+");
                    double firstValue = Double.parseDouble(values[0]);
                    double secondValue = Double.parseDouble(values[1]);
                    double resultValue = firstValue + secondValue;
                    result.setText(Double.toString(resultValue));
                }
                if (actual.contains("-")){
                    String[] values = actual.split("\\+");
                    double firstValue = Double.parseDouble(values[0]);
                    double secondValue = Double.parseDouble(values[1]);
                    double resultValue = firstValue - secondValue;
                    result.setText(Double.toString(resultValue));
                }
                if (actual.contains("*")){
                    String[] values = actual.split("\\*");
                    double firstValue = Double.parseDouble(values[0]);
                    double secondValue = Double.parseDouble(values[1]);
                    double resultValue = firstValue * secondValue;
                    result.setText(Double.toString(resultValue));
                }
                if (actual.contains("/")){
                    String[] values = actual.split("/");
                    double firstValue = Double.parseDouble(values[0]);
                    double secondValue = Double.parseDouble(values[1]);
                    double resultValue = firstValue / secondValue;
                    result.setText(Double.toString(resultValue));
                }
            }
        });

    }
}
