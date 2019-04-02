package com.tdd;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TrollTrollerTest {

    private TrollTroller trollTroller;

    @Before
    public void initialize(){
        trollTroller = new TrollTroller();
    }

    @Test
    public void messageIsNotModifiedIfNoVowelsAreFound(){
        Assert.assertEquals("", trollTroller.removeVowels(""));
        Assert.assertEquals("FK", trollTroller.removeVowels("FK"));
    }

    @Test
    public void vowelsAreRemovedFromMessage(){
        Assert.assertEquals("HT", trollTroller.removeVowels("HATE"));
    }

    @Test
    public void transformedMessageHasNoVowelsOrMultipleSpaces(){
        Assert.assertEquals("HT Y", trollTroller.removeVowels("I HATE YOU"));
        Assert.assertEquals("HY HT Y", trollTroller.removeVowels("HEY I HATE YOU"));
        Assert.assertEquals("Ths wbst s fr lsrs LL!", trollTroller.removeVowels("This website is for losers LOL!"));
    }

}
