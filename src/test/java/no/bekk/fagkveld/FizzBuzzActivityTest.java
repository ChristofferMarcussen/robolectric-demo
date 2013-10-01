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
public class FizzBuzzActivityTest {

    private FizzBuzzActivity activity;
    private EditText inputFelt;
    private TextView resultat;
    private Button knapp;

    @Before
    public void setUp() {
        activity = new FizzBuzzActivity();
        activity.onCreate(null);

        inputFelt = (EditText) activity.findViewById(R.id.inputFelt);
        knapp = (Button) activity.findViewById(R.id.knapp);
        resultat = (TextView) activity.findViewById(R.id.resultat);
    }

    @Test
    public void should_print_one_if_number_is_one() {
        inputFelt.setText("1");
        knapp.performClick();

        assertEquals("1", resultat.getText());
    }

    @Test
    public void should_print_two_if_number_is_two() {
        inputFelt.setText("2");
        knapp.performClick();

        assertEquals("2", resultat.getText());
    }

    @Test
    public void should_print_fizz_if_number_is_divisible_of_three() {
        inputFelt.setText("3");
        knapp.performClick();

        assertEquals("fizz", resultat.getText());
    }

    @Test
    public void should_print_buzz_if_number_is_divisible_of_five() {
        inputFelt.setText("5");
        knapp.performClick();

        assertEquals("buzz", resultat.getText());
    }

    @Test
    public void should_print_fizz_buzz_if_number_is_divisible_of_five_and_three() {
        inputFelt.setText("15");
        knapp.performClick();

        assertEquals("fizzbuzz", resultat.getText());
    }
}
