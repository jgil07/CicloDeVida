package com.example.lds.ciclodevida;

import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView TextViewcontador;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextViewcontador = (TextView) findViewById(R.id.TextView);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        TextViewcontador = (TextView) findViewById(R.id.TextView);
        TextViewcontador.setText("Estado : onDestroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        TextViewcontador = (TextView) findViewById(R.id.TextView);
        TextViewcontador.setText("Estado : onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        TextViewcontador = (TextView) findViewById(R.id.TextView);
        TextViewcontador.setText("Estado : onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        TextViewcontador = (TextView) findViewById(R.id.TextView);
        TextViewcontador.setText("Estado : onRestart");
    }

    @Override
    protected void onStart() {
        super.onStart();
        TextViewcontador = (TextView) findViewById(R.id.TextView);
        TextViewcontador.setText("Estado : onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        TextViewcontador = (TextView) findViewById(R.id.TextView);
        TextViewcontador.setText("Estado : onStop");
    }
}
