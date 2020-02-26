package app.WarmUp2;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Filtering test = new Filtering();

        test.Filtering(s.nextLine());
        //test.Filtering("ALI");
    }
}
