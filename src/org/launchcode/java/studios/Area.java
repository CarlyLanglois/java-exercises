package org.launchcode.java.studios;
import java.util.Scanner;

/**
 * Created by carlylanglois on 4/29/17.
 */
public class Area {
    public static void main(String[] args){
        Scanner in;
        double r;
        double a;


        in = new Scanner(System.in);
        do {
            System.out.println("What's the radius of your circle?");
            r = in.nextDouble();
            if (r < 0){
                System.out.println("Your radius can't be negative!");
            }
        } while (r < 0);

        a = 3.14 * r * r;
        System.out.println("The area of your circle is " + a + ".");
    }
}

