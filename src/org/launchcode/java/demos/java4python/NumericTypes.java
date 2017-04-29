package org.launchcode.java.demos.java4python;
import java.util.Scanner;

/**
 * Created by carlylanglois on 4/29/17.
 */
public class NumericTypes {
    public static void main(String[] args){
        double length;
        double width;
        double area;
        Scanner in;

        in = new Scanner(System.in);
        System.out.println("What is the length of your rectangle?");
        length = in.nextDouble();
        System.out.println("How about its width?");
        width = in.nextDouble();
        area = length * width;
        System.out.println("The area of your rectangle is: " + area);
    }
}
