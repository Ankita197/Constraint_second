package com.example.constrainlayoutsecond;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    private EditText mMessageEditText;
    public static final String EXTRA_MESSAGE = "com.example.android.twoactivities.extra.MESSAGE";
    private static final String LOG_TAG = MainActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mMessageEditText = (EditText) findViewById(R.id.evCamera);
    }
            public void launchSecondActivity(View view) {
                Log.d(LOG_TAG, "Button clicked!");

                Intent intent = new Intent(this, SecondActivity.class);
                String message = mMessageEditText.getText().toString();

                intent.putExtra(EXTRA_MESSAGE, message);
                startActivity(intent);


    }



}
/** Button b1= (Button) findViewById(R.id.button);
 b1.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View v) {
mMessageEditText = (EditText) findViewById(R.id.evCamera);
}

});**/
