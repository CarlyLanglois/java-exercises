package org.launchcode.java.demos.java4python.fiveLetters;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by carlylanglois on 4/29/17.
 */
public class ArrayLoopPractice {

    public static void main(String[] args){
        ArrayList<Integer> loopPractice = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 5, 8)) ;

        for (int i : loopPractice){
            System.out.println(i);
        }

    }
}
