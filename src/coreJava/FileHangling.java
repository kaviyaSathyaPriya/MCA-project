package coreJava;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHangling {

	public static void main(String[] args) {
		
		File file=new File("C:\\Users\\kaviy\\OneDrive\\Desktop\\File Handling\\EclipseText.txt");
        try {
			file.createNewFile();
			System.out.println("File Created.");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("File not created");
		}
        
        try {
		    FileWriter fw=new FileWriter("C:\\Users\\kaviy\\OneDrive\\Desktop\\File Handling\\EclipseText.txt");
	        fw.write("Java File Handling in Eclipse...\n\n Java File Handling in Eclipse... ");
	        fw.close();
        } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        try {
			Scanner s=new Scanner(file);
			
			 while(s.hasNext())
			 {
				 System.out.println(s.nextLine());
			 }
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
