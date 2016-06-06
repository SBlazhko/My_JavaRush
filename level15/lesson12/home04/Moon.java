package com.javarush.test.level15.lesson12.home04;

/**
 * Created by BlazhkoS on 24.05.2016.
 */
public class Moon implements Planet
{
    private Moon()
    {
    }

    private static Moon instance;

    public static synchronized Moon getInstance()
    {
        if (instance == null)
        {
            instance = new Moon();
        }
        return instance;
    }
}
