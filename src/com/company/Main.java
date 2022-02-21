package com.company;

import java.util.ArrayList;
import java.util.List;
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
        //refactor program using arraylists vs arrays

        //turning part two into comment, can revisit
        /*
        String [] listOfNouns = {"bird","dog","photograph","eyes","ocean"};
        String [] listOfAdjectives = {"beautiful","blue","funny","giant","runny"};
        String [] listOfVerbs = {"run","jump","fly","type","sleep"}; */

        //creating new lists with 5 inputs, user will generate
//        String[] listOfNouns = new String[5];
//        String[] listOfAdjectives = new String[5];
//        String[] listOfVerbs = new String[5];
//        //import new scanner
//
//        Scanner userInput = new Scanner(System.in);
//        Random rand = new Random();
//        //have user build nouns
//        System.out.println("Enter 5 nouns: ");
//        for (int i = 0; i < listOfNouns.length; i++) {
//            listOfNouns[i] = userInput.next();
//        }
//        System.out.println("Enter 5 adjectives: ");
//        for (int i = 0; i < listOfAdjectives.length; i++) {
//            listOfAdjectives[i] = userInput.next();
//        }
//        System.out.println("Enter 5 verbs: ");
//        for (int i = 0; i < listOfVerbs.length; i++) {
//            listOfVerbs[i] = userInput.next();
//        }
//
//        //create madlibs story
//        String story = "There once was a " + listOfAdjectives[rand.nextInt(5)] + " " +
//                listOfNouns[rand.nextInt(5)] + " that loved to " + listOfVerbs[rand.nextInt(5)] + "." +
//                '\n' + "Then a " + listOfAdjectives[rand.nextInt(5)] + " " + listOfNouns[rand.nextInt(5)]
//                + " made it " + listOfVerbs[rand.nextInt(5)] + ".";
//
//        System.out.println(story);c
        Random rand = new Random();
        List<String> listOfNouns = new ArrayList<>();
        List<String> listOfAdjectives = new ArrayList<>();
        List<String> listOfVerbs = new ArrayList<>();
        int INDEX_MAX = 5;
//        listOfNouns.add("bird");
//        listOfNouns.add("house");
//        listOfNouns.add("ocean");
//        listOfNouns.add("dog");
//        listOfNouns.add("photograph");
//        listOfAdjectives.add("beautiful"); //{"beautiful","blue","funny","giant","runny"}
//        listOfAdjectives.add("blue");
//        listOfAdjectives.add("funny");
//        listOfAdjectives.add("giant");
//        listOfAdjectives.add("sad");
//        listOfVerbs.add("run"); //"run","jump","fly","type","sleep"
//        listOfVerbs.add("jump");
//        listOfVerbs.add("fly");
//        listOfVerbs.add("type");
//        listOfVerbs.add("sleep");

                Scanner userInput = new Scanner(System.in);
        //have user build nouns
        System.out.println("Enter 5 nouns: ");
        for (int i = 0; i < INDEX_MAX; i++) {
            listOfNouns.add(userInput.next());
        }
        System.out.println("Enter 5 adjectives: ");
        for (int i = 0; i < INDEX_MAX; i++) {
            listOfAdjectives.add(userInput.next());
        }
        System.out.println("Enter 5 verbs: ");
        for (int i = 0; i < INDEX_MAX; i++) {
            listOfVerbs.add(userInput.next());
        }

        String story = "There once was a " + listOfAdjectives.get(rand.nextInt(5)) + " " +
                listOfNouns.get(rand.nextInt(5)) + " that loved to " + listOfVerbs.get(rand.nextInt(5)) + "." +
                '\n' + "Then a " + listOfAdjectives.get(rand.nextInt(5)) + " " + listOfNouns.get(rand.nextInt(5))
                + " made it " + listOfVerbs.get(rand.nextInt(5)) + ".";

        System.out.println(story);

    }
}
