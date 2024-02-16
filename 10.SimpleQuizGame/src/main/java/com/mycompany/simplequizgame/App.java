/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.simplequizgame;

/**
 *
 * @author Sanele
 */

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Questions and answers
        String[] questions = {
            "What is the capital of France?",
            "Who wrote 'Romeo and Juliet'?",
            "What is the chemical symbol for water?"
        };
        String[] answers = {
            "Paris",
            "William Shakespeare",
            "H2O"
        };
        
        int score = 0;
        
        // Iterate through questions
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            String userAnswer = scanner.nextLine();
            
            // Check if answer is correct
            if (userAnswer.equalsIgnoreCase(answers[i])) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect. The correct answer is: " + answers[i]);
            }
        }
        
        System.out.println("Quiz complete! Your score is: " + score + "/" + questions.length);
        
        scanner.close();
    }

    
}
