/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Sathvik Kuthuru
 */

import java.util.Scanner;

public class Solution04 {
    // Prompt user for a noun, verb, adjective, and adverb
    // Read the input the user gives from standard in
    // Place the words the user gives into the story
    // Print the story to standard output

    static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        String noun = promptUser("noun");
        String verb = promptUser("verb");
        String adjective = promptUser("adjective");
        String adverb = promptUser("adverb");
        System.out.printf("My friend's %s %s likes to %s %s!", adjective, noun, verb, adverb);
    }

    static String promptUser(String use) {
        System.out.printf("Enter a %s:\n", use);
        String input = scan.nextLine();
        return input;
    }
}
