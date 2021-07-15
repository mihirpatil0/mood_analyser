package com.bridgelab.moodanalyzer;

/**
 * @author mihir
 *
 * @since 13-July-2021
 * This class represent custom exception.
 */
public class MoodAnalysisException extends RuntimeException
{
    public enum ExceptionType
    {
        GIVEN_NULL, GIVEN_EMPTY
    }

    public ExceptionType type;
    public MoodAnalysisException(ExceptionType givenEmpty, String message)
    {
        super(message);
    }
}
