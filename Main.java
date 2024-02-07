import java.util.Scanner;
import java.lang.Math;

/**
 * This is a menu-driven console application that supports many operations on an array of integers.
 */
public class Main{
    public static void main(String[] args){

        //Welcoming the user and asking for the size of the array
        System.out.println("Welcome to the application");
        System.out.print("Please enter the size of the array: ");
        Scanner scanner = new Scanner(System.in);

        //Creating the array and filling it with random numbers from 0 to 100
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++){
            array[i] = (int) (Math.random() * 101);
        }

    }
}
