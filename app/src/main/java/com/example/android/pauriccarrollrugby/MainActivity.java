package com.example.android.pauriccarrollrugby;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreLeinster = 0;
    int scoreMunster = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForLeinster(0);

        /**displayForLeinster is used to define a score straight of the bat
         */
    }

    /** Creating a method Public Void / Method name / Method
     * parameters/ What happens. Remember we need to associate this
     * with a button
     */

    /**
     * to update score we need to increase score then display score
     */


    public void addTryForLeinster(View v) {
        scoreLeinster = scoreLeinster + 5;
        displayForLeinster(scoreLeinster);
    }


    public void addConversionForLeinster(View v) {
        scoreLeinster = scoreLeinster + 2;
        displayForLeinster(scoreLeinster);
    }

    public void addPenaltyForLeinster(View v) {
        scoreLeinster = scoreLeinster + 3;
        displayForLeinster(scoreLeinster);

    }

    public void addTryForMunster(View v) {
        scoreMunster = scoreMunster + 5;
        displayForMunster(scoreMunster);
    }


    public void addConversionForMunster(View v) {
        scoreMunster = scoreMunster + 2;
        displayForMunster(scoreMunster);
    }

    public void addPenaltyForMunster(View v) {
        scoreMunster = scoreMunster + 3;
        displayForMunster(scoreMunster);

    }

    /** resets score for the game. Assign value for teams and then display the score to zero
     */

    public void resetScore(View v){
        scoreLeinster=0;
        scoreMunster=0;
        displayForLeinster(scoreLeinster);
        displayForMunster(scoreMunster);


    }

    /**
     * Displays the given score for Team A. this matches exactly with
     * android:id="@+id/team_a_score"
     */

    public void displayForLeinster(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForMunster(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}

