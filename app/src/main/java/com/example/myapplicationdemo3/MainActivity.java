package com.example.myapplicationdemo3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
//
//    public void save(View view) {
//        EditText editText = (EditText) findViewById(R.id.txtname);
//        Log.i("","txtname is" + editText);
//    }
}