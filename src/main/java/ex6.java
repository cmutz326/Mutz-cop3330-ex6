/*
 *   UCF COP 3330 Fall 2021 Assignment 1 Solution
 *   Copyright 2021 Christina Mutz
 *
 *   Exercise 6 solution
 */
import java.util.Scanner;

public class ex6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("What is your current age?");   //prompt the user for input
        var age = sc.nextInt();

        System.out.println("At what age would you like to retire?");
        var retire = sc.nextInt();

        var currentyear = 2021;
        var years = retire - age;     //calculate how long till user is the retiring age

        System.out.println("You have " + years + " years left until you retire."); //tell user how many years they have left


        var retireyear = currentyear + years;

        System.out.println("It's " + currentyear + ", so you can retire in " + retireyear + "."); //tell user what year they can retire

    }
}