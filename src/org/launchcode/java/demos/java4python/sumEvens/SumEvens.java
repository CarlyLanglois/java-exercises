package org.launchcode.java.demos.java4python.sumEvens;
import java.util.ArrayList;

/**
 * Created by carlylanglois on 4/29/17.
 */
public class SumEvens {
    public static void main (String[] args){

        ArrayList<Integer> ints = new ArrayList<>();

        ints.add(1);
        ints.add(5);
        ints.add(9);
        ints.add(14);
        ints.add(10);
        ints.add(6);
        ints.add(53);
        ints.add(28);
        ints.add(47);
        ints.add(80);

        String evens = Sum.getSum(ints);
        System.out.println(evens);

    }
}
