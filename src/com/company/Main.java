package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Mad Libs
    //Create 3 size 5 arrays
        //One array should have 5 single word strings, each of which is a noun.
        //One array should have 5 single word strings, each of which is an adjective.
        //One array should have 5 single word strings, each of which is a verb.
    //The Java Util class Random has a nextInt() method that can be used to get a random number
        // from the range of zero to the number passed in as a parameter.
    //Write a small story that randomly gets words from each array to fill in blank
        // points in the story based on the word type.
    //Don’t forget to stage and commit changes in git as you go along
    //Bonus: Get the words to fill each array by asking the user to supply them.
        //import Scanner
        //have user enter a noun, adjective, and verb

        //turning part two into comment, can revisit
        String [] listOfNouns = {"bird","dog","photograph","eyes","ocean"};
        String [] listOfAdjectives = {"beautiful","blue","funny","giant","runny"};
        String [] listOfVerbs = {"run","jump","fly","type","sleep"};

        /*creating new lists with 5 inputs, user will generate
        String [] listOfNouns = new String[5];
        String [] listOfAdjectives = new String[5];
        String [] listOfVerbs = new String[5];
        //import new scanner */
        Scanner userInput = new Scanner(System.in);
        Random rand = new Random();

        //create madlibs story
        String story = "There once was a " + listOfAdjectives[rand.nextInt(5)] + " " +
                listOfNouns[rand.nextInt(5)] + " that loved to " +listOfVerbs[rand.nextInt(5)] + ".";

        System.out.println(story);


    }
}
