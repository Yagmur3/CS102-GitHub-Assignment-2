import java.util.Scanner;
import java.lang.Math;

/**
 * This is a menu-driven console application that supports many operations on an array of integers.
 */
public class Main {
    public static void main(String[] args) {

        //Welcoming the user and asking for the size of the array
        System.out.println("Welcome to the application");
        System.out.print("Please enter the size of the array: ");
        Scanner scanner = new Scanner(System.in);

        //Creating the array and filling it with random numbers from 0 to 100
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * 101);
        }

        int choice = 0; 

        //Displays the choice menu until the user exits.
        do {

            System.out.println("1. Find the maximum of the array");
            System.out.println("2. Find the minimum of the array");
            System.out.println("3. Find the average of the array");
            System.out.println("4. Display the difference between the average and each element");
            System.out.println("5. Find the sum of elements with odd-numbered indexes");
            System.out.println("6. Find the sum of elements with even-numbered indexes");
            System.out.println("7. Exit");

            //Takes an input for the choice of the user.
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("The maximum of the array is: " + findMax(array));
            }
            else if (choice == 2) {
                System.out.println("The minimum of the array is: " + findMin(array));
            } 
            else if (choice == 3) {
                System.out.println("The average of the array is: " + findAvg(array));
            }
            else if (choice == 4) {
                System.out.println("The difference between the average and each element of the array: " + findDiff(array));
            }
            else if (choice == 5) {
                System.out.println("The sum of the numbers at odd-numbered indexes in the array is: " + oddSum(array));
            }    
            else if (choice == 6) {
                System.out.println("The sum of the numbers at odd-numbered indexes in the array is: " + evenSum(array));
            }
            else if (choice == 7) {
                System.out.println("You have exited the program.");
            }

            System.out.println();
        }while (choice != 7);
        
    }

    public static int oddSum(int[] inputArray) {
        
    }
    
}
