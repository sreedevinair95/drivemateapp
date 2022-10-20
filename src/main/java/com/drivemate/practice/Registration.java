package com.drivemate.practice;
import java.io.File;
import java.util.*;

public class Registration {
    public static void main(String[] args) {

        Scanner inputReader = new Scanner(System.in);

        System.out.println("Welcome to Driving School !!");

        // while (selectedFunction != 3) is same as  for(;selectedFunction != 3;)
        while (true) {
            int selectedFunction = readUserSelection(inputReader);
            if(selectedFunction == 1) {
                System.out.println("Name : ");
                String name = inputReader.next();

                System.out.println("Age : ");
                int age = inputReader.nextInt();
                System.out.println("Hi " + name + " !, You have successfully registered in DriveMate !");
            } else if (selectedFunction == 2) {

            } else if (selectedFunction == 3) {
                System.exit(0);
            } else {
                System.out.println("Sorry, invalid function");
            }
        }
    }

    public static void compress(String filePath, String destinationFolder){

    }

    /**
     * Presents a menu and reads an option from the user and returns it
     * @param inputReader
     * @return
     */
    private static int readUserSelection(Scanner inputReader) {
        System.out.println("1: Student Registration");
        System.out.println("2: Student Search");
        System.out.println("3: Exit");

        System.out.println("Please select the function : ");
        int selectedFunction = inputReader.nextInt();
        return selectedFunction;
    }
}
