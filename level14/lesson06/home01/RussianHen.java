package com.javarush.test.level14.lesson06.home01;

/**
 * Created by BlazhkoS on 17.05.2016.
 */
public class RussianHen extends Hen
{
    @Override
    public int getCountOfEggsPerMonth()
    {
        return 15;
    }

    public String getDescription(){

        return super.getDescription() + " Моя страна - " + RUSSIA + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
