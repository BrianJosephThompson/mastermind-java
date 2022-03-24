# Mastermind-Java

Welcome to my implementaiton of the famous mastermind game in the Java programming language.
This project is currently a work in progress.

## Description

Mastermind is a game composed of 8 pieces of different colors.
A secret code is then composed of 4 distinct pieces.

The player has 10 attempts to find the secret code.
After each input, the game indicates to the player the number of well placed pieces and the number of misplaced pieces.

Pieces are '0' '1' '2' '3' '4' '5' '6' '7'.

If the player finds the code, they win, and the game stops.
A misplaced piece is a piece that is present in the secret code but is not in a good position.

## Usage

Begin by cloning the repository

`git clone https://github.com/BrianJosephThompson/mastermind-java mastermind_java`

This will create a working repository named mastermind_java

The game has the option of receiving parameters.
    1. -c will be for the code.
    2. -t will be for the number of attempts.
In order to begin the game you must first navigate to the mastermind directory.

`cd mastermind`

Then we will compile the Java files. To do so enter the below in the command line.

`javac *.java`

Then you should specify the classpath for the file you wish to run. For this project that file will be Game.java. 
Example below:

`java -classpath /home/docode/project mastermind.Game`

You can use commane line arguments to specify the code yourself or the number of attempts yourself.
Example below:

`java -classpath /home/docode/project mastermind.Game -c 4242 -t 6`

where 4242 would be the code and 6 would be the allowable attempts.

Good luck and have fun!