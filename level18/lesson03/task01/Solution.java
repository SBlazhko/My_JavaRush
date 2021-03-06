package com.javarush.test.level18.lesson03.task01;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* Максимальный байт
Ввести с консоли имя файла
Найти максимальный байт в файле, вывести его на экран.
Закрыть поток ввода-вывода
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fr = new FileInputStream(reader.readLine());

        int max = 0;
        while(fr.available() > 0){
            int d = fr.read();
            if(d > max) max = d;
        }
        reader.close(); fr.close();
        System.out.println(max);
    }
}
