import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;
////Exercise 1
//public class Lesson8 {
//    public static void main(String[] args) {
//        ArrayList<String> students = new ArrayList<>();
//        Scanner input = new Scanner(System.in);
//        for (int i = 0; i < 5; i++) {
//            System.out.print("Enter student name: ");
//            String name = input.nextLine();
//            students.add(name);
//        }
//        System.out.println("1st student  " + students.get(0) + " \n5st student  " + students.get(4));
//
//    }
//}



//Exercise 2
//public class Lesson8 {
//    public static void main(String[] args) {
//        int[] grades = new int[4];
//        Scanner input = new Scanner(System.in);
//
//        for (int count = 0; count < 4; count++) {
//            int grade;
//            do {
//                System.out.print("Enter your grade (between 0 and 100): ");
//                while (!input.hasNextInt()) {
//                    System.out.println("Please enter a valid integer.");
//                    input.next();
//                }
//                grade = input.nextInt();
//                if (grade < 0 || grade > 100) {
//                    System.out.println("Please enter a grade between 0 and 100.");
//                }
//            } while (grade < 0 || grade > 100);
//            grades[count] = grade;
//        }
//        System.out.print("Grades: ");
//        int sum = 0;
//        for (int i = 0; i < grades.length; i++) {
//            sum = sum + grades[i];
//        }
//        int average = sum / 4;
//        System.out.println(average);
//    }
//}



//Exercise 3
public class Lesson8 {
    public static void main(String[] args) {
        String[] directions = {"Start by exiting the building you are currently in and turning left onto the main road.",
                "Walk down the road for two blocks until you reach the traffic lights.",
                "At the traffic lights, turn right onto Oak Street.",
                "Follow Oak Street for one block then turn left onto Elm Street.",
                "Walk to the end of Elm Street. Your doctor's office will be the third building on the right side of the road.",
                "Enter through the front door of the office. Let the receptionist know you have arrived for your appointment.",
                "Take a seat in the waiting room. The doctor will call your name when it's time to be seen. You've arrived!"
        };

        String newString = "After turning onto Elm Street, walk past the grocery store on your right.";
        int PositionOfIndex = 4;
        String[] newArray = addToStringArray(directions, newString, PositionOfIndex);

        System.out.println("Old Array: " + Arrays.toString(directions));
        System.out.println("Element was added: " + newString);
        System.out.println("New Index position: " + PositionOfIndex);
        System.out.println("New array: " + Arrays.toString(newArray));
    }

    public static String[] addToStringArray(String[] oldArray, String newString, int insertIndex) {
        if (insertIndex < 0 || insertIndex > oldArray.length) {
            throw new IndexOutOfBoundsException("Index is out of bounds");
        }

        String[] newArray = Arrays.copyOf(oldArray, oldArray.length + 1);
        newArray[newArray.length - 1] = null;

        for (int i = newArray.length - 1; i > insertIndex; i--) {
            newArray[i] = newArray[i - 2];
        }
        newArray[insertIndex] = newString;

        return newArray;
    }
}



