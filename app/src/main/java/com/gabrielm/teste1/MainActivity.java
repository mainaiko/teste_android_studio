package com.gabrielm.teste1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    private EditText valor1;
    private EditText valor2;
    private Button button2;
    private CheckBox checkbox1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        valor1 = findViewById(R.id.valor1);
        valor2 = findViewById(R.id.valor2);
        checkbox1 = findViewById(R.id.checkBox1);
        button2 = findViewById(R.id.button2);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nome = valor1.getText().toString().trim();
                String preco = valor2.getText().toString().trim();
                boolean isimportado = checkbox1.isChecked();

                if (nome.isEmpty() && preco.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Nome e preço não informados.", Toast.LENGTH_SHORT).show();
                } else if (nome.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Nome não informado.", Toast.LENGTH_SHORT).show();
                } else if (preco.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Preço não informado.", Toast.LENGTH_SHORT).show();
                } else {
                    String importadoMsg = isimportado ? "Importado!" : "Não é importado.";
                    Toast.makeText(MainActivity.this, "Nome: " + nome + "\nPreço: " + preco, Toast.LENGTH_LONG).show();
                    Toast.makeText(MainActivity.this, importadoMsg, Toast.LENGTH_LONG).show();
                }
            }
        });
    }}