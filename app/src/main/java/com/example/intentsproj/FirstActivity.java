package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class FirstActivity extends AppCompatActivity {

    EditText num1,num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

    }

    public void sendMessage(View view)
    {
        Intent intent =  new Intent(FirstActivity.this,SecondActivity.class);
        num1 = findViewById(R.id.txt_n1);
        num2 = findViewById(R.id.txt_n2);
        intent.putExtra("number1",num1.toString());
        intent.putExtra("number2",num2.toString());
        startActivity(intent);

    }
}
