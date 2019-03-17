package com.mambobryan.day5;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        displayRadioButtonPosition("no");

        RadioGroup buttonGroup = findViewById(R.id.radio_group);
        final RadioButton fistRadioButton = findViewById(R.id.first_radio_button);
        final RadioButton secondRadioButton = findViewById(R.id.second_radio_button);
        final RadioButton thirdRadioButton = findViewById(R.id.third_radio_button);
        final RadioButton fourthRadioButton = findViewById(R.id.fourth_radio_button);

        buttonGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if(checkedId == fistRadioButton.getId()){
                    displayRadioButtonPosition("first");
                } else if( checkedId == secondRadioButton.getId()){
                    displayRadioButtonPosition("second");
                } else if (checkedId == thirdRadioButton.getId()){
                    displayRadioButtonPosition("third");
                } else if (checkedId == fourthRadioButton.getId()){
                    displayRadioButtonPosition("fourth");
                }
            }
        });

    }

    public void displayRadioButtonPosition(String position){

        TextView displayText = findViewById(R.id.display_text_view);
        displayText.setText("You have selected the " + position + " RadioButton");

    }
}
