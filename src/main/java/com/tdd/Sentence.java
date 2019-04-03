package com.tdd;

public class Sentence {

    private String text;

    public Sentence (String text){
        this.text = text;
    }

    public boolean matchesTheEnding( String endOfSentence){
        return text.matches(".*" + endOfSentence + "$");
    }
}
