package no.bekk.fagkveld;

import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;

import static junit.framework.Assert.assertEquals;

@RunWith(RobolectricTestRunner.class)
public class MyActivityFasitTest {
    private MyActivityFasit activity;
    private Button button;
    private TextView textView;
    private EditText input;


    @Before
    public void setup() {
        activity = new MyActivityFasit();
        activity.onCreate(null);
        button = (Button) activity.findViewById(R.id.knapp);
        textView = (TextView) activity.findViewById(R.id.resultat);
        input = (EditText) activity.findViewById(R.id.input);
    }

    @Test
    public void should_print_Heia_Rosenborg_if_input_is_Sindre() {
        input.setText("Sindre");
        button.performClick();

        assertEquals("Heia Rosenborg", textView.getText());
    }

    @Test
    public void should_print_Heia_Godset_if_input_is_Christoffer() {
        input.setText("Christoffer");
        button.performClick();

        assertEquals("Heia Godset", textView.getText());
    }
}
