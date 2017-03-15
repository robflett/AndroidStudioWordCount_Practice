package com.codeclan.word_count;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;




public class WordCountTest {

    ArrayList<String> wordcounter1;

    @Before
    public void before(){
        wordcounter1 = new WordCounter<String>();
        wordcounter1.add("It was the best of times, it was the worst of times, it was the age of wisdom, it was the age of foolishness, it was the epoch of belief, it was the epoch of incredulity, …");
    }

//    @Test
//    public void testGetResponse(){
//        assertEquals("it" : 6, "was" : 6, "the" : 6, "best" : 1, "of" : 6, "times" : 2, "worst" : 1, "age" : 2, "wisdom" : 1, "foolishness" : 1, "epoch" : 2, "belief" : 1, "incredulity" : 1, wordcounter1.getResponse());
//    }


}