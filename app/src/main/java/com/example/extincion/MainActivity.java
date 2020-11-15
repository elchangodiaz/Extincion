package com.example.extincion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.telephony.PhoneNumberFormattingTextWatcher;
import android.telephony.PhoneNumberUtils;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.lang.ref.SoftReference;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    Button b1;
    Button b2;
    Button b3;
    Button b4;
    Button b5;
    Button b6;
    Button b7;
    Button b8;
    Button b9;
    Button b0;
    Button btnAs;
    Button btnG;
    Button btnCall;
    Button btnDel;
    Button btnClear;
    EditText editText;
    String lastChar = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText=(EditText)findViewById(R.id.edit_Text);
        b0=(Button)findViewById(R.id.n0);
        b1=(Button)findViewById(R.id.n1);
        b2=(Button)findViewById(R.id.n2);
        b3=(Button)findViewById(R.id.n3);
        b4=(Button)findViewById(R.id.n4);
        b5=(Button)findViewById(R.id.n5);
        b6=(Button)findViewById(R.id.n6);
        b7=(Button)findViewById(R.id.n7);
        b8=(Button)findViewById(R.id.n8);
        b9=(Button)findViewById(R.id.n9);
        btnAs=(Button)findViewById(R.id.nAs);
        btnG=(Button)findViewById(R.id.nG);
        btnCall=(Button)findViewById(R.id.btn_call);
        btnDel=(Button)findViewById(R.id.btn_del);
        btnClear=(Button)findViewById(R.id.btn_clear);
        //editText = PhoneNumberUtils.formatNumber(normalizedPhoneNumber, Locale.getDefault().getCountry());
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                int digits = editText.getText().toString().length();
                if (digits > 1)
                    lastChar = editText.getText().toString().substring(digits-1);
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                int digits = editText.getText().toString().length();
                Log.d("LENGTH",""+digits);
                if(!lastChar.equals("-")){
                    if(digits == 2 || digits == 7) {
                        editText.append("-");
                    }
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText().insert(editText.getText().length(), "0"));
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText().insert(editText.getText().length(), "1"));
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText().insert(editText.getText().length(), "2"));
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText().insert(editText.getText().length(), "3"));
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText().insert(editText.getText().length(), "4"));
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText().insert(editText.getText().length(), "5"));
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText().insert(editText.getText().length(), "6"));
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText().insert(editText.getText().length(), "7"));
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText().insert(editText.getText().length(), "8"));
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText().insert(editText.getText().length(), "9"));
            }
        });

        btnAs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText().insert(editText.getText().length(), "*"));
            }
        });

        btnG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText().insert(editText.getText().length(), "#"));
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText("");
            }
        });

        btnDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(editText.length() > 0) {
                    String text = editText.getText().toString();
                    editText.setText(text.substring(0, text.length() - 1));
                }
            }
        });

    }



}