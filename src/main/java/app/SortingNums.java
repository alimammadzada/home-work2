package app;

import java.util.Random;

public class SortingNums {
    public static void main(String[] args) {
        Random rand = new Random();
        int L = 9;
        int randNum;
        int[] a = new int[L];
        int k = 0;
        for (int i = 0; i < L; i++) {
            randNum = rand.nextInt(20)-10;
            a[i] = randNum;
            System.out.print(a[i] + " ");
            if(a[i] > 0 && a[k] > 0){
                a[i] = a[k+1];
                k++;
                System.out.println(a[i] + " ");
            }
            else{
                System.out.print(a[i] + " ");
            }
        }
    }
}
