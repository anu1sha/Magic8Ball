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

        int ten;
        ten = 10;
        String question;




        System.out.println("Hello there!");
        greeting = keyboard.nextLine();
        System.out.println("Would you like to use the magic 8 ball?");
        consent = keyboard.nextLine();
        System.out.println("okay, go ahead and ask a question");
        question = keyboard.nextLine();
        System.out.println("Okay, pick a number between 0-100");
        number = keyboard.nextInt();

        if (ten>number)
            System.out.println("Definitely you should");
        else if (number<20)
            System.out.println("I could not understand ask again");
        else if (number<30)
            System.out.println("Yes, Most definitely");
        else if (number<40)
            System.out.println("Maybe you should consider your options first");
        else if (number<50)
            System.out.println("No Definitely no");
        else if (number<60)
           System.out.println("Yes go for it");
        else if (number<70)
            System.out.println("Don't count on it");
        else if (number<80)
            System.out.println("my sources say yes");
        else if (number<90)
            System.out.println("My sources say no");
        else if (number<100)
            System.out.println("I thought about it long and hard but it is not likely");


        }













    }

