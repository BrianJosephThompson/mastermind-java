package com.github.brianjosephthompson.mastermind;

import java.util.Arrays;

import java.util.Objects;

public class Setup {

    private int attempts;
    private int[] secretCode;
    public Input input;
    public CodeGenerator codeUndefined;


    public Setup() {
        input = new Input();
        codeUndefined = new CodeGenerator();
    }

    public void setupGame() {
        String[] args = Game.getArgs();

        for (int i = 0; i < args.length; i++) {
            if (Objects.equals(args[i], "-c")) {
                setSecretCode(input.convertArray(args[i + 1]));
            }
            if (Objects.equals(args[i], "-t")) {
                setAttempts(Integer.parseInt(args[i + 1]));
            }
        } 
        if (secretCode == null) {
            setSecretCode(codeUndefined.generateCode());
        }
        if (attempts == 0) {
            setAttempts(10);
        }
        System.out.println(attempts);
        System.out.println(Arrays.toString(secretCode));
    }

        public void setAttempts(int i) {
        attempts = i;
    }

        public int getAttempts() {
        return attempts;
    }

        public void setSecretCode(int[] i) {
        secretCode = i;
    }

        public int[] getSecretCode() {
        return secretCode;
    }
}