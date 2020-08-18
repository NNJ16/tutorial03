package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    EditText txt_n1,txt_n2;
    TextView lbl_ans;
    int num1,num2,ans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent =  getIntent();
        String n1 = intent.getStringExtra("number1");
        String n2 = intent.getStringExtra("number2");

        num1 = Integer.parseInt(n1);
        num2 = Integer.parseInt(n2);

        txt_n1 = findViewById(R.id.txt_n1);
        txt_n2 = findViewById(R.id.txt_n2);
        lbl_ans =findViewById(R.id.lbl_ans);

        txt_n1.setText(n1);
        txt_n2.setText(n2);

    }

    public void Add(View view)
    {
        ans = num1 + num2;
        lbl_ans.setText(Integer.toString(ans));
    }

    public void Subtraction(View view)
    {
        ans = num1 - num2;
        lbl_ans.setText(Integer.toString(ans));
    }

    public void Devision(View view)
    {
        double ans = (double) num1 / num2;
        lbl_ans.setText(Double.toString(ans));
    }

    public void Multiplication(View view)
    {
        ans = num1 * num2;
        lbl_ans.setText(Integer.toString(ans));
    }
}
