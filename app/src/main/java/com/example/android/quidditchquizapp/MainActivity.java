package com.example.android.quidditchquizapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

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

    public void checkAnswers() {

        final int numOfQuestions = 7;

        boolean isCorrectQ1 = false;
        boolean isCorrectQ2 = false;
        boolean isCorrectQ3 = false;
        boolean isCorrectQ4 = false;
        boolean isCorrectQ5 = false;
        boolean isCorrectQ6 = false;
        boolean isCorrectQ7 = false;
        int correctAnswers = 0;

        CardView cardOne = findViewById(R.id.card_view1);
        CardView cardTwo = findViewById(R.id.card_view2);
        CardView cardThree = findViewById(R.id.card_view3);
        CardView cardFour = findViewById(R.id.card_view4);
        CardView cardFive = findViewById(R.id.card_view5);
        CardView cardSix = findViewById(R.id.card_view6);
        CardView cardSeven = findViewById(R.id.card_view7);

        //QUESTION 1
        RadioGroup radioQuestionOne = findViewById(R.id.question_one_radios);
        if (radioQuestionOne.getCheckedRadioButtonId() == findViewById(R.id.question_one_radio_one).getId() ) {
            isCorrectQ1 = true;
            correctAnswers++;
            cardOne.setCardBackgroundColor(Color.parseColor("#dcedc8"));
        }else {
            cardOne.setCardBackgroundColor(Color.parseColor("#ffcdd2"));
        }

        //QUESTION 2
        RadioGroup radioQuestionTwo = findViewById(R.id.question_two_radios);
        if (radioQuestionTwo.getCheckedRadioButtonId() == findViewById(R.id.question_two_radio_three).getId() ) {
            isCorrectQ2 = true;
            correctAnswers++;
            cardTwo.setCardBackgroundColor(Color.parseColor("#dcedc8"));
        }else {
            cardTwo.setCardBackgroundColor(Color.parseColor("#ffcdd2"));
        }

        //QUESTION 3
        EditText areaQuestionText = findViewById(R.id.area_question_answer);
        if (areaQuestionText.getText().toString().equals("44")) {
            isCorrectQ3 = true;
            correctAnswers++;
            cardThree.setCardBackgroundColor(Color.parseColor("#dcedc8"));
        }else {
            cardThree.setCardBackgroundColor(Color.parseColor("#ffcdd2"));
        }

        //QUESTION 4
        RadioGroup radioQuestionFour = findViewById(R.id.question_four_radios);
        if (radioQuestionFour.getCheckedRadioButtonId() == findViewById(R.id.question_four_radio_two).getId() ) {
            isCorrectQ4 = true;
            correctAnswers++;
            cardFour.setCardBackgroundColor(Color.parseColor("#dcedc8"));
        }else {
            cardFour.setCardBackgroundColor(Color.parseColor("#ffcdd2"));
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
            cardFive.setCardBackgroundColor(Color.parseColor("#dcedc8"));
        }else {
            cardFive.setCardBackgroundColor(Color.parseColor("#ffcdd2"));
        }

        //QUESTION 6
        RadioGroup radioQuestionSix = findViewById(R.id.question_six_radios);
        if (radioQuestionSix.getCheckedRadioButtonId() == findViewById(R.id.question_six_radio_four).getId() ) {
            isCorrectQ6 = true;
            correctAnswers++;
            cardSix.setCardBackgroundColor(Color.parseColor("#dcedc8"));
        } else {
            cardSix.setCardBackgroundColor(Color.parseColor("#ffcdd2"));
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
            cardSeven.setCardBackgroundColor(Color.parseColor("#dcedc8"));
        }else {
            cardSeven.setCardBackgroundColor(Color.parseColor("#ffcdd2"));
        }

        TextView resultTextView = findViewById(R.id.result_text_view);
        resultTextView.setText("You answered " + correctAnswers + " questions out of " + numOfQuestions + " correctly.");
        resultTextView.setVisibility(View.VISIBLE);
    }

}
