package app.WarmUp4;

import java.util.HashMap;

public class WarmUp3 {
    public static void Characters(String inputString) {
        HashMap<Character, Integer> counter = new HashMap<Character, Integer>();
        char [] c = inputString.toCharArray();
        for(char i: c){
            if(counter.containsKey(i)){
                counter.put(i, counter.get(i) + 1);
            }
            else{
                counter.put(i,1);
            }
        }
        System.out.println(inputString + " : " + counter);
    }
    public static void main(String[] args) {Characters("Centrifugal Pump");}
}
