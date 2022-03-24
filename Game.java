package com.github.brianjosephthompson.mastermind;

import java.util.Arrays;

public class Game {

    private static String[] savedArgs;
    private int[] codeCopy;
    private int wellPlacedPieces;
    private int misplacedPieces;
    public int currentRound = 0;
    public int[] currentGuess;
    public Input input;
    public Setup setup;

    public Game() {
        input = new Input();
        setup = new Setup();
    }

    public void startGame() {
        setup.setupGame();
        System.out.println("Welcome to Mastermind");
        System.out.println("Will you find the secret code?");
        while (currentRound < setup.getAttempts()) {
            System.out.println("----------------");
            System.out.println("Round " + currentRound);
            setWellPlacedPieces(0);
            setMisplacedPieces(0);
            setCodeCopy(setup.getSecretCode());
            currentGuess = input.convertArray(input.getInput());
            currentGuess = checkWellPlaced(currentGuess);
            checkMisplaced(currentGuess);
            if (getWellPlacedPieces() == 4) {
                System.out.println("Congratulations! you won!");
                break;
            }
            currentRound++;
        }
        if (currentRound == setup.getAttempts()) System.out.println("Better Luck Next Time!");
    }

    public int[] checkWellPlaced(int[] guess) {
        int i = 0;
        int wellPlacedTemp = 0;
        int [] codeCopyTemp = getCodeCopy();
        while (i < 4 - wellPlacedTemp) {
            if (guess[i] == codeCopyTemp[i]) {
                wellPlacedTemp++;
                guess = removeArrayElement(guess, i);
                codeCopyTemp = removeArrayElement(codeCopyTemp, i);
                i--;
            }
            i++;
        }
        setWellPlacedPieces(wellPlacedTemp);
        setCodeCopy(codeCopyTemp);
        System.out.println("Well Placed Pieces: " + wellPlacedTemp);
        return guess;
    }

    public void checkMisplaced(int[] guess) {
        int i = 0;
        int misplacedTemp = 0;
        int[] codeCopyTemp = getCodeCopy();
        while (i < 4 - getWellPlacedPieces()) {
            int j = 0;
            while (j < 4 - getWellPlacedPieces()) {
                if (guess[i] == codeCopyTemp[j] ) {
                    misplacedTemp++;
                    break;
                }
                j++;
            }
            i++;
        }
        setMisplacedPieces(misplacedTemp);
        System.out.println("Misplaced Pieces: " + misplacedTemp);
    }



    public static int[] removeArrayElement(int[] arr, int index)
    {
        if (arr == null
            || index < 0
            || index >= arr.length) {
            return arr;
        }
 
        int[] anotherArray = new int[arr.length - 1];
        System.arraycopy(arr, 0, anotherArray, 0, index);
        System.arraycopy(arr, index + 1,
                        anotherArray, index,
                        arr.length - index - 1);
        return anotherArray;
    }

    public static void main(String args[]) {
        savedArgs = args;
        Game game = new Game();
        game.startGame();
    }

    public static String[] getArgs() {
        return savedArgs;
    }

    public void setWellPlacedPieces(int i) {
        wellPlacedPieces = i;
    }

    public int getWellPlacedPieces() {
        return wellPlacedPieces;
    }

    public void setMisplacedPieces(int i) {
        misplacedPieces = i;
    }

    public int getMisplacedPieces() {
        return misplacedPieces;
    }

    public void setCodeCopy(int[] i) {
        codeCopy = i;
    }

    public int[] getCodeCopy() {
        return codeCopy;
    }
}