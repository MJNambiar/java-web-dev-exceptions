package org.launchcode.exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double x;
        double y;
        Scanner input;
        input = new Scanner(System.in);
        System.out.println("Enter points earned: ");
        x = input.nextDouble();
        System.out.println("Enter possible points: ");
        y = input.nextDouble();
        input.close();
        Divide(x,y);



        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");

        for (Map.Entry<String, String> set: studentFiles.entrySet()) {
            System.out.println(set.getKey() + " result: " + CheckFileExtension(set.getValue()));
        }
    }

    public static void Divide(double x, double y) {
        double result= (x/y) * 100;

        if (y == 0) {
            try {
                throw new ArithmeticException("You cannot divide by zero");
            } catch (ArithmeticException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Grade: " + result + "%");
    }


    public static int CheckFileExtension(String fileName)
    {
        if (fileName.endsWith(".java")) {
            return 1;

        } else if (fileName == null || fileName == "") {
            try {
                throw new ArithmeticException("File name is missing.");
            } catch (ArithmeticException e) {
                e.printStackTrace();
            }
            return -1;

        } else {
            return 0;
        }
    }

}
