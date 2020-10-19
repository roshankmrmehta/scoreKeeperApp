package com.example.scorekeeperapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView TeamAScore, TeamBScore;

    Button onePointTeamA, twoPointTeamA, threePointTeamA, reset;
    Button onePointTeamB, twoPointTeamB, threePointTeamB;

    int teamAScore = 0;
    int teamBScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        reset = findViewById(R.id.Reset);
        TeamAScore = findViewById(R.id.TeamAScore);
        TeamBScore = findViewById(R.id.TeamBScore);
        onePointTeamA = findViewById(R.id.onePointTeamA);
        twoPointTeamA = findViewById(R.id.twoPointTeamA);
        threePointTeamA = findViewById(R.id.threePointTeamA);
        onePointTeamB = findViewById(R.id.onePointTeamB);
        twoPointTeamB = findViewById(R.id.twoPointTeamB);
        threePointTeamB = findViewById(R.id.threePointTeamB);

        onePointTeamA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                teamAScore = teamAScore + 1;
                display(teamAScore);
            }

            private void display(int teamAScore) {
                TeamAScore.setText(String.valueOf(teamAScore));
            }
        });

        twoPointTeamA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                teamAScore = teamAScore + 2;
                display(teamAScore);
            }

            private void display(int teamAScore) {
                TeamAScore.setText(String.valueOf(teamAScore));
            }
        });

        threePointTeamA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                teamAScore = teamAScore + 3;
                display(teamAScore);
            }

            private void display(int teamAScore) {
                TeamAScore.setText(String.valueOf(teamAScore));
            }
        });

        onePointTeamB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                teamBScore = teamBScore + 1;
                display1(teamBScore);
            }

            private void display1(int teamBScore) {
                TeamBScore.setText(String.valueOf(teamBScore));
            }
        });

        twoPointTeamB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                teamBScore = teamBScore + 2;
                display1(teamBScore);
            }

            private void display1(int teamBScore) {
                TeamBScore.setText(String.valueOf(teamBScore));
            }
        });

        threePointTeamB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                teamBScore = teamBScore + 3;
                display1(teamBScore);
            }

            private void display1(int teamBScore) {
                TeamBScore.setText(String.valueOf(teamBScore));
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                teamAScore = 0;
                teamBScore = 0;
                display(teamAScore);
                display1(teamBScore);

            }

            private void display(int teamAScore) {
                TeamAScore.setText(String.valueOf(teamAScore));
            }

            private void display1(int teamBScore) {
                TeamBScore.setText(String.valueOf(teamBScore));
            }

        });

    }

}
