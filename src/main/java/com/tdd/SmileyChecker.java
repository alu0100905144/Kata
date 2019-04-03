package com.tdd;

public class SmileyChecker {
    public boolean isASmiley(String smiley){
        return smiley.matches("[:;][-~]?[\\)D]");
    }
}
