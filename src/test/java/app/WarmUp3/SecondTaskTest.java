package app.WarmUp3;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SecondTaskTest {
    SecondTask test = new SecondTask();

    @Test

    void Test() {
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        arr1.add(1);
        arr1.add(3);
        arr1.add(5);
        arr2.add(7);
        arr2.add(3);
        arr2.add(5);
        List<Integer> actual = test.CombinationOfArrays(arr1, arr2);
        List<Integer> expected = Arrays.asList(1,3,5,7);
        assertEquals(expected,actual);
    }
    @Test
    void Test2() {
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        arr1.add(5);
        arr1.add(6);
        arr1.add(9);
        arr2.add(5);
        arr2.add(4);
        arr2.add(7);
        List<Integer> actual = test.CombinationOfArrays(arr1, arr2);
        List<Integer> expected = Arrays.asList(4,5,6,7,9);
        assertEquals(expected,actual);
    }

}