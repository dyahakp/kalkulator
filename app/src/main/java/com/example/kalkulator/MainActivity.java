package com.example.kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public Button sin,cos,tan,sec,ctgn,log,cosec;
    private TextView hasil;
    private EditText input;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sin = findViewById(R.id.sin);
        cos =findViewById(R.id.cos);
        tan = findViewById(R.id.tan);
        sec = findViewById(R.id.sec);
        ctgn = findViewById(R.id.ctgn);
        log = findViewById(R.id.log);
        cosec = findViewById(R.id.cosec);
        input = findViewById(R.id.input);
        hasil = findViewById(R.id.hasil);

        sin.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                try {
                    String sInput = input.getText().toString();
                    double dInput = Double.parseDouble(sInput);
                    double result = Math.sin(dInput);
                    String sResult = String.valueOf(result);
                    hasil.setText(sResult);
                } catch (NumberFormatException ex) {
                    Toast.makeText(getApplicationContext(), "Field input tidak boleh kosong", Toast.LENGTH_SHORT).show();
                }
            }
        });
        cos.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                try {
                    String sInput = input.getText().toString();
                    double dInput = Double.parseDouble(sInput);
                    double result = Math.cos(dInput);
                    String sResult = String.valueOf(result);
                    hasil.setText(sResult);
                } catch (NumberFormatException ex) {
                    Toast.makeText(getApplicationContext(), "Field input tidak boleh kosong", Toast.LENGTH_SHORT).show();
                }
            }
        });
        sec.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                try {
                    String sInput = input.getText().toString();
                    double dInput = Double.parseDouble(sInput);
                    double result = 1.0/Math.cos(dInput);
                    String sResult = String.valueOf(result);
                    hasil.setText(sResult);
                } catch (NumberFormatException ex) {
                    Toast.makeText(getApplicationContext(), "Field input tidak boleh kosong", Toast.LENGTH_SHORT).show();
                }
            }
        });
        tan.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                try {
                    String sInput = input.getText().toString();
                    double dInput = Double.parseDouble(sInput);
                    double result = Math.tan(dInput);
                    String sResult = String.valueOf(result);
                    hasil.setText(sResult);
                } catch (NumberFormatException ex) {
                    Toast.makeText(getApplicationContext(), "Field input tidak boleh kosong", Toast.LENGTH_SHORT).show();
                }
            }
        });
        cosec.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                try {
                    String sInput = input.getText().toString();
                    double dInput = Double.parseDouble(sInput);
                    double result = 1.0/Math.sin(dInput);
                    String sResult = String.valueOf(result);
                    hasil.setText(sResult);
                } catch (NumberFormatException ex) {
                    Toast.makeText(getApplicationContext(), "Field input tidak boleh kosong", Toast.LENGTH_SHORT).show();
                }
            }
        });
        ctgn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                try {
                    String sInput = input.getText().toString();
                    double dInput = Double.parseDouble(sInput);
                    double result = 1.0/Math.tan(dInput);
                    String sResult = String.valueOf(result);
                    hasil.setText(sResult);
                } catch (NumberFormatException ex) {
                    Toast.makeText(getApplicationContext(), "Field input tidak boleh kosong", Toast.LENGTH_SHORT).show();
                }
            }
        });
        log.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                try {
                    String sInput = input.getText().toString();
                    double dInput = Double.parseDouble(sInput);
                    double result = Math.log10(dInput);
                    String sResult = String.valueOf(result);
                    hasil.setText(sResult);
                } catch (NumberFormatException ex) {
                    Toast.makeText(getApplicationContext(), "Field input tidak boleh kosong", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
