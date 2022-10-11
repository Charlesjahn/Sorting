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

    private int dicesPlayed = 0;
    private int total = 0;

    public void throwDices(View view) {

        if(this.dicesPlayed < 6){
            int num = new Random().nextInt(this.dicesNum.length);
            setFinalDiceSide(num,this.dicesNumQuant[dicesPlayed]);
            this.total += num+1;
            this.dicesPlayed += 1;
        }
        else{
            for(int i = 0; i <= dicesNumQuant.length-1;i++){
                setDiceSide(this.dicesNumQuant[i]);
            }
            this.dicesPlayed = 0;
            this.total = 0;
        }

        TextView totalTV = findViewById(R.id.totalValueDice);
        totalTV.setText(String.valueOf(this.total));
    }

    private void setFinalDiceSide(int num, int id) {
        ImageView ImVi = findViewById(id);
        ImVi.setImageResource(this.dicesNum[num]);
    }
    private void setDiceSide(int id) {
        ImageView ImVi = findViewById(id);
        ImVi.setImageResource(R.drawable.dicequestion);
    }
}