package com.github.brianjosephthompson.mastermind;

import java.util.Arrays;
import java.io.*;

public class Input {

    static String getInput(String prompt) {
        String entry = null;
        try {
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
            entry = is.readLine();
        } catch (IOException e) {
            System.out.println("IOException: " + e);
        }
        System.out.println(entry);
        guessArray(entry);
        return entry;
    }

    static int[] guessArray(String entry)
    {
 
        String[] entryArray = entry.split("");
        int[] integerArray = new int[entryArray.length];
 
        for (int i = 0; i < entryArray.length; i++) {
            integerArray[i] = Integer.parseInt(entryArray[i]);
        }
        System.out.println("Array generated = " + Arrays.toString(integerArray));
        return integerArray;
    }

    public static void main(String args[]) {
      getInput("Input:");
   }
}