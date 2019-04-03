package com.tdd;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class SmileyCheckerTest {

    private SmileyChecker smileyChecker;

    @Before
    public void initializer(){
        smileyChecker = new SmileyChecker();
    }

    public int countSmileys(String[] smileys){
        int counter = 0;
        for(String smiley : smileys){
            if (smileyChecker.isASmiley(smiley)){
                counter++;
            }
        }
        return counter;
    }


    @Test
    public void emptyEntryIsNotASmiley(){
        Assert.assertFalse(smileyChecker.isASmiley(""));
    }

    @Test
    public void sadFaceIsNotASmiley(){
        Assert.assertFalse(smileyChecker.isASmiley(":("));
    }

    @Test
    public void happyFaceIsASmiley(){
        Assert.assertTrue(smileyChecker.isASmiley(":)"));
        Assert.assertTrue(smileyChecker.isASmiley(":D"));
    }

    @Test
    public void winkFaceIsASmiley(){
        Assert.assertTrue(smileyChecker.isASmiley(";)"));
    }

    @Test
    public void smileyCanHaveNose(){
        Assert.assertTrue(smileyChecker.isASmiley(":-D"));
        Assert.assertTrue(smileyChecker.isASmiley(";~)"));
    }

    @Test
    public void smileysAreCounted(){
        String[] smileys =  {":)", ";(", ";}", ":-D"};
        Assert.assertEquals(2, countSmileys(smileys));

        smileys = new String[] {";D", ":-(", ":-)", ";~)"};
        Assert.assertEquals(3, countSmileys(smileys));

        smileys = new String[] {";]", ":[", ";*", ":$", ";-D"};
        Assert.assertEquals(1, countSmileys(smileys));
    }

}
