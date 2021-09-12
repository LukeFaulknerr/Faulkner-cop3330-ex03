/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Luke Faulkner
 */

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        // Variables / Objects
        Scanner readName = new Scanner(System.in);
        String quoteInput, authorInput;

        // Prompt 1
        System.out.print("What is the quote? ");
        quoteInput = readName.nextLine();

        // Prompt 2
        System.out.print("Who said it? ");
        authorInput = readName.nextLine();

        // Output
        System.out.println(authorInput + " says, " + "\""+ quoteInput + "\"");
    }
}
