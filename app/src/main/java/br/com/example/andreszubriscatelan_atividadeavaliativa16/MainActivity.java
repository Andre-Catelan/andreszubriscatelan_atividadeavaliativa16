package br.com.example.andreszubriscatelan_atividadeavaliativa16;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editTextDouble = findViewById(R.id.editTextDouble);
        EditText editTextInt = findViewById(R.id.editTextInt);
        EditText editTextString = findViewById(R.id.editTextString);
        Button buttonSend = findViewById(R.id.buttonSend);

        buttonSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Obtendo os valores digitados pelo usuário
                double doubleData = Double.parseDouble(editTextDouble.getText().toString());
                int intData = Integer.parseInt(editTextInt.getText().toString());
                String stringData = editTextString.getText().toString();

                // Criando a Intent e adicionando os dados
                Intent intent = new Intent(MainActivity.this, SegundaActivity.class);
                intent.putExtra("DOUBLE_DATA", doubleData);
                intent.putExtra("INT_DATA", intData);
                intent.putExtra("STRING_DATA", stringData);

                startActivity(intent);
            }
        });
    }
}