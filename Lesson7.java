import java.util.Scanner;


//Exercise 1
//public class Lesson7 {
//    public static void option1() {
//        System.out.println("Oneoneone");
//    }
//
//    public static void option2() {
//        System.out.println("Twotwotwo");
//    }
//
//    public static void option3() {
//        System.out.println("threethreethree");
//    }
//
//    public static void option4() {
//        System.out.println("Fourfourfour");
//    }
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int option = 0;
//        do {
//            System.out.println("Here is you have 4 options, choose once");
//            System.out.println("Option 1");
//            System.out.println("Option 2");
//            System.out.println("Option 3");
//            System.out.println("Option 4");
//            System.out.println("Enter the option: ");
//            int question = scanner.nextInt();
//            if (question == 1) {
//                System.out.println("You choose:" + question);
//                option1();
//            } else if (question == 2) {
//                System.out.println("You choose:" + question);
//                option2();
//            } else if (question == 3) {
//                System.out.println("You choose:" + question);
//                option3();
//            } else if (question == 4) {
//                System.out.println("You choose:" + question);
//                option4();
//            } else {
//                System.out.println("Invalid choice. Please choose 1-4.");
//                break;
//            }
//        } while (option != 4);
//        System.out.println("bye");
//    }
//}



//Exercise 2
public class Lesson7 {
    public static void Show(int output) {
        System.out.println("Sum  is: " + output);
    }
    public static int calculateSum(){
        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int number1 = input1.nextInt();
        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter second number: ");
        int number2 = input2.nextInt();
        return number1 + number2;
    }

    public static void main(String[] args) {
        int output = calculateSum();
        Show(output);
    }

}


