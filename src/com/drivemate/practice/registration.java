package com.drivemate.practice;
import java.util.*;

public class registration {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Welcome to Driving School, Student registration");
        System.out.println("Name : ");
        String name = obj.nextLine();
        System.out.println("Age : ");
        int age = obj.nextInt();

        System.out.println("Hi "+name+" !, You have successfully registered DriveMate !");
    }
}
