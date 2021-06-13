/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Abdel Nabut
 */

package ex35;

import java.util.ArrayList;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        ArrayList contestants = new ArrayList();
        String contestant;
        while(true) {
            System.out.println("Enter a name: ");
            contestant = input.nextLine();
            if(contestant == "")
                break;
            else {
                contestants.add(contestant);
            }
        }
        int winner = (int) (Math.random() * contestants.size());
        System.out.println("The winner is: " + contestants.get(winner));
    }
}
