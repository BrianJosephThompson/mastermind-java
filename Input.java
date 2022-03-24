package com.github.brianjosephthompson.mastermind;

import java.io.*;

import java.util.Arrays;


public class Input {

    public String getInput() {
        String entry = null;
        boolean correctEntry = false;
        while (!correctEntry) {
            try {
                BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
                entry = is.readLine();
                int inputTest = Integer.parseInt(entry);
                if (entry.length() != 4 ) {
                    System.out.println("invalid input");
                } else {
                    correctEntry = true;
                }
            } catch (IOException e) {
                System.out.println("invalid input");
            } catch (NumberFormatException e) {
                System.out.println("invalid input");
            } 
        }
        return entry;
    }

    public int[] convertArray(String entry)
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