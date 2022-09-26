package org.launchcode.exercises;

import org.launchcode.Temperature.Temperature;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int x;
        int y;
        Scanner input;
        input = new Scanner(System.in);
        System.out.println("Enter points earned: ");
        x = input.nextInt();
        System.out.println("Enter possible points: ");
        y = input.nextInt();
        input.close();
        Divide(x,y);


        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");

        // Test out your CheckFileExtension() function!
    }

    public static void Divide(int x, int y) {
        int result = x/y;

        if (y == 0) {
            try {
                throw new ArithmeticException("You cannot divide by zero");
            } catch (ArithmeticException e) {
                e.printStackTrace();
            }
        }
        System.out.println(result);
    }

    public static int CheckFileExtension(String fileName)
    {
        if (fileName.endsWith(".java")) {
            return 1;

        } else if (!fileName.endsWith(".java")) {
            return 0;

        } else if (fileName == null || fileName == "") {
            try {
                throw new ArithmeticException("Need to add the proper file name.");
            } catch (ArithmeticException e) {
                e.printStackTrace();
            }
            return -1;

        } else {
            return 0;
        }
    }

}
