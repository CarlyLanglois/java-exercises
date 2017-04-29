package org.launchcode.java.demos.java4python;
import java.util.Scanner;

/**
 * Created by carlylanglois on 4/29/17.
 */
public class NumericTypes2 {
    public static void main(String[] args){
        int miles;
        int gas;
        double mpg;
        Scanner in;

        in = new Scanner(System.in);
        System.out.println("How many miles did you drive last week?");
        miles = in.nextInt();
        System.out.println("And how many gallons of gas did you use?");
        gas = in.nextInt();
        mpg = miles/gas;
        System.out.println("Your car receives " + mpg + " miles per gallon.");
    }
}
