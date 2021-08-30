/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Tyler Goldsmith
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int min_age=16;
        double R=0;
        System.out.print("Enter 1 if you are male, 2 if you are female: ");
        String Str1 = input.nextLine();
        System.out.print("How many ounces of alcohol did you have? ");
        String Str2 = input.nextLine();
        System.out.print("What is your weight, in pounds? ");
        String Str3 = input.nextLine();
        System.out.print("How many hours since your last drink? ");
        String Str4 = input.nextLine();
        if(Str1.equals("1"))
            R=0.73;
        else if(Str1.equals("2"))
            R=0.66;
        double oz= Double.parseDouble(Str2);
        double W= Double.parseDouble(Str3);
        double H= Double.parseDouble(Str4);
        double BAC=(oz*5.14/W*R)-0.015*H;
        String drive= BAC>=0.08?
                "It is not legal for you to drive":"It is legal for you to drive";
        System.out.format("Your BAC if %f\n%s",BAC,drive);
    }
}