package no.bekk.fagkveld;

import android.app.Activity;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SimpleActivityPlain extends Activity {
    TextView myTextView;
    EditText myEditText;
    Button myButton;
    String serverUrl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity);

        myTextView = (TextView) findViewById(R.id.textView);
        myEditText = (EditText) findViewById(R.id.editText);
        myButton = (Button) findViewById(R.id.button);
        serverUrl = getString(R.string.server_url);

        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new Downloader().execute(serverUrl + myEditText.getText());
            }
        });
    }

    private class Downloader extends AsyncTask<String, Void, String> {

        @Override
        protected String doInBackground(String... params) {
            return ""; // TODO
        }

        @Override
        protected void onPostExecute(String s) {
            myTextView.setText(s);
        }
    }
}
