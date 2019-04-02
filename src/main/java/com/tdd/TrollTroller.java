package com.tdd;

import java.util.regex.Pattern;

public class TrollTroller {

    public String removeVowels(String comment){
        Pattern vowels = Pattern.compile("[aeiou]", Pattern.CASE_INSENSITIVE);
        Pattern spaces = Pattern.compile("\\s+");

        comment = vowels.matcher(comment).replaceAll("");
        comment = spaces.matcher(comment).replaceAll(" ");

        return comment.trim();
    }
}
