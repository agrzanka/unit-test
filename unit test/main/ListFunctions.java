package main;

import java.util.List;
import java.util.StringJoiner;

public class ListFunctions {
    static public int solution1A (List<Integer> a) /*throws Exepction*/{

        if(a==null){
            throw new NullPointerException("list is null");
        }

        if (a.isEmpty()){
            throw new IllegalArgumentException("list is empty");
        }
        if (a.size()>10e5){
            throw new IllegalArgumentException("list is to big");
        }

        if (a.stream().anyMatch(l->l>1000000)){
            throw new IllegalArgumentException("to big element found!");
        }

        if (a.stream().anyMatch(l->l<-1000000)){
            throw new IllegalArgumentException("to small element found!");
        }

        int output=1;
        while (output<1000000){
            if (!a.contains(output)){
                return output;
            }
            output+=1;
        }
        if (output>1000000){
            throw new IllegalArgumentException("no appropriate result found!");
        }

        System.out.print("no result found!");
        return -1;

    }

    static public int solution1B(int[] a){

        if (a.length<1)
            throw new IllegalArgumentException("array is empty");

        for(int i=0;i<a.length-1;i++){
            if (a[i]<0)
                throw new IllegalArgumentException("negative number in forbidden index found");
        }

        for(int i=0;i<a.length;i++){
            if (a[i]>9)
                throw new IllegalArgumentException("multi-digit number found");

        }

        StringJoiner num=new StringJoiner("");
        int output=0;

        for (int x=a.length-1;x>=0;x--){
            num.add(Integer.toString(a[x]));
        }

        int v=Integer.parseInt(String.valueOf(num));

        if (v>126322567)
            throw new IllegalArgumentException("v*17 out of integer range");

        int value=v*17;

        while(value!=0){
            output+=value%10;
            value/=10;
        }
        return output;
    }
}
