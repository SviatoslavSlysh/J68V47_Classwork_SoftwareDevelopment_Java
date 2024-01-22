//Exercise 1
//public class Lesson6 {
//    public static void main(String[] args) {
//        int count = 10;
//        while( count<=24 )
//        {
//            System.out.println(count);
//            count+=2;
//        }
//    }
//}


//Exercise 2
import java.util.Scanner;

//public class Lesson6 {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        String choice;
//        do {
//            System.out.println("1. Say hello");
//            System.out.println("2. Tell me the time");
//            System.out.println("3. Tell me a joke");
//            System.out.println("4. Quit");
//
//            System.out.print("Enter your choice: ");
//            choice = input.nextLine();
//
//            switch (choice) {
//                case "1":
//                    System.out.println("Hello!");
//                    break;
//                case "2":
//                    System.out.println("The current time is: [Display the time here]");
//                    break;
//                case "3":
//                    System.out.println("Why don't scientists trust atoms? Because they make up everything!");
//                    break;
//                case "4":
//                    System.out.println("Quitting the program. Goodbye!");
//                    break;
//                default:
//                    System.out.println("Invalid choice. Please enter a number from 1 to 4.");
//            }
//
//        } while (!choice.equals("4"));
//    }
//}



//Exercise 3
public class Lesson6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;
        int life = 3;
        while (count < 9 && life > 0) {
            System.out.printf("You have" + life +  "life!!!\n");
            String[] question = {"2+2?: ", "3+3?: ", "4+4?: ", "5+5?: ","6+6?: ","7+7?: ", "8+8?: ", "9+9?: ", "10+10?: "};
            Integer[] answer = {4, 6, 8, 10, 12, 14, 16, 18, 20};
            System.out.printf(question[count]);
            int answeruser = input.nextInt();
            if (answeruser == answer[count]){
                System.out.println("Your answer is correct");
            }else {
                System.out.println("Wrong answer");
                life--;
            }
            count++;
        }
        if (life > 0){
            System.out.println("Super, you won!");
        }else{
            System.out.printf("Your life is over");
        }
    }
}