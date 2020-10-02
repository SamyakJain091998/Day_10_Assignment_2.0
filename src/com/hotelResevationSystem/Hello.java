package com.hotelResevationSystem;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Hello {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try {
		      File myObj = new File("C:\\Users\\PC\\Desktop\\Capgemini stuff\\"
		      		+ "Day 10\\Day_10_Assignment_2.0\\src\\com\\"
		      		+ "hotelResevationSystem\\NewFile.txt");
		      if (myObj.createNewFile()) {
		          System.out.println("File created: " + myObj.getName());
		        } else {
		          System.out.println("File already exists.");
		        }
		      Scanner myReader = new Scanner(myObj);
		      while (myReader.hasNextLine()) {
		        String data = myReader.nextLine();
		        System.out.print(data + " ");
		      }
		      myReader.close();
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
	}

}
