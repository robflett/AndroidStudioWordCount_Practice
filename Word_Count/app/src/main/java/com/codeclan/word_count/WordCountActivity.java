package com.codeclan.word_count;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class WordCountActivity extends AppCompatActivity {

    EditText textBlockEditText;
    Button textBlockButton;
    TextView responseText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_count);
        Log.d(getClass().toString(), "onCreate called - here's a log of it!");

        textBlockEditText = (EditText)findViewById(R.id.text_block);
        textBlockButton = (Button)findViewById(R.id.text_block_button);
        responseText = (TextView)findViewById(R.id.response_text);
    }

    public void onButtonClicked(View Button){
        Log.d(getClass().toString(), "The button has been CLICKED!");
        String texttocount = textBlockEditText.getText().toString();
        Log.d("The text entered was : ", texttocount);

        Intent intent = new Intent(this, WordCounter.class);
        intent.putExtra("texttocount", texttocount);

        startActivity(intent);
    }
}
