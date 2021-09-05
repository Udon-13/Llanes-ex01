/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Max Llanes
 */
package Exercise01;
import java.util.Scanner;

//Create a program that prompts for your name and prints a greeting using your name.
//Perform the input, string concatenation, and output in separate statements.

public class Solution01
{
    /*
        prompt user to input name
        take name > string
        "words" + name + "more words"
        output name
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;
        System.out.println("What is you name? ");
        name = input.nextLine();
        name = "Hello, " + name + " ,nice to meet you!";
        System.out.println(name);


    }
}
