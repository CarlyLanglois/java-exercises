package org.launchcode.java.demos.java4python.sumEvens;
import java.util.ArrayList;

/**
 * Created by carlylanglois on 4/29/17.
 */
public class Sum {

    public static String getSum(ArrayList<Integer> lst){

        int sum = 0;

        for (int i : lst){
            if ((i % 2) == 0){
                sum += i;
            }
        }
        return "The sum of all the even numbers in your list is " + sum + ".";
    }

}
