package com.example.labirua_if_then;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView storyBackground = findViewById(R.id.txtStoryBackground);
        TextView storyOutcome = findViewById(R.id.txtStoryOutcome);

        Button decision1 = findViewById(R.id.buttonDecision1);
        Button decision2 = findViewById(R.id.buttonDecision2);

        decision1.setOnClickListener(this);
        decision2.setOnClickListener(this);

        storyBackground.setText("           PR's fate.");

        storyOutcome.setText("If PR chooses siomai for dinner, he will be full, if he chooses crab balls, he will still have room for dinner.");
    }

    @Override
    public void onClick(View view) {

        TextView storyOutcome = findViewById(R.id.txtStoryBackground);
        TextView storyBackground = findViewById(R.id.txtStoryBackground);

        if(view.getId() == R.id.buttonDecision1){
            storyBackground.setText("PR got full and refused to eat dinner.");
        }
        else if (view.getId() == R.id.buttonDecision2){
            storyBackground.setText("PR had space left so he ate with the family.");
        }
    }
}