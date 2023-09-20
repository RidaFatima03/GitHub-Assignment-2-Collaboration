package part2;
import java.util.Scanner;
import java.util.Random;
//Amina
public class part2 {
    public static void main(String[] args) {
        int size = 10;
        Random rand = new Random();
        int array[] = new int[size];
        for (int i = 0; i < array.length; i ++){
            int randsom = rand.nextInt(101);
            array[i] = randsom;
        }
        for (int i = 0; i < array.length; i ++){
            System.out.print(array[i]);
        }

            
    }
    //Parinaz
    public void displayMenu() {
        System.out.println("Menu:");
        System.out.println("1. Find minimum and maximum");
        System.out.println("2. Find average and differences from average");
        System.out.println("3. Sum of elements with odd and even indexes");
        System.out.println("4. Exit");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            arrayOperations.displayMenu();
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            if (choice == 1) {
                arrayOperations.findMinMax();
            } else if (choice == 2) {
                arrayOperations.findAverageAndDifferences();
            } else if (choice == 3) {
                arrayOperations.sumOddAndEvenIndexes();
            } else if (choice == 4) {
                System.out.println("Exiting the program.");
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }
    //Ilayda

    //Anıl

    public void sumOf(int[] arr) {

        int sum_of_odds = 0;
        int sum_of_evens = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 == 0) {

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
