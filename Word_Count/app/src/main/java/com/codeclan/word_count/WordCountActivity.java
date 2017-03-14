package com.codeclan.word_count;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;

public class WordCountActivity extends AppCompatActivity {

    EditText textBlockEditText;
    Button textBlockButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_count);
        Log.d(getClass().toString(), "onCreate called - here's a log of it!");

        textBlockEditText = (EditText)findViewById(R.id.text_block);
        textBlockButton = (Button)findViewById(R.id.text_block_button);
    }


}
