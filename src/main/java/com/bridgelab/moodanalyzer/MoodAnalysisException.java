package com.bridgelab.moodanalyzer;

/**
 * @author mihir
 *
 * @since 13-July-2021
 * This class represent custom exception.
 */
public class MoodAnalysisException extends RuntimeException
{
    public MoodAnalysisException(String message)
    {
        super(message);
    }
}
