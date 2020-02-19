package app;
import java.util.Random;

public class Arrays001 {
    public static void main(String args[]){
        System.out.println("Even array:");
        Random randomNumbers = new Random();

        int[] a1 = new int[30];
        for (int i = 0; i < a1.length ; i++) {
            a1[i] = randomNumbers.nextInt(20)*2 - 20;
                System.out.println(a1[i]);
        }

        System.out.println("Odd array:");
        int[] a2 = new int[30];
        for (int j = 0; j < a1.length ; j++) {
            a2[j] = randomNumbers.nextInt(30)*2 - 31;
            System.out.println(a2[j]);
        }

    }
}
