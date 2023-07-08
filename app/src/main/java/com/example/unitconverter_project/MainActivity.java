package com.example.unitconverter_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button1, button2;
    EditText edittext;
    TextView textView;

    double num;
    double num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1.findViewById(R.id.button);
        button2.findViewById(R.id.button2);
        edittext.findViewById(R.id.editText);
        textView.findViewById(R.id.textView);


      button1.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
            num =   Double.parseDouble(edittext.getText().toString());
            num2 = (num*1.8)+32;
            textView.setText(String.valueOf(num2));
          }
      });


    }
}