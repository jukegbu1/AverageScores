package com.company;

import java.util.Scanner;

public class AverageScores {

    public static void main(String[] args) {

    Scanner keyboard = new Scanner (System.in);
    System.out.println("Enter a score");
    double score1= keyboard.nextDouble();

        System.out.println ("Enter a score");
        double score2=keyboard.nextDouble();

        System.out.println ("Enter a score");
        double score3 = keyboard.nextDouble();

        System.out.println ("Enter a score");
        double score4 = keyboard.nextDouble();

        System.out.println ("Enter a score");
        double score5 = keyboard.nextDouble();

        System.out.println ("Enter a score");
        double score6 = keyboard.nextDouble();

        System.out.println ("Enter a score");
        double score7 = keyboard.nextDouble();

        System.out.println ("Enter a score");
        double score8 = keyboard.nextDouble();

        System.out.println ("Enter a score");
        double score9 = keyboard.nextDouble();

        System.out.println ("Enter a score");
        double score10 = keyboard.nextDouble();

        double average;

        average= (score1 +score2 +score3 +score4 +score5 +score6 +score7 +score8 +score9 +score10)/10;

        System.out.println("Total = " + average);

    }
}