import java.util.Scanner;


//Exercise 1
//public class Lesson9 {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter first number: ");
//        int firstNumber = input.nextInt();
//        System.out.print("Enter second number: ");
//        int secondNumber = input.nextInt();
////        double result = firstNumber / secondNumber;
////        System.out.format("%d / %d = %.2f%n", firstNumber, secondNumber, result);
//        try {
//            double result1 = firstNumber / secondNumber;
//            System.out.format("%d / %d = %.2f%n", firstNumber, secondNumber, result1);
//        } catch (Exception e) {
//            System.out.println("I am sorry, but something went wrong");
//        }
//        try {
//            double result = firstNumber / secondNumber;
//            System.out.format("%d / %d = %.2f%n", firstNumber, secondNumber, result);
//        } catch (Exception e) {
//            System.out.println(e.toString());
//        }
//        }
//}

//Exercise 2
//import java.util.*;
//import java.io.File;
//import java.io.FileNotFoundException;
//
//public class Lesson9 {
//
//    public static void exception1() {
//        // ArithmeticException
//        try {
//            int exception1 = 10 / 0;
//            System.out.println(exception1);
//        } catch (Exception e) {
//            System.out.println(e.toString());
//        }
//    }
//
//    public static void exception2() {
//        // ArithmeticException
//        int exception2 = Integer.MAX_VALUE + 1;
//    }
//
//    public static void exception3() {
//        // ArrayIndexOutOfBoundsException
//        int[] myArray3 = new int[5];
//        try {
//            int exception3 = myArray3[5];
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println(e.toString());
//        }
//    }
//
//    public static void exception4() {
//        // NullPointerException
//        int[] myArray4 = null;
//        try {
//            int exception4 = myArray4[0];
//        } catch (NullPointerException e) {
//            System.out.println(e.toString());
//        }
//    }
//
//    public static void exception5() {
//        // FileNotFoundException
//        try {
//            File exception5 = new File("exception5.txt");
//            Scanner scanner = new Scanner(exception5);
//        } catch (FileNotFoundException e) {
//            System.out.println(e.toString());
//        }
//    }
//
//    public static void exception6() {
//        // NumberFormatException
//        String thisString = "Hello";
//        try {
//            int exception6 = Integer.parseInt(thisString);
//        } catch (NumberFormatException e) {
//            System.out.println(e.toString());
//        }
//    }
//
//    public static void exception7() {
//        // NullPointerException
//        String exception7 = null;
//        try {
//            System.out.println(exception7.toUpperCase());
//        } catch (NullPointerException e) {
//            System.out.println(e.toString());
//        }
//    }
//
//    public static void main(String[] args) {
//        exception1();
//        exception2();
//        exception3();
//        exception4();
//        exception5();
//        exception6();
//        exception7();
//    }
//}
//Exercise 3

public class Lesson9 {

    public static int askQuestion(int number1, int number2){
        Scanner scanner = new Scanner(System.in);
        System.out.format("What is %d + %d? ",number1, number2);
        int userAnswer = scanner.nextInt();
        return userAnswer;
    }

    public static int correctAnswer(int score){
        System.out.println("CORRECT!");
        score++;
        return score;
    }

    public static int wrongAnswer(int answer, int lives){
        System.out.format("WRONG! The answer is %d %n", answer);
        lives--;
        System.out.format("You have %d lives left. %n", lives);
        return lives;
    }

    public static void gameOver(int score, int lives){
        System.out.format("GAME OVER. Your final score is %d %n",score);
        if (lives > 0){
            System.out.println("Well done!");
        }
    }
    public static void main(String[] args) {
        int score = 0;
        int lives = 3;
        int userAnswer = 0;
        int answer = 0;
        int count = 1;
        while (count <= 10 && lives > 0){
            userAnswer = askQuestion(count, count*count);
            answer = count + (count*count);
            if (answer == userAnswer){
                score = correctAnswer(score);
            } else {
                lives = wrongAnswer(answer, lives);
            }
            count++;
        }
        gameOver(score, lives);
    }
}

