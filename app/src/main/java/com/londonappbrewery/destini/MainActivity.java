package com.londonappbrewery.destini;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    TextView storyTextView;
    Button buttonTop;
    Button buttonBottom;
    int storyIndex;
    int clickedNumber;

    private Story[] mStory = new Story[]{
       new Story(R.string.T1_Ans1,R.string.T1_Ans2,R.string.T1_Story),
       new Story(R.string.T2_Ans1,R.string.T2_Ans2,R.string.T2_Story),
       new Story(R.string.T3_Ans1,R.string.T3_Ans2,R.string.T3_Story),

    };





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        clickedNumber = 0;
        storyIndex = 0;

        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        storyTextView = (TextView) findViewById(R.id.storyTextView);
        buttonTop = (Button)findViewById(R.id.buttonTop);
        buttonBottom = (Button)findViewById(R.id.buttonBottom);

        storyTextView.setText(R.string.T1_Story);
        buttonTop.setText(R.string.T1_Ans1);
        buttonBottom.setText(R.string.T1_Ans2);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:

        buttonTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (clickedNumber == 0) {
                    storyIndex = 2;
                    /*storyTextView.setText(mStory[storyIndex].mStory);
                    buttonTop.setText(mStory[storyIndex].mAnswer1);
                    buttonBottom.setText(mStory[storyIndex].mAnswer2);*/
                    showStory();
                    clickedNumber = clickedNumber + 1;
                }
                else if (clickedNumber == 1 && storyIndex==2){
                    storyTextView.setText(R.string.T6_End);
                    endStory();
                }
                else if (clickedNumber == 1 && storyIndex == 1){
                    storyIndex = 2;
                    /*storyTextView.setText(mStory[storyIndex].mStory);
                    buttonTop.setText(mStory[storyIndex].mAnswer1);
                    buttonBottom.setText(mStory[storyIndex].mAnswer2);*/
                    showStory();
                    clickedNumber = clickedNumber + 1;
                }
                else if (clickedNumber ==2){
                    storyTextView.setText(R.string.T6_End);
                    endStory();
                }


            }
        });

        buttonBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(clickedNumber == 0){
                    storyIndex = 1;
                    /*storyTextView.setText(mStory[storyIndex].mStory);
                    buttonTop.setText(mStory[storyIndex].mAnswer1);
                    buttonBottom.setText(mStory[storyIndex].mAnswer2);*/
                    showStory();
                    clickedNumber = clickedNumber + 1;
                }
                else if (clickedNumber == 1 && storyIndex == 1){
                    storyTextView.setText(R.string.T4_End);
                    endStory();
                }
                else if (clickedNumber == 1 && storyIndex ==2 ){
                    storyTextView.setText(R.string.T5_End);
                    endStory();
                }
                else if (clickedNumber == 2){
                    storyTextView.setText(R.string.T5_End);
                    endStory();
                }

            }
        });




        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:


    }

    private void endStory(){
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setTitle("Game Over");
        alert.setCancelable(false);
        alert.setMessage("This is the end of the story");
        alert.setPositiveButton("Close", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();
            }
        });

        alert.show();
    }

    private void showStory(){
        storyTextView.setText(mStory[storyIndex].mStory);
        buttonTop.setText(mStory[storyIndex].mAnswer1);
        buttonBottom.setText(mStory[storyIndex].mAnswer2);
    }
}
