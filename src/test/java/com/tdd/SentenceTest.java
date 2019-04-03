package com.tdd;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SentenceTest {

    private Sentence sentence;

    @Before
    public void initializer(){
        sentence = new Sentence("Buenos días!");
    }

    @Test
    public void emptySentenceIsTheEndOfAnySentence(){
        Assert.assertTrue( sentence.matchesTheEnding( ""));
    }

    @Test
    public void aSentenceIsItsOwnEnding(){
        Assert.assertTrue(sentence.matchesTheEnding( "Buenos días!"));
    }

    @Test
    public void endOfSentenceNotCorrespondingToOriginalSentence(){
        Assert.assertFalse(sentence.matchesTheEnding( "asd"));
    }

    @Test
    public void endOfSentenceDoesCorrespondToOriginalSentence(){
        Assert.assertTrue(sentence.matchesTheEnding("as!"));
    }
}
