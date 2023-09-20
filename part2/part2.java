package part2;
import java.util.Scanner;
import java.util.Random;
//Amina
public class part2 {
    public static void randNum (int size) {
        int length = size;
        Random rand = new Random();
        int array[] = new int[length];
        for (int i = 0; i < array.length; i ++){
            int randsom = rand.nextInt(101);
            array[i] = randsom;
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

    public int findMaxNumber ( Array arr)
    {
        int maxNumber = ar[0];
        for( int i = 0; i < arr.length; i++)
        {
            if( arr[i] > maxNumber )
            {
                maxNumber = arr[i];
            }
        }
        return maxNumber;
    }
      
    public int findMinNumber ( Array arr)
    {
        int minNumber = arr[0];
        for( int i = 0; i < arr.length; i++)
        {
            if( arr[i] > minNumber )
            {
                minNumber = arr[i];
            }
        }
        return minNumber;
    }


}
