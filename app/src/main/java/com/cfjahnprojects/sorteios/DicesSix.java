package com.cfjahnprojects.sorteios;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class DicesSix extends AppCompatActivity {
    private int[] dicesNum ={
            R.drawable.diceum,
            R.drawable.dicedois,
            R.drawable.dicetres,
            R.drawable.dicequatro,
            R.drawable.dicecinco,
            R.drawable.diceseis,
    };
    private int[] dicesNumQuant ={
            R.id.dicesSix1,
            R.id.dicesSix2,
            R.id.dicesSix3,
            R.id.dicesSix4,
            R.id.dicesSix5,
            R.id.dicesSix6,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dices_six);
    }

    public void mainScreen(View view) {
        Intent screen = new Intent(this, MainActivity.class);
        startActivity(screen);
    }

    public void throwDices(View view) {
        TextView quantityDices = findViewById(R.id.quantityDices);
        int quantityDicesValue = Integer.valueOf(String.valueOf(quantityDices.getText()));
        int total = 0;

        for(int i=0; i<quantityDicesValue; i++){
            int num = new Random().nextInt(this.dicesNum.length);
            setFinalDiceSide(num,this.dicesNumQuant[i]);
            total += num+1;
        }
        TextView totalTV = findViewById(R.id.totalValueDice);
        totalTV.setText(String.valueOf(total));
    }

    private void setFinalDiceSide(int num, int id) {
        ImageView ImVi = findViewById(id);
        ImVi.setImageResource(dicesNum[num]);
    }

    private void addTotal(int x) {
        int total = 0;
    }


}