package com.tdd;
import org.junit.Assert;
import org.junit.Test;

public class TrollTrollerTest {

    @Test
    public void removingVowelsFromEmptyStringReturnsEmptyString(){
        TrollTroller trollTroller = new TrollTroller();
        Assert.assertEquals("", trollTroller.removeVowels(""));
    }
}
