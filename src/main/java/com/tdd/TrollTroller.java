package com.tdd;

public class TrollTroller {

    public String removeVowels(String comment){
        comment = comment.replaceAll("(?i)[aeiou]", "");
        comment = comment.replaceAll("\\s+", " ");
        return comment.trim();
    }
}
