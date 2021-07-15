package com.bridgelab.moodanalyzer;

import com.bridgelab.moodanalyzer.MoodAnalysisException.ExceptionType;

/****************************************************************************************
 * @author mihir
 *
 * @since 13-July-2021
 * This class has all the methods that defines the project.
 * This class methods returns sad or happy expression according to the methods conditions.
 * Specifying customs exceptions for uncertain inputs.
 ****************************************************************************************/

public class MoodAnalyser
{
    public String userMessage;

    //non parameterized constructor
    public MoodAnalyser()
    {
        super();
    }

    //parameterized constructor
    public MoodAnalyser(String userMessage)
    {
        super();
        this.userMessage = userMessage;
    }

    /**
     * Name : analyseMood
     *
     * Description : This method calls parameterized analyseMood() method.
     *
     * @return
     *
     * Modification : First commit 13-July-2021
     */
    public String analyseMood()
    {
        return analyseMood(userMessage);
    }

    /**
     * Name : analyseMood
     *
     * Description : Analyzing mood happy or sad.
     *
     * @param userMessage //user given message.
     * @return //happy or sad.
     *
     * Algorithm : If user given message has happy or sad written in it.
     * then returning the respective matching string i.e either happy or sad.
     *
     * Modification : First commit 13-July-2021
     */
    public String analyseMood(String userMessage) throws MoodAnalysisException
    {
        try
        {
            if(userMessage.length() == 0)
            {
                throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.GIVEN_EMPTY,"Message can not be empty.");
            }
            if (userMessage.contains("sad"))
            {
                return "sad";
            }
            else
            {
                return "happy";
            }
        }
        catch (NullPointerException e)
        {
            throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.GIVEN_EMPTY, "Message can not be null.");
        }
    }
}
