import java.util.Locale;
import java.util.Scanner;

//Exercise 1
//public class Lesson3 {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter your firstname:  ");
//        String firstName = input.nextLine();
//        System.out.print("Enter your surname:  ");
//        String surName = input.nextLine();
//        System.out.print("Enter year date of birth:  ");
//        int Dateofbirth = input.nextInt();
//        System.out.println("username: " + firstName.substring(0,1) + surName.toLowerCase());
//        System.out.println("password: " + surName.substring(0,1).toLowerCase() + firstName.toUpperCase() + Dateofbirth);
//    }
//}



//Exercise 2
//public class Lesson3 {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("What is the capital of Spain?:  ");
//        String answer1 = input.nextLine();
//        System.out.println(answer1.toLowerCase().contains("madrid"));
//
//        System.out.print("What is the capital of England?:   ");
//        String answer2 = input.nextLine();
//        System.out.println(answer2.toLowerCase().contains("london"));
//
//        System.out.print("What is the capital of Italy?:   ");
//        String answer3 = input.nextLine();
//        System.out.println(answer3.toLowerCase().contains("rome"));
//    }
//}

//Exercise 3
public class Lesson3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the loan amount: £");
        float loanAmount = input.nextFloat();

        System.out.print("Enter the annual interest rate (in percentage): ");
        float annualInterestRate = input.nextFloat();

        System.out.print("Enter the number of years for the loan: ");
        int loanDurationYears = input.nextInt();

        float monthlyInterestRate = (annualInterestRate / 100) / 12;
        int loanMonths = loanDurationYears * 12;
        float monthlyPayment = loanAmount * (monthlyInterestRate / (1 - (float)Math.pow(1 + monthlyInterestRate, -loanMonths)));
        System.out.printf("Your monthly payment will be: £%.2f%n", monthlyPayment);
    }
}
