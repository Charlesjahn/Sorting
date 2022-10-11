package com.cfjahnprojects.sorteios;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

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
    public void playerHead(View view){
        maincallHT("Head");
        TextView txPlayerChoice = findViewById(R.id.playerChoice);
        txPlayerChoice.setText("You choose Head!!!");
    }
    public void playerTail(View view){
        maincallHT("Tail");
        TextView txPlayerChoice = findViewById(R.id.playerChoice);
        txPlayerChoice.setText("You choose Tail!!!");
    }
    private void maincallHT(String s){
        int num = new Random().nextInt(2);
        setPicFinalCoin(num);
        whoWon(s, num);

    }
    private void setPicFinalCoin(int num){
        ImageView imaVi = findViewById(R.id.resultCircleCoin);
        switch (num){
            case 0:
                imaVi.setImageResource(R.drawable.head);
                break;
            case 1:
                imaVi.setImageResource(R.drawable.tail);
                break;
        }
    }
    private void whoWon(String s, int num){
        TextView TxVi = findViewById(R.id.resultHT);
        if((s == "Head" && num ==  0) || (s == "Tail" && num ==  1)){
            TxVi.setText("You Won!!!");
            TxVi.setTextColor(Color.BLUE);
        }else{
            TxVi.setText("You Lost!!!");

            TxVi.setTextColor(Color.RED);
        }

    }
}