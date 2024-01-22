import java.util.Scanner;

//Exercise 1
//public class Lesson4 {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter your firstname: ");
//        String Firstname = input.nextLine();
//
//        System.out.print("Enter your surname: ");
//        String Surname = input.nextLine();
//
//        System.out.print("Enter the total value of your order: ");
//        float Total = input.nextFloat();
//
//        System.out.print("Enter the amount you with to pay deposit: ");
//        float Amount = input.nextFloat();
//
//        System.out.printf("===  RECEIPT ===\n");
//        System.out.println("Customer: "+ Firstname.substring(0,1) + " " + Surname);
//        System.out.println("Order Total: " + Total);
//        System.out.println("Deposit paid: " + Amount);
//        float Remainder = Total - Amount;
//        System.out.println("Remainder: " + Remainder);
//        System.out.printf("You get a free toster\nHave a nice day!");
//    }
//}




//Exercise 2
//public class Lesson4 {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("What is  the capital of Spain? : ");
//        String Spain = input.nextLine();
//        if (Spain.toLowerCase().equals("madrid")) {
//        } else {
//            System.out.printf("Sorry, the correct answer is Madrid\n");
//        }
//
//        System.out.print("What is  the capital of England? : ");
//        String England = input.nextLine();
//        if (England.toLowerCase().equals("london")) {
//        } else {
//            System.out.printf("Sorry, the correct answer is London\n");
//        }
//
//        System.out.print("What is  the capital of Italy? : ");
//        String Italy = input.nextLine();
//        if (Italy.toLowerCase().equals("rome")) {
//        } else {
//            System.out.printf("Sorry, the correct answer is Rome\n");
//        }
//    }
//}





//Exercise 3
public class Lesson4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float shipping = 10;
        System.out.print("Enter your total purchase amount : ");
        float Total = input.nextFloat();
        if (Total > 50) {
            System.out.println("You have a free shiping!");
        } else {
             float totalship = Total + shipping;
             System.out.println("Shipping cost is : " + shipping);
             System.out.println("Your total with shipping: " + totalship);

        }
    }
}