package com.javarush.test.level12.lesson04.task02;

/* print(int) и print(Integer)
Написать два метода: print(int) и print(Integer).
Написать такой код в методе main, чтобы вызвались они оба.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Integer a = 4;
        int b = 5;
        print(a);
        print(b);
    }

    //Напишите тут ваши методы
    public static void print(int n){
        System.out.println(n);
    }
    public static void print(Integer n){
        System.out.println(n);
    }
}
