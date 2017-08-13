package com.mohammed.tutorial1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
public static final String extraMessage = "com.abotameem.tutorial1.extraMessage";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*Take note of the details in the following method that are required in order for the system to recognize
    it as compatible with the android:onClick attribute. Specifically, the method must declare the following:
    1- Public access
    2- A void return value
    3- A View as the only parameter (it is the View object that was clicked)*/
    public void sendMessage(View view){
        /*The following Intent constructor takes two parameters:
        1- A Context as its first parameter (this is used because the Activity class is a subclass of Context)
        2- The Class of the app component to which the system should deliver the Intent (in this case, the activity that should be started).*/
        Intent intent = new Intent(this, MessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.editText);
        intent.putExtra(extraMessage, editText.getText().toString());
        startActivity(intent);
    }
}
