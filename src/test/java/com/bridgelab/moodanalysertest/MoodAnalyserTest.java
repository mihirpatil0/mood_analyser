package com.bridgelab.moodanalysertest;

import com.bridgelab.moodanalyzer.MoodAnalyser;
import com.bridgelab.moodanalyzer.MoodAnalysisException;
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

    @Test
    public void givenUserMessageInConstructor_whenIAmInSadMood_shouldReturnSad()
    {
        MoodAnalyser moodAnalyser = new MoodAnalyser("i am in sad mood");
        assertEquals("sad",moodAnalyser.analyseMood());
    }

    @Test
    public void givenUserMessageInConstructor_whenIAmInHappyMood_shouldReturnHappy()
    {
        MoodAnalyser moodAnalyser = new MoodAnalyser("i am in happy mood");
        assertEquals("happy",moodAnalyser.analyseMood());
    }

    @Test
    public void givenUserMessageInConstructor_whenNull_shouldReturnHappy()
    {
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        assertEquals("happy",moodAnalyser.analyseMood());
    }

    @Test
    public void givenMessageInConstructor_whenNull_shouldReturnHappy()
    {
        try
        {
            MoodAnalyser moodAnalyser = new MoodAnalyser(null);
            assertEquals("happy",moodAnalyser.analyseMood());
        }
        catch (MoodAnalysisException e)
        {
            assertEquals("Message can not be null.",e.getMessage());
        }
    }
}
