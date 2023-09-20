package part2;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

//Amina
public class part2 {

    static int length = 10;

    public static int[] randNum () {
        Random rand = new Random();
        int array[] = new int[length];
        for (int i = 0; i < array.length; i ++){
            int randsom = rand.nextInt(101);
            array[i] = randsom;
        }
        return array;
    }

    //Parinaz
    public static void displayMenu() {
        System.out.println("Menu:");
        System.out.println("1. Find minimum and maximum");
        System.out.println("2. Find average and differences from average");
        System.out.println("3. Sum of elements with odd and even indexes");
        System.out.println("4. Exit");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        int[] array = randNum();
        do {
            displayMenu();
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("The max number is: " + findMaxNumber(array));
                System.out.println("The min number is: " + findMinNumber(array));
            } else if (choice == 2) {
                System.out.println("The difference array is: " + findAverageAndDifferences(array));
            } else if (choice == 3) {
                sumOddAndEvenIndexes(array);
            } else if (choice == 4) {
                System.out.println("Exiting the program.");
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }

    //Ilayda
    public static int findMaxNumber ( int[] arr)
        {
            int maxNumber = -1;
            for( int i = 0; i < arr.length; i++)
            {
                if( arr[i] > maxNumber )
                {
                    maxNumber = arr[i];
                }
            }
            return maxNumber;
        }
        
        public static int findMinNumber (int[] arr)
        {
            int minNumber = 101;
            for( int i = 0; i < arr.length; i++)
            {
                if( arr[i] < minNumber )
                {
                    minNumber = arr[i];
                }
            }
            return minNumber;
        }
   
    //Rida
    public static String findAverageAndDifferences(int[] originalArray){
        int[] averageArray = new int[originalArray.length];

        int sum = 0;

        for (int x = 0; x < originalArray.length; x++){
            sum = sum + originalArray[x];
        }
        
        int average = sum / originalArray.length;
        
        for (int x = 0; x < originalArray.length; x++){
            averageArray[x] = originalArray[x] - average;
        }

        return Arrays.toString(averageArray);
    }

    //Anıl
    public static void sumOddAndEvenIndexes( int[] arr ) {
        int sum_of_odds = 0;
        int sum_of_evens = 0;

        for (int i = 0; i < arr.length; i++) {

            if (i % 2 == 0) {

                sum_of_evens += arr[i];
            }
            else {
                sum_of_odds += arr[i];
            }
        }
        System.out.println("Sum of evens are: " + (sum_of_evens-1));
        System.out.println("Sum of odds are: " + (sum_of_odds-1));
    }
}
