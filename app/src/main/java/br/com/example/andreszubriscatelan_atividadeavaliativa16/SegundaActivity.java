package br.com.example.andreszubriscatelan_atividadeavaliativa16;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class SegundaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        // Recebendo os dados da Intent
        double doubleData = getIntent().getDoubleExtra("DOUBLE_DATA", 0.0);
        int intData = getIntent().getIntExtra("INT_DATA", 0);
        String stringData = getIntent().getStringExtra("STRING_DATA");

        // Referenciando TextViews e exibindo os dados recebidos
        TextView textViewDouble = findViewById(R.id.textViewDouble);
        TextView textViewInt = findViewById(R.id.textViewInt);
        TextView textViewString = findViewById(R.id.textViewString);

        textViewDouble.setText("Double recebido: " + doubleData);
        textViewInt.setText("Int recebido: " + intData);
        textViewString.setText("String recebida: " + stringData);
    }
}