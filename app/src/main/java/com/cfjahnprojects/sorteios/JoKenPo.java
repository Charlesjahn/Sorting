package com.cfjahnprojects.sorteios;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;

public class JoKenPo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jo_ken_po);
    }
    public void mainScreen(View view){
        Intent screen = new Intent(this,MainActivity.class);
        startActivity(screen);
    }

    public void playerRock(View view){
        mainCall("Rock");
        TextView txPlayerChoice = findViewById(R.id.playerPick);
        txPlayerChoice.setText("You choose Rock!!!");
    }
    public void playerPaper(View view){
        mainCall("Paper");
        TextView txPlayerChoice = findViewById(R.id.playerPick);
        txPlayerChoice.setText("You choose Paper!!!");
    }
    public void playerScissor(View view){
        mainCall("Scissor");
        TextView txPlayerChoice = findViewById(R.id.playerPick);
        txPlayerChoice.setText("You choose Scissor!!!");
    }

    private void mainCall(String s){

        int num = randomIntAI();
        String aipick = aIChoice(num);
        setPicForAI(aipick);
        whoWonResult(aipick,s);

    }
    private void setPicForAI(String aipick){
        ImageView iv = findViewById(R.id.aiImagepick);
        switch (aipick){
            case"Rock":
                iv.setImageResource(R.drawable.rock);
                break;
            case"Paper":
                iv.setImageResource(R.drawable.paper);
                break;
            case"Scissor":
                iv.setImageResource(R.drawable.scissor);
                break;
        }
    }
    private void whoWonResult(String ai, String player){
        TextView txResult = findViewById(R.id.resultJKP);
        if((ai=="Rock" && player == "Scissor") ||
                (ai=="Scissor" && player == "Paper") ||
                (ai=="Paper" && player == "Rock")){
            txResult.setText("AI won!!!");
            txResult.setTextColor(Color.RED);

        }else if((player=="Rock" && ai == "Scissor") ||
                (player=="Scissor" && ai == "Paper") ||
                (player=="Paper" && ai == "Rock")){
            txResult.setText("You won!!!");
            txResult.setTextColor(Color.BLUE);

        }else{
            txResult.setText("That was\n a draw");
            txResult.setTextColor(Color.YELLOW);
        }
    }

    private int randomIntAI(){
        int num = new Random().nextInt(3);
        return num;
    }
    private String aIChoice(int n){
        String[] s = {"Rock","Paper","Scissor"};
        return s[n];
    }
}