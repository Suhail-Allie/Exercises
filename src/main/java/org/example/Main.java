package org.example;

import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            // Allow the user to enter the number of students
            System.out.println("Enter the number of students: ");
            int numStudents = input.nextInt();

            // Create an array to hold the scores
            int[] scores = new int[numStudents];
            int bestScore = 0;

            // Allow the user to enter the scores and find the best score
            System.out.println("Enter the scores:");
            for (int i = 0; i < numStudents; i++) {
                System.out.println("Score for student " + (i + 1) + ": ");
                scores[i] = input.nextInt();
                if (scores[i] > bestScore) {
                    bestScore = scores[i];
                }
            }

            // Display the grades for each student
            for (int i = 0; i < numStudents; i++) {
                char grade;
                if (scores[i] >= bestScore - 10) {
                    grade = 'A';
                } else if (scores[i] >= bestScore - 20) {
                    grade = 'B';
                } else if (scores[i] >= bestScore - 30) {
                    grade = 'C';
                } else if (scores[i] >= bestScore - 40) {
                    grade = 'D';
                } else {
                    grade = 'F';
                }
                System.out.println("Student " + (i + 1) + " score is " + scores[i] + " and grade is " + grade);
            }

            input.close();
        }
    }



