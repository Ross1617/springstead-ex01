/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution 01
 *  Copyright 2021 Ross Springstead
 */
// Create a program that prompts for your name and prints a greeting using your name.
/*
    print a prompt that asks for the user to input a name
    create a string called greeting
    create a string variable called name that takes the user input and assigns it to the name
    check to see if the name is equal to one of three names
    if it is concatenate the name with correct greeting phrases and assign it to greeting
    else concatenate the name with the generic phrase then assign it to greeting
    print greeting
 */


import java.util.Scanner;

public class Solution01 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String greeting;
        System.out.printf("What is your name?\n");
        String name = input.nextLine();
        if(name.equals("Ross")){
            greeting = "Hey " + name + ", did you know that Ross is my name too?";

        }
        else if(name.equals("Bruno")){
            greeting = "Howdy " + name + ", I hope your day is going okay.";

        }
        else if(name.equals("Zach")){
            greeting = "Hi " + name + ", I hope your day is going great!";

        }
        else {
            greeting = "Welcome " + name + ", I hope your day is going good!";
        }
        System.out.printf(greeting);

    }
}
