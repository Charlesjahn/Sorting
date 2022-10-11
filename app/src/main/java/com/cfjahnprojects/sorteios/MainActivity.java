package com.cfjahnprojects.sorteios;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void headTail(View view){
        Intent screen = new Intent(this,HeadTail.class);
        startActivity(screen);
    }
    public void joKenPo(View view){
        Intent screen = new Intent(this,JoKenPo.class);
        startActivity(screen);
    }
    public void dicesSix(View view){
        Intent screen = new Intent(this,DicesSix.class);
        startActivity(screen);
    }
}