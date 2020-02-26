package app.WarmUp2;

import java.util.Scanner;

public class Filtering {
    String vowel;
    public String Filtering(String origin){
        origin = origin.replaceAll("[AaEeIiOoUu]", "");
        return String.format(origin.toLowerCase());
    }

}
