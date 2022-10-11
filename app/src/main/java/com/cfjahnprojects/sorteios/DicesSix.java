package com.cfjahnprojects.sorteios;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class DicesSix extends AppCompatActivity {

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
        mainCallDSix();
    }

    private void mainCallDSix() {
        int num = randomNumber();
        setFinalDiceSide(num);

        TextView totalTV = findViewById(R.id.totalValueDice);
        totalTV.setText(String.valueOf(num+1));
    }

    private int randomNumber() {
        int num = new Random().nextInt(6);
        return num;
    }

    private void setFinalDiceSide(int num) {
        ImageView ImVi = findViewById(R.id.dicesSix);
        switch (num + 1) {
            case 1:
                ImVi.setImageResource(R.drawable.diceum);
                break;
            case 2:
                ImVi.setImageResource(R.drawable.dicedois);
                break;
            case 3:
                ImVi.setImageResource(R.drawable.dicetres);
                break;
            case 4:
                ImVi.setImageResource(R.drawable.dicequatro);
                break;
            case 5:
                ImVi.setImageResource(R.drawable.dicecinco);
                break;
            case 6:
                ImVi.setImageResource(R.drawable.diceseis);
                break;
        }
    }

    private void addTotal(int x) {
        int total = 0;
    }
}