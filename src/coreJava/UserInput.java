package coreJava;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		
		System.out.println("What is your age ?");
		int age=0;
        Scanner sc = new Scanner(System.in);
        try {
            age=sc.nextInt();
        }catch(Exception e) {
           System.out.println("Enter integer values only..");
        }sc.close();
        System.out.println("My age is "+age+".");
        
		
		/*
		System.out.println("My name is "+args[0]);
		System.out.println("My age is "+args[1]);
		System.out.println("My nationality is "+args[2]);
		*/ 
	}

}
 