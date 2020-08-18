package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

    }

    public void sendMessage(View view)
    {
        Intent intent =  new Intent(FirstActivity.this,SecondActivity.class);
        EditText num1 = findViewById(R.id.txt_num1);
        EditText num2 = findViewById(R.id.txt_num2);
        intent.putExtra("number1",num1.getText().toString());
        intent.putExtra("number2",num2.getText().toString());
        startActivity(intent);

        Context context = getApplicationContext();
        CharSequence message = "You just clicked the OK button";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context,message,duration);
        toast.show();

        toast.setGravity(Gravity.TOP|Gravity.LEFT,0,0);
    }
}
