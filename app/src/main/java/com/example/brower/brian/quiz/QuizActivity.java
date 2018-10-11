package com.example.brower.brian.quiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.brower.brian.R;

public class QuizActivity extends AppCompatActivity {

    private QuestionLibrary mQuestionLibrary = new QuestionLibrary();

    private TextView mScoreView;
    private TextView mQuestionView;
    private Button mButtonChoice1;
    private Button mButtonChoice2;
    private Button mButtonChoice3;
    private Button quit_button;

//    Menu Bar Buttons
    private Button home;

    // CHANGE BASED ON NUM OF QUESTIONS
    private int questionNumberMax = 3;

    private String mAnswer;
    private static int mScore = 0;
    private int mQuestionNumber = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        mScoreView = (TextView)findViewById(R.id.score);
        mQuestionView = (TextView)findViewById(R.id.question);
        mButtonChoice1 = (Button)findViewById(R.id.choice1);
        mButtonChoice2 = (Button)findViewById(R.id.choice2);
        mButtonChoice3 = (Button)findViewById(R.id.choice3);

        updateQuestion();

        quit_button = (Button) findViewById(R.id.quit_button);
        quit_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNextActivity();
            }
        });

        //Start of Button Listener for Button1
        mButtonChoice1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                //My logic for Button goes in here

                if (mButtonChoice1.getText() == mAnswer){
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updateQuestion();
                    Toast.makeText(QuizActivity.this, "Correct", Toast.LENGTH_SHORT).show();

                }else {
                    updateQuestion();
                    Toast.makeText(QuizActivity.this, "Incorrect", Toast.LENGTH_SHORT).show();
                }
            }
        });

        //End of Button Listener for Button1

        //Start of Button Listener for Button2
        mButtonChoice2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //My logic for Button goes in here

                if (mButtonChoice2.getText() == mAnswer){
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updateQuestion();
                    Toast.makeText(QuizActivity.this, "Correct", Toast.LENGTH_SHORT).show();

                }else {
                    updateQuestion();
                    Toast.makeText(QuizActivity.this, "Incorrect", Toast.LENGTH_SHORT).show();
                }
            }
        });

        //End of Button Listener for Button2


        //Start of Button Listener for Button3
        mButtonChoice3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //My logic for Button goes in here

                if (mButtonChoice3.getText() == mAnswer){
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updateQuestion();
                    Toast.makeText(QuizActivity.this, "Correct", Toast.LENGTH_SHORT).show();

                }else {
                    updateQuestion();
                    Toast.makeText(QuizActivity.this, "Incorrect", Toast.LENGTH_SHORT).show();
                }
            }
        });

        //End of Button Listener for Button3

    }

    public void openNextActivity() {
        Intent intent = new Intent(this, QuizResultsActivity.class);
        startActivity(intent);
    }

    private void updateQuestion(){
        if (checkLastQuestion() == false) {
            mQuestionView.setText(mQuestionLibrary.getQuestion(mQuestionNumber));
            mButtonChoice1.setText(mQuestionLibrary.getChoice1(mQuestionNumber));
            mButtonChoice2.setText(mQuestionLibrary.getChoice2(mQuestionNumber));
            mButtonChoice3.setText(mQuestionLibrary.getChoice3(mQuestionNumber));
            mAnswer = mQuestionLibrary.getCorrectAnswer(mQuestionNumber);
            mQuestionNumber++;
        }
        else {
            lastQuestion();
        }
    }

    private void lastQuestion() {
        Toast.makeText(QuizActivity.this, "Quiz Finished", Toast.LENGTH_SHORT).show();
        openNextActivity();
    }

    private boolean checkLastQuestion() {
        if (mQuestionNumber == questionNumberMax) {
            return true;
        }
        else {
            return false;
        }
    }

    public static int getmScore() {
        return mScore;
    }

    private void updateScore(int point) {
        mScoreView.setText("" + mScore);
    }
}
