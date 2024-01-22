import java.util.Scanner;

//Excercise 1
//public class Lesson2 {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("What is your first name? ");
//        String firstName = input.nextLine();
//
//        System.out.print("What is your hobby? ");
//        String Hobby = input.nextLine();
//
//        System.out.println("Hello " + firstName + ", you have amazing hobby as : " + Hobby);
//
//    }
//}



//Exercise 2
public class Lesson2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        float firstNum = input.nextFloat();

        System.out.print("Enter Second number: ");
        float SecondNum = input.nextFloat();

        input.nextLine();


        System.out.print("What you gonna be do +-/x: ");
        String Doing = input.nextLine();

        if (Doing.equals("-")){
            float result1 = firstNum - SecondNum;
            System.out.println("Result: " +  result1 );
        } else if (Doing.equals("+")) {
            float result2 = firstNum + SecondNum;
            System.out.println("Result: " +  result2 );
        } else if (Doing.equals("/")) {
            float result3 = firstNum / SecondNum;
            System.out.println("Result: " +  result3 );
        } else if (Doing.equals("x")) {
            float result4 = firstNum * SecondNum;
            System.out.println("Result: " +  result4 );
        } else {
            System.out.println("You are type something wrong, try again");
        }
    }
}