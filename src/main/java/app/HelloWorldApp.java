package app;
import java.util.Random;
public class HelloWorldApp {
  public static void main(String[] args) {
    System.out.println("Even array:");
    System.out.println();


    Random randomNumbers = new Random();

    int[] a1 = new int[30];
    for (int i = 0; i < a1.length + 1; i++) {
      a1[i] = randomNumbers.nextInt(40) - 20;
      System.out.println(a1[i]);
    }

    System.out.println();
    System.out.println("Odd array:");
    System.out.println();


    int[] a2 = new int[30];
    for (int j = 0; j < a2.length+1; j++) {
      a2[j] = randomNumbers.nextInt(60)-30;
      System.out.println(a2[j]);

    }
  }
}
