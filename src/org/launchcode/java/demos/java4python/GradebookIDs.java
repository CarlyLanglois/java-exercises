package org.launchcode.java.demos.java4python;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by carlylanglois on 4/29/17.
 */
public class GradebookIDs {
    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();
        Scanner in = new Scanner(System.in);
        String newStudent;

        System.out.println("Enter your students (or press ENTER to finish):");

        // Get student names and grades
        do {

            System.out.print("Student: ");
            newStudent = in.nextLine();

            if (!newStudent.equals("")) {
                System.out.print("ID#: ");
                Integer newID = in.nextInt();
                students.put(newID, newStudent);

                // Read in the newline before looping back
                in.nextLine();
            }

        } while(!newStudent.equals(""));

        // Print class roster
        System.out.println("\nClass roster:");

        //double sum = 0.0;

        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println(student.getKey() + " (" + student.getValue() + ")");
            //sum += student.getValue();
        }

        //double avg = sum / students.size();
        //System.out.println("Average grade: " + avg);

    }
}
