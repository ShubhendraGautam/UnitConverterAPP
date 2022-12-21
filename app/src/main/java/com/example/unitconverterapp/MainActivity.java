package com.example.unitconverterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    EditText editText;
    TextView textView1,textView2;
    Button btn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText=findViewById(R.id.editText1);
        textView1=findViewById(R.id.Welcome_text_view);
        textView2=findViewById(R.id.textView);
        btn=findViewById(R.id.btn1);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double kilos=Double.parseDouble(editText.getText().toString());
                double result=convertToPounds(kilos);

                textView2.setText(""+result+"pounds");
            }
        });



    }

    public double convertToPounds(double kilos){
        double v = kilos * 2.20462;
        return v;
    };


}