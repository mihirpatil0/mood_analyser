package com.bridgelab.moodanalysertest;

import com.bridgelab.moodanalyzer.MoodAnalyser;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**************************************************************
 * @author mihir
 *
 * @since 13-July-2021
 * This class has test cases for all the the possible scenarios.
 **************************************************************/

public class MoodAnalyserTest
{
    @Test
    public void givenUserMessage_whenSad_shouldReturnSad()
    {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        assertEquals("sad",moodAnalyser.analyseMood("I am in sad mood"));
    }

    @Test
    public void givenUserMessage_whenInAnyMood_shouldReturnHappy()
    {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        assertEquals("happy",moodAnalyser.analyseMood("I am in any mood"));
    }
}
