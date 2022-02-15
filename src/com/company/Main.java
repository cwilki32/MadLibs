package com.company;

import java.util.Random;

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

        String [] listOfNouns = {"bird","dog","photograph","eyes","ocean"};
        String [] listOfAdjectives = {"beautiful","blue","funny","giant","runny"};
        String [] listOfVerbs = {"runs","jumps","flies","types","sleeps"};

        Random rand = new Random();
        int i;
        int j;
        int k;
        i = rand.nextInt(5);
        j = rand.nextInt(5);
        k = rand.nextInt(5);

        System.out.println("The " + listOfAdjectives[i] + " " + listOfNouns[j] + " " + listOfVerbs[k] + ".");


    }
}
