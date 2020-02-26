package app.WarmUp2;

import java.util.Scanner;

public class Filtering {
    String vowel;
    public void Filtering(String origin){
        origin = origin.replaceAll("[AaEeIiOoUu]", "");
        System.out.println(origin.toLowerCase());
    }

}
