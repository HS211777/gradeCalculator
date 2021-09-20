package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the maximum marks for the test:");
        int maxMarks = input.nextInt();

        System.out.println("Enter the number of marks the student obtained:");
        int marksObtained = input.nextInt();

        double percentageMark = (double) marksObtained / maxMarks * 100;
        if (marksObtained > maxMarks || marksObtained < 0) {
            percentageMark = -1;
        }

        if (percentageMark >= 80) {
            System.out.println("they got an A");
        } else if (percentageMark >= 70) {
            System.out.println("they got a B");
        } else if (percentageMark >= 60) {
            System.out.println("they got a C");
        } else if (percentageMark >= 50) {
            System.out.println("they got a D");
        } else if (percentageMark >= 40) {
            System.out.println("they got an E");
        } else if (percentageMark == -1) {
            System.out.println("Error");
        } else {
            System.out.println("they got a U");
        }
    }
}
