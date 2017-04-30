package org.launchcode.java.demos.java4python.fiveLetters;

import java.util.ArrayList;

/**
 * Created by carlylanglois on 4/29/17.
 */
public class PrintList {

    public static void main(String[] args){
        ArrayList<String> lst = new ArrayList<>();

        lst.add("Carly");
        lst.add("Caroline");
        lst.add("Laura");
        lst.add("Tim");
        lst.add("Steve");
        lst.add("Suzanne");
        lst.add("Lisa");

        System.out.println(PrintWords.print(lst));
    }
}
