package tests;

import main.ListFunctions;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Solution1BTest {

    @Test
    public void randElements(){

        int[] a={1,2,4,6,9,3,9};
        assertEquals(47, ListFunctions.solution1B(a));
    }

    @Test (expected = IllegalArgumentException.class)
    public void negativeInTheMiddle(){
        int [] a={1,2,-5,7,6};
        ListFunctions.solution1B(a);

    }

    @Test (expected = IllegalArgumentException.class)
    public void multiDigit(){
        int [] a={1,7,18,4};
        ListFunctions.solution1B(a);
    }

    @Test (expected = IllegalArgumentException.class)
    public void emptyArray(){
        int [] a={};
        ListFunctions.solution1B(a);
    }

    @Test (expected = IllegalArgumentException.class)
    public void outOfIntRange(){
        int [] a={8,5,2,5,6,3,2,5,1};
        ListFunctions.solution1B(a);
    }

    @Test
    public void onlyZeroes(){

        int[] a={0,0,0};
        assertEquals(0, ListFunctions.solution1B(a));
    }

    @Test
    public void zeroesAtTheEnd(){

        int[] a={1,5,7,2,0,0,0};
        assertEquals(30, ListFunctions.solution1B(a));
    }

    @Test
    public void zeroesAtTheBeginning(){

        int[] a={0,0,0,1,5,7,2};
        assertEquals(30, ListFunctions.solution1B(a));
    }

    @Test
    public void negativeV(){

        int[] a={1,2,4,6,9,3,-9};
        assertEquals(-47, ListFunctions.solution1B(a));
    }

    @Test(expected = IllegalArgumentException.class)
    public void allNegative(){
        int [] a={-1,-7,-5,-7,-6};
            ListFunctions.solution1B(a);
    }
}