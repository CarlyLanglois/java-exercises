package org.launchcode.java.studios;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by carlylanglois on 4/29/17.
 */
public class CountingCharacters {

    public static void main(String[] args){
        HashMap<Character, Integer> charCounts = new HashMap<>();

        String text = "Lorem ipsum dolor sit amet, " +
                "consectetur adipiscing elit. Nunc accumsan " +
                "sem ut ligula scelerisque sollicitudin. Ut at " +
                "sagittis augue. Praesent quis rhoncus justo. " +
                "Aliquam erat volutpat. Donec sit amet suscipit " +
                "metus, non lobortis massa. Vestibulum augue ex, " +
                "dapibus ac suscipit vel, volutpat eget massa. " +
                "Donec nec velit non ligula efficitur luctus.";
        text = text.toUpperCase();

        char[] charactersInString = text.toCharArray();

        //System.out.println(charactersInString);
        //System.out.println(charactersInString[0]);

        for (char c : charactersInString){

            if (Character.isAlphabetic(c)){
                if (!charCounts.containsKey(c)){
                    charCounts.put(c, 1);
                } else {
                    charCounts.put(c, charCounts.get(c) + 1);
                }
            }

            //System.out.println(charCount);
        }

        for (Map.Entry<Character, Integer> cc : charCounts.entrySet()){
            System.out.println("[" + cc.getKey() + ":" + cc.getValue() + "]");
        }



    }
}
