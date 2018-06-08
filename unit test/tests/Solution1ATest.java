package tests;

import main.ListFunctions;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class Solution1ATest {

    @Test
    public void maxOfRRange(){

        List<Integer> a= Arrays.asList(1,2,4,5,6,7,1000000);
        assertEquals(3,ListFunctions.solution1A(a));
    }

    @Test
    public void minOfRange(){

        List<Integer> a=Arrays.asList(-1000000,3,5,8,16,1,2,4,7,1,1,1,7,8);
        assertEquals(6,ListFunctions.solution1A(a));
    }

    @Test
    public void oneRandElement(){
        List<Integer> a=Arrays.asList(17);
        assertEquals(1, ListFunctions.solution1A(a));
    }


    @Test
    public void positiveNumbersOnly(){
        List<Integer> a=Arrays.asList(17,15,4,3,1,7,9,10,34,56,48,46,18,76,1000,8,74,2);
        assertEquals(5, ListFunctions.solution1A(a));
    }

    @Test
    public void negativeNumbersOnly(){
        List<Integer> a=Arrays.asList(-3,-4,-1,-2,-4567,-17,-64,-987654);
        assertEquals(1, ListFunctions.solution1A(a));
    }

    @Test
    public void randElements(){
        List<Integer> a=Arrays.asList(17,43,56,-76543,-654,67,-43,4,4,4,4,4,8,16,-654,1,2,3,8,7,6,5,4,3,9,30,34,-10,10);
        assertEquals(11, ListFunctions.solution1A(a));
    }

    @Test
    public void randAnd10Zeroes(){
        List<Integer> a=Arrays.asList(17,-54,10,45,0,0,0,0,0,0,0,0,5,0,0);
        assertEquals(1, ListFunctions.solution1A(a));
    }

    @Test
    public void inOrder(){
        List<Integer> a=new ArrayList<>();
        for(int x=1;x<100001;x++) {
            a.add(x);
        }
        assertEquals(100001,ListFunctions.solution1A(a));
    }

    @Test(expected = NullPointerException.class)
    public void nullList() {
        List<Integer>a=null;
        ListFunctions.solution1A(a);
    }

    @Test (expected = IllegalArgumentException.class)
    public void emptyList(){
        List<Integer>a=new ArrayList<>();
        ListFunctions.solution1A(a);
    }

    @Test (expected = IllegalArgumentException.class)
    public void tooBigList(){
        List<Integer> a=new ArrayList<>();
        a.add(4);
        a.add(-8);
        a.add(0);
        for(int x=1;x<10e5;x++){
            a.add(74);
        }
        //IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            ListFunctions.solution1A(a);
       // });
       // assertEquals("list is to big", exception.getMessage());

    }

}
