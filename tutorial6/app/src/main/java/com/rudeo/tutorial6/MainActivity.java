package com.rudeo.tutorial6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void moveClick(View v)
    {
        EditText editText = (EditText)findViewById(R.id.editText);

        String name = editText.getText().toString();
        Intent intent = new Intent(getApplicationContext(), SubActivity.class);

        intent.putExtra("nameText", name);
        startActivity(intent);
    }

}