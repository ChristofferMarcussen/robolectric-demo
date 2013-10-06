package no.bekk.fagkveld;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MyActivity extends Activity {
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
    }
}
