package com.rudeo.tutorial1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addClick(View v)
    {
        EditText numberEdit1 = (EditText) findViewById(R.id.firstEdit);
        EditText numberEdit2 = (EditText) findViewById(R.id.secondEdit);
        TextView result = (TextView) findViewById(R.id.resultText);

        try{
            int num1 = Integer.parseInt(numberEdit1.getText().toString());
            int num2 = Integer.parseInt(numberEdit2.getText().toString());
            result.setText(Integer.toString(num1 + num2));
        }catch (Exception e)
        {
            Toast toast = Toast.makeText(this.getApplicationContext(),"숫자만 입력해 주세요.", Toast.LENGTH_LONG);
            toast.show();
        }
    }

    public void subtractClick(View v)
    {
        EditText numberEdit1 = (EditText) findViewById(R.id.firstEdit);
        EditText numberEdit2 = (EditText) findViewById(R.id.secondEdit);
        TextView result = (TextView) findViewById(R.id.resultText);

        try{
            int num1 = Integer.parseInt(numberEdit1.getText().toString());
            int num2 = Integer.parseInt(numberEdit2.getText().toString());
            result.setText(Integer.toString(num1 - num2));
        }catch (Exception e)
        {
            Toast toast = Toast.makeText(this.getApplicationContext(),"숫자만 입력해 주세요.", Toast.LENGTH_LONG);
            toast.show();
        }
    }

    public void multiplyClick(View v)
    {
        EditText numberEdit1 = (EditText) findViewById(R.id.firstEdit);
        EditText numberEdit2 = (EditText) findViewById(R.id.secondEdit);
        TextView result = (TextView) findViewById(R.id.resultText);

        try{
            int num1 = Integer.parseInt(numberEdit1.getText().toString());
            int num2 = Integer.parseInt(numberEdit2.getText().toString());
            result.setText(Integer.toString(num1 * num2));
        }catch (Exception e)
        {
            Toast toast = Toast.makeText(this.getApplicationContext(),"숫자만 입력해 주세요.", Toast.LENGTH_LONG);
            toast.show();
        }
    }

    public void divideClick(View v)
    {
        EditText numberEdit1 = (EditText) findViewById(R.id.firstEdit);
        EditText numberEdit2 = (EditText) findViewById(R.id.secondEdit);
        TextView result = (TextView) findViewById(R.id.resultText);

        try{
            int num1 = Integer.parseInt(numberEdit1.getText().toString());
            int num2 = Integer.parseInt(numberEdit2.getText().toString());
            result.setText(Integer.toString(num1 / num2));
        }catch (Exception e)
        {
            Toast toast = Toast.makeText(this.getApplicationContext(),"숫자만 입력해 주세요.", Toast.LENGTH_LONG);
            toast.show();
        }
    }
}