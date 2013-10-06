package no.bekk.fagkveld;

import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;

@RunWith(RobolectricTestRunner.class)
public class MyActivityTest {
    private MyActivity activity;
    private Button button;
    private TextView textView;
    private EditText input;


    @Before
    public void setup() {
        activity = new MyActivity();
        activity.onCreate(null);
        button = (Button) activity.findViewById(R.id.knapp);
        textView = (TextView) activity.findViewById(R.id.resultat);
        input = (EditText) activity.findViewById(R.id.input);
    }
}
