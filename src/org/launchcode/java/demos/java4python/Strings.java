package org.launchcode.java.demos.java4python;
import java.util.Scanner;

/**
 * Created by carlylanglois on 4/29/17.
 */
public class Strings {
    public static void main(String[] args) {
        String alice;
        String searchTerm;
        Boolean found;
        Scanner in;

        alice = "Alice was beginning to get very tired of sitting " +
                "by her sister on the bank, and of having nothing " +
                "to do: once or twice she had peeped into the book " +
                "her sister was reading, but it had no pictures or " +
                "conversations in it, 'and what is the use of a " +
                "book,' thought Alice 'without pictures or " +
                "conversation?'";
        alice = alice.toLowerCase();

        in = new Scanner(System.in);
        System.out.println("Let's look for a term in Alice in Wonderland." +
                " What term would you like to search by?");
        searchTerm = in.nextLine().toLowerCase();

        if (alice.contains(searchTerm)){
            found = true;
        } else {
            found = false;
        }
        if (found) {
            System.out.println("We found what we're looking for!");
        } else {
            System.out.println("Term not found :(");
        }

    }
}
