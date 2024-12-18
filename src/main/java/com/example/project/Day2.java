
package com.example.project;
import java.util.Random;

public class Day2{
    public static String[][] nameSort(String[] names){ // your will be tested on this method
        String[][] naughtyList = new String[2][names.length];

        for (int i = 0; i < names.length; i ++) {
            int randomIdx = (int)(Math.random() * (2 - 1) + 1);
            naughtyList[randomIdx][i] = names[i];
        }
        return naughtyList; //you must return a two dimensional string array
    }

    public static void main(String[] args) {

    }
}