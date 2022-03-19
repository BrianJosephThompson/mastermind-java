package com.github.brianjosephthompson.mastermind;

import java.util.Arrays;
import java.util.Random;

public class CodeGenerator {

    public static int[] generateCode() {
        int[] numberSelection = new int[]{0, 1, 2, 3, 4, 5, 6, 7};
        int[] secretCode = new int[4];
        Random randNum = new Random();
        for (int i = 0; i < 4; i++) {
            secretCode[i] = randNum.nextInt(numberSelection.length);
        }
        System.out.println("Array generated = " + Arrays.toString(secretCode));
        return secretCode;
    }


    public static void main(String args[]) {
      generateCode();
   }
}