package com.github.brianjosephthompson.mastermind;

import java.util.Random;

public class CodeGenerator {

    public int[] generateCode() {
        int[] numberSelection = new int[]{0, 1, 2, 3, 4, 5, 6, 7};
        int[] secretCode = new int[4];
        Random randNum = new Random();
        for (int i = 0; i < 4; i++) {
            secretCode[i] = randNum.nextInt(numberSelection.length);
        }
        return secretCode;
    }
}