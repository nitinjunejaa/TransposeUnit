package com.example.transposeunit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView textView2;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        textView2 = findViewById(R.id.textView2);
        editText = findViewById(R.id.editText);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(MainActivity.this, "Conversion Successful", Toast.LENGTH_SHORT).show();
//                String s = editText.getText().toString();
//                int Inch = Integer.parseInt(s);
//                double cm = 2.54*Inch;
//                textView2.setText("The corresponding value is "+cm);
//
//            }
//        });


    }

    public void calculate(View view) {
        Toast.makeText(MainActivity.this, "Conversion Successful", Toast.LENGTH_SHORT).show();
        String s = editText.getText().toString();
        int Inch = Integer.parseInt(s);
        double cm = 2.54 * Inch;
        textView2.setText("The corresponding value is " + cm);
    }
}
