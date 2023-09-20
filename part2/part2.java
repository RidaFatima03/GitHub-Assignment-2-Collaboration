package part2;

import java.util.Random;

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
}
