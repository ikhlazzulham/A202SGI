package com.ppm.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ppm_onClick(View view) {
        TextView output_level = (TextView)findViewById(R.id.output_level);
        TextView output_description = (TextView)findViewById(R.id.output_description);
        TextView output_advice = (TextView)findViewById(R.id.output_advice);
        EditText input = findViewById(R.id.ppm_input);
        Spinner spinner = findViewById(R.id.spinner);
        String input_string = input.getText().toString();

        String level = "";
        String description = "";
        String advice = "";

        if (input_string.matches("")) {
            Toast.makeText(this, "You did not enter any number", Toast.LENGTH_SHORT).show();
        } else {
            int input_number = Integer.parseInt(input.getText().toString());
            if (spinner.getSelectedItemPosition() == 0) {
                if (input_number > 2000) {
                    level = "Unacceptable";
                    description = "The water is unsafe and  contaminated.";
                    advice = "Move the animals/plants to a safer pond/tank immediately";
                } else if (input_number >= 1000) {
                    level = "Bad";
                    description = "It is not recommended for PPM to be at this level.";
                    advice = "Change the filter and change 70% of water";
                } else if (input_number >= 600) {
                    level = "Not Great";
                    description = "Filteration system most likely clogged.";
                    advice = "Change the filter and change 40% of water.";
                } else if (input_number >= 300) {
                    level = "Ideal";
                    description = "The water most likely contains minerals.";
                    advice = "Do nothing.";
                } else if (input_number >= 0) {
                    level = "Low";
                    description = "Lacking minerals, such as calcium, magnesium, and zinc.";
                    advice = "Top up with Dolomite to increase the PPM to 300.";
                }
            }
            if (spinner.getSelectedItemPosition() == 1) {
                if (input_number > 5000) {
                    level = "Unacceptable";
                    description = "The water is unsafe and  contaminated.";
                    advice = "Move the animals/plants to a safer pond/tank immediately";
                } else if (input_number >= 2500) {
                    level = "Bad";
                    description = "It is not recommended for PPM to be at this level.";
                    advice = "Change the filter and change 70% of water";
                } else if (input_number >= 1000) {
                    level = "Not Great";
                    description = "Filteration system most likely clogged.";
                    advice = "Change the filter and change 40% of water.";
                } else if (input_number >= 500) {
                    level = "Ideal";
                    description = "The water most likely contains minerals.";
                    advice = "Do nothing.";
                } else if (input_number >= 0) {
                    level = "Low";
                    description = "Lacking minerals, such as calcium, magnesium, and zinc.";
                    advice = "Top up with Dolomite to increase the PPM to 300.";
                }
            }
            if (spinner.getSelectedItemPosition() == 2) {
                if (input_number > 10000) {
                    level = "Unacceptable";
                    description = "The water is unsafe and  contaminated.";
                    advice = "Move the animals/plants to a safer pond/tank immediately";
                } else if (input_number >= 7500) {
                    level = "Bad";
                    description = "It is not recommended for PPM to be at this level.";
                    advice = "Change the filter and change 70% of water";
                } else if (input_number >= 5000) {
                    level = "Not Great";
                    description = "Filteration system most likely clogged.";
                    advice = "Change the filter and change 40% of water.";
                } else if (input_number >= 1000) {
                    level = "Ideal";
                    description = "The water most likely contains minerals.";
                    advice = "Do nothing.";
                } else if (input_number >= 0) {
                    level = "Low";
                    description = "Lacking minerals, such as calcium, magnesium, and zinc.";
                    advice = "Top up with Dolomite to increase the PPM to 300.";
                }
            }
        }


        output_level.setText(level);
        output_description.setText(description);
        output_advice.setText(advice);
    }
}