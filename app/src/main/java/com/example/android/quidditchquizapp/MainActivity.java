package com.example.android.quidditchquizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button submitBtn = findViewById(R.id.submit_btn);
        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkAnswers();
            }
        });

    }

   private static final String TAG = "MyActivity";

    public void checkAnswers() {

        boolean isCorrectQ1 = false;
        boolean isCorrectQ2 = false;
        boolean isCorrectQ3 = false;
        boolean isCorrectQ4 = false;
        boolean isCorrectQ5 = false;
        boolean isCorrectQ6 = false;
        boolean isCorrectQ7 = false;
        int correctAnswers = 0;

        //QUESTION 1
        RadioGroup radioQuestionOne = findViewById(R.id.question_one_radios);
        if (radioQuestionOne.getCheckedRadioButtonId() == findViewById(R.id.question_one_radio_one).getId() ) {
            isCorrectQ1 = true;
            correctAnswers++;
        }
        //QUESTION 2
        RadioGroup radioQuestionTwo = findViewById(R.id.question_two_radios);
        if (radioQuestionTwo.getCheckedRadioButtonId() == findViewById(R.id.question_two_radio_three).getId() ) {
            isCorrectQ2 = true;
            correctAnswers++;
        }
        //QUESTION 3
        EditText areaQuestionText = findViewById(R.id.area_question_answer);
        if (areaQuestionText.getText().toString().equals("44")) {
            isCorrectQ3 = true;
            correctAnswers++;
        }
        //QUESTION 4
        RadioGroup radioQuestionFour = findViewById(R.id.question_four_radios);
        if (radioQuestionFour.getCheckedRadioButtonId() == findViewById(R.id.question_four_radio_two).getId() ) {
            isCorrectQ4 = true;
            correctAnswers++;
        }
        //QUESTION 5
        CheckBox chBoxOneQuestion5 = findViewById(R.id.question_five_check_one);
        CheckBox chBoxTwoQuestion5 = findViewById(R.id.question_five_check_two);
        CheckBox chBoxThreeQuestion5 = findViewById(R.id.question_five_check_three);
        CheckBox chBoxFourQuestion5 = findViewById(R.id.question_five_check_four);

        if (chBoxOneQuestion5.isChecked() &&
                !chBoxTwoQuestion5.isChecked() &&
                !chBoxThreeQuestion5.isChecked() &&
                chBoxFourQuestion5.isChecked()) {
            isCorrectQ5 = true;
            correctAnswers++;
        }
        //QUESTION 6
        RadioGroup radioQuestionSix = findViewById(R.id.question_six_radios);
        if (radioQuestionSix.getCheckedRadioButtonId() == findViewById(R.id.question_six_radio_four).getId() ) {
            isCorrectQ6 = true;
            correctAnswers++;
        }
        //QUESTION 7
        CheckBox chBoxOneQuestion7 = findViewById(R.id.question_seven_check_one);
        CheckBox chBoxTwoQuestion7 = findViewById(R.id.question_seven_check_two);
        CheckBox chBoxThreeQuestion7 = findViewById(R.id.question_seven_check_three);
        CheckBox chBoxFourQuestion7 = findViewById(R.id.question_seven_check_four);

        if (!chBoxOneQuestion7.isChecked() &&
                !chBoxTwoQuestion7.isChecked() &&
                chBoxThreeQuestion7.isChecked() &&
                chBoxFourQuestion7.isChecked()) {
            isCorrectQ7 = true;
            correctAnswers++;
        }

    }

    public void calculateResult() {

    }

}
