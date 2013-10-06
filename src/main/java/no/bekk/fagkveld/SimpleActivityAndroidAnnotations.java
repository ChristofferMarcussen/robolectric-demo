package no.bekk.fagkveld;

import android.app.Activity;
import android.widget.EditText;
import android.widget.TextView;

import com.googlecode.androidannotations.annotations.Background;
import com.googlecode.androidannotations.annotations.Click;
import com.googlecode.androidannotations.annotations.EActivity;
import com.googlecode.androidannotations.annotations.UiThread;
import com.googlecode.androidannotations.annotations.ViewById;
import com.googlecode.androidannotations.annotations.res.StringRes;

@EActivity(R.layout.main)
public class SimpleActivityAndroidAnnotations extends Activity {

    @ViewById(R.id.textView) TextView myTextView;
    @ViewById(R.id.editText) EditText myEditText;
    @StringRes(R.string.server_url) String serverUrl;

    @Click(R.id.button)
    void buttonClicked() {
        downloadSomething(serverUrl + myEditText.getText());
    }

    @Background
    void downloadSomething(String url) {
        String result = ""; // TODO get from server
        updateTextView(result);
    }

    @UiThread
    void updateTextView(String text) {
        myTextView.setText(text);
    }

}
