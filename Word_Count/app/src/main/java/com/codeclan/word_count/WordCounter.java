package com.codeclan.word_count;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by user on 14/03/2017.
 */

public class WordCounter {

    private String text;

    public WordCounter(String text) {
        this.text = text;
    }


    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getResponse(String text) {


            String[] eachword = text.split(" ");
            HashMap all = new HashMap();

            for (int i = 0; i < eachword.length; i++) {
                if (!all.containsKey(eachword[i])) {
                    all.put(eachword[i], 1);
                } else {
                    all.put(eachword[i], (Integer) all.get(eachword[i]) + 1);
                }
            }

            for (Object word : all.keySet()) {
                System.out.println(word + " " + (Integer) all.get(word) );
            }


        return null;
    }

}
