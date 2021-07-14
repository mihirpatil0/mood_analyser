package com.bridgelab.moodanalyzer;

/**************************************************************
 * @author mihir
 *
 * @since
 * 13-July-2021
 * This is main class for moodanalyser project.
 * From this class we are calling methods of moodanalyser class.
 **************************************************************/

public class MoodAnalyserMain
{
    public static void main(String[] args)
    {
        MoodAnalyser moodAnalyserObj = new MoodAnalyser();
        String userMessage = "Today i am sad";
        System.out.println(moodAnalyserObj.analyseMood(userMessage));
    }
}
