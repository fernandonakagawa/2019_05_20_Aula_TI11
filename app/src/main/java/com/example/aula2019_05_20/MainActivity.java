package com.example.aula2019_05_20;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static float valorDolar = 4.09f;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clicouDolar(View view) {
        EditText eValor = findViewById(R.id.etValor);
        String sValor = eValor.getText().toString();
        float fValor = Float.valueOf(sValor);
        fValor /= valorDolar;
        TextView tConvertido = findViewById(R.id.txtValor);
        tConvertido.setText(String.valueOf(fValor));
    }

    public void clicouEuro(View view) {
    }
}
