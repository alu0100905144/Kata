package com.tdd;
import org.junit.Assert;
import org.junit.Test;

public class TrollTrollerTest {

    @Test
    public void returnOriginalMessageIfEmptyMessageIsReceived(){
        TrollTroller trollTroller = new TrollTroller();
        Assert.assertEquals("", trollTroller.removeVowels(""));
    }

    @Test
    public void returnsOriginalMessageIfAnOnlyConsonantsMessageIsReceived(){
        TrollTroller trollTroller = new TrollTroller();
        Assert.assertEquals("FK", trollTroller.removeVowels("FK"));
    }

    @Test
    public void returnsMessageWithoutVowelsWhenStandardMessageIsReceived(){
        TrollTroller trollTroller = new TrollTroller();
        Assert.assertEquals("HT Y", trollTroller.removeVowels("I HATE YOU"));
    }

    @Test
    public void returnsMessageWithoutVowelsWhenStandardMessageIsReceived2(){
        TrollTroller trollTroller = new TrollTroller();
        Assert.assertEquals("HY HT Y", trollTroller.removeVowels("HEY I HATE YOU"));
    }
}
