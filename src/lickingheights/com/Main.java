package lickingheights.com;

import java.awt.*;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        //declare
        Scanner keyboard;
        keyboard = new Scanner(System.in);
        String greeting;
        String consent;
        int number;
        int value;
        int testing;
        String Question;

        int ten;
        ten = 10;
        String question;
        int pickedNumber;





        System.out.println("Hello there!");
        greeting = keyboard.nextLine();
        System.out.println("Would you like to use the magic 8 ball?");
        consent = keyboard.nextLine();
        System.out.println("You can go ahead and ask a question");
        Question = keyboard.nextLine();
        System.out.println( "Can you give me a number between 1-100?");
        pickedNumber = keyboard.nextInt();



        if (ten>pickedNumber)
            System.out.println("Definitely you should");
        else if (pickedNumber<20)
            System.out.println("Absolutely Yes");
        else if (pickedNumber<30)
            System.out.println("Yes, Most definitely");
        else if (pickedNumber<40)
            System.out.println("Definitely");
        else if (pickedNumber<50)
            System.out.println("No Definitely no");
        else if (pickedNumber<60)
           System.out.println("Yes go for it");
        else if (pickedNumber<70)
            System.out.println("Don't count on it");
        else if (pickedNumber<80)
            System.out.println("my sources say yes");
        else if (pickedNumber<90)
            System.out.println("My sources say no");
        else if (pickedNumber<100)
            System.out.println("I thought about it long and hard but it is not likely");


        }













    }

