package com.drivemate.practice;
import java.util.*;

public class registration {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        System.out.println("Welcome to Driving School, Student registration");
        
       for(int i =1;i>0;i++) {
           System.out.println("Name : ");
           String name = obj.next();

           System.out.println("Age : ");
           int age = obj.nextInt();
           System.out.println("Hi " + name + " !, You have successfully registered in DriveMate !");
       }


<<<<<<< HEAD
    }
=======
        System.out.println("Hi "+name+" !, You have successfully registered in DriveMate !");
>>>>>>> 85304ec4dabc921781187c6d936bda2ef407eb4e
    }
}


