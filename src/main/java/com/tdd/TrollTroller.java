package com.tdd;

import java.util.regex.Pattern;

public class TrollTroller {

    public String removeVowels(String comment){

        Pattern p = Pattern.compile("[aeiou]", Pattern.CASE_INSENSITIVE);
        Pattern q = Pattern.compile("\\s+");

        String noVowels = p.matcher(comment).replaceAll("");
        String noDoubleSpaces = q.matcher(noVowels).replaceAll(" ");

        return noDoubleSpaces.trim();
    }
}
