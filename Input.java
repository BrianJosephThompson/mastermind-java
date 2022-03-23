package com.github.brianjosephthompson.mastermind;

import java.io.*;

import java.util.Arrays;


public class Input {

    static String getInput() {
        String entry = null;
        try {
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
            entry = is.readLine();
        } catch (IOException e) {
            System.out.println("IOException: " + e);
        }
        return entry;
    }

    static int[] convertArray(String entry)
    {
        String[] entryArray = entry.split("");
        int[] integerArray = new int[entryArray.length];
        for (int i = 0; i < entryArray.length; i++) {
            integerArray[i] = Integer.parseInt(entryArray[i]);
        }

        System.out.println("Array generated = " + Arrays.toString(integerArray));
        return integerArray;
    }

}