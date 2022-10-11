package com.cfjahnprojects.sorteios;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HeadTail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.head_tail);
    }
    public void mainScreen(View view){
        Intent screen = new Intent(this,MainActivity.class);
        startActivity(screen);
    }
}