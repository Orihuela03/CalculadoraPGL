package com.example.calculadorapgl;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class calculadoraMain extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculadoralayout);

        EditText etNumber1 = findViewById(R.id.etNumber1);
        EditText etNumber2 = findViewById(R.id.etNumber2);
        Button btnCalculate = findViewById(R.id.btnCalculate);
        TextView tvResult = findViewById(R.id.tvResult);

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1 = etNumber1.getText().toString();
                String num2 = etNumber2.getText().toString();

                if (num1.isEmpty() || num2.isEmpty()) {
                    Toast.makeText(calculadoraMain.this, "Por favor, ingrese ambos números", Toast.LENGTH_SHORT).show();
                    return;
                }

                try {
                    double number1 = Double.parseDouble(num1);
                    double number2 = Double.parseDouble(num2);
                    double sum = number1 + number2;

                    tvResult.setText("Resultado: " + sum);
                } catch (NumberFormatException e) {
                    Toast.makeText(calculadoraMain.this, "Por favor, ingrese números válidos", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}