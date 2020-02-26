package app.WarmUp3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class SecondTask {


    public ArrayList<Integer> CombinationOfArrays(ArrayList<Integer>arr1,ArrayList<Integer>arr2){
        Set<Integer> arr3 = new HashSet<>();
        arr3.addAll(arr2);
        arr3.addAll(arr1);
        ArrayList<Integer> result = new ArrayList<>();
        result.addAll(arr3);
        return result;
    }
}
