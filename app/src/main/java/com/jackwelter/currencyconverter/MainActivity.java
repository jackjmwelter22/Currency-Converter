package com.jackwelter.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convertFunction(View view){

        EditText usdText = (EditText) findViewById(R.id.currencyEditText);

        Double euroDouble = Double.parseDouble(usdText.getText().toString()) * 0.83;

        String euroText = String.format("%.2f",euroDouble);

        Toast.makeText(this, "EUR " + euroText, Toast.LENGTH_LONG).show();;

        Log.i("info",euroText);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
