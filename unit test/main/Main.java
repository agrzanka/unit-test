package main;

import main.ListFunctions;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String []argv ){

        List<Integer> list1A= Arrays.asList(3,4,5,6,7,1,96,827,-7654);
        System.out.print(ListFunctions.solution1A(list1A));

        int[] a={1,2,3};
        System.out.print(ListFunctions.solution1B(a));

    }

}
