package com.codeclan.word_count;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.HashMap;

public class WordCounterActivity extends AppCompatActivity {

    TextView responseText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_counter);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        String texttocount = extras.getString("texttocount");

        WordCounter wordcounter = new WordCounter(texttocount);
        String response = wordcounter.getResponse(texttocount);

        responseText = (TextView)findViewById(R.id.response_text);
        responseText.setText(texttocount + ": The words have..." + response);
    }
}
