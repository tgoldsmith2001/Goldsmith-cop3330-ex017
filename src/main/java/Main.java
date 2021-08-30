/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Tyler Goldsmith
 */
import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String In="";
        int min_age=16,Sex=1,oz=0,W=0,H=0;
        double R=0;
        //Try catch statement check for exceptions (when input cannot be stored as int
        while(true){
            try{
                System.out.print("Enter 1 if you are male, 2 if you are female: ");
                In = input.nextLine();
                Sex=Integer.parseInt(In);
            }catch(Exception  e) {
                System.out.println("Invalid input, try again");
                continue;
            }if (Sex != 1 && Sex != 2) {
                System.out.println("Invalid input, try again");
            }else {
                break;
            }
        }
        while(true){
            try{
                System.out.print("How many ounces of alcohol did you have? ");
                In = input.nextLine();
                oz=Integer.parseInt(In);
            }catch(Exception  e){
                System.out.println("Invalid input, try again");
                continue;
            }
            break;
        }
        while(true){
            try{
                System.out.print("What is your weight, in pounds? ");
                In = input.nextLine();
                W=Integer.parseInt(In);
            }catch(Exception  e){
                System.out.println("Invalid input, try again");
                continue;
            }
            break;
        }
        while(true){
            try{
                System.out.print("How many hours since your last drink? ");
                In = input.nextLine();
                H=Integer.parseInt(In);
            }catch(Exception  e){
                System.out.println("Invalid input, try again");
                continue;
            }
            break;
        }
        if(Sex==1)
            R=0.73;
        else if(Sex==2)
            R=0.66;
        double BAC=(oz*5.14/W*R)-0.015*H;
        String drive= BAC>=0.08?
                "It is not legal for you to drive":"It is legal for you to drive";
        System.out.format("Your BAC if %f\n%s",BAC,drive);
    }
}