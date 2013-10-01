package no.bekk.fagkveld;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FizzBuzzActivity extends Activity{

    private EditText input;
    private Button knapp;
    private TextView resultat;

    @Override
    public void onCreate(Bundle onSavedInstance) {
        super.onCreate(onSavedInstance);

        setContentView(R.layout.fizzbuzz);

        input = (EditText) findViewById(R.id.inputFelt);
        knapp = (Button) findViewById(R.id.knapp);
        resultat = (TextView) findViewById(R.id.resultat);

        knapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int inputNumber = Integer.parseInt(input.getText().toString());
                if (divisibleOf(inputNumber, 3) && divisibleOf(inputNumber, 5)) {
                    resultat.setText("fizzbuzz");
                }

                else if (divisibleOf(inputNumber, 3)) {
                    resultat.setText("fizz");
                }

                else if (divisibleOf(inputNumber, 5)) {
                    resultat.setText("buzz");
                }
                else {
                    resultat.setText(String.valueOf(inputNumber));
                }
            }
        });
    }

    private boolean divisibleOf(int inputNumber, int factor) {
        return inputNumber % factor == 0;
    }
}
