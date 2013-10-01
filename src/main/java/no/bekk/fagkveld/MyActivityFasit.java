package no.bekk.fagkveld;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MyActivityFasit extends Activity {
    private EditText input;
    private Button button;
    private TextView textView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        button = (Button) findViewById(R.id.knapp);
        textView = (TextView) findViewById(R.id.resultat);
        input = (EditText) findViewById(R.id.input);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputText = input.getText().toString();
                printAppropriateResponse(inputText);
            }
        });
    }

    private void printAppropriateResponse(String inputText) {
        if (inputText.equals("Sindre")) {
            textView.setText("Heia Rosenborg");
        }

        else if (inputText.equals("Christoffer")) {
            textView.setText("Heia Godset");
        }
    }
}
