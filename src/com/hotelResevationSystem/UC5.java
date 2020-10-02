package com.hotelResevationSystem;

import java.util.Scanner;

public class UC5 {
	
	public static HotelArrayList hal = new HotelArrayList();
	
	public static void main(String[] args) {
		System.out.println("----------WELCOME TO HOTEL RESERVATION SYSTEM----------");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the count of hotels you want to add : ");
		int count = sc.nextInt();
		sc.nextLine();
		int dummyCount = count;
		
		while(count-- > 0) {
			System.out.println("Enter the name of Hotel " + (dummyCount - count) + " : ");
			String name = sc.nextLine();
			
			System.out.println("Enter the rating of Hotel " + (dummyCount - count) + " : ");
			int rating = sc.nextInt();
			
			System.out.println("Enter the weekday rate for regular customer of Hotel " + (dummyCount - count) + " : ");
			int regularWeekDay = sc.nextInt();
			
			System.out.println("Enter the weekend rate for regular customer of Hotel " + (dummyCount - count) + " : ");
			int regularWeekEnd = sc.nextInt();
			
			System.out.println("Enter the weekday rate for reward customer of Hotel " + (dummyCount - count) + " : ");
			int rewardWeekDay = sc.nextInt();
			
			System.out.println("Enter the weekend rate for reward customer of Hotel " + (dummyCount - count) + " : ");
			int rewardWeekEnd = sc.nextInt();
			
			sc.nextLine();
			Hotels dummyH = new Hotels(name, rating, regularWeekDay, regularWeekEnd, rewardWeekDay, rewardWeekEnd);
			hal.addToHotelArrayList(dummyH);
		}
		System.out.println();
		System.out.println("Thank you! The details have been added successfully!");
		hal.printHotelArrList();
		System.out.println();
		
		System.out.println("Do you want to edit the details of any hotel ? Press Y or y for yes or any other key for no.");
		String inputKey = sc.nextLine();
		if(inputKey.equalsIgnoreCase("y")) {
			System.out.println("Enter the name of the hotel of which you want to edit details : ");
			String nameOfHotel = sc.nextLine();
			hal.editDetailsOfHotel(nameOfHotel);
			
			System.out.println();
			System.out.println("Sorry! We couldn't find any match for the hotel name you entered..");
			//hal.printHotelArrList();
			System.exit(0);
		}
		else {
			System.out.println("Thank you! You may exit now.");
			System.exit(0);
		}
		/*
		Hotels h1 = new Hotels("Lakewood", 3, 110, 90, 80, 80);
		hal.addToHotelArrayList(h1);
//		System.out.println("First hotel : ");
//		System.out.println(h1);
		System.out.println();
		hal.printHotelArrList();
		
		Hotels h2 = new Hotels("Bridgewood", 4, 160, 60, 110, 50);
		hal.addToHotelArrayList(h2);
//		System.out.println("Second hotel : ");
//		System.out.println(h2);
		System.out.println();
		hal.printHotelArrList();
		
		Hotels h3 = new Hotels("Ridgewood", 5, 220, 150, 100, 40);
		hal.addToHotelArrayList(h3);
//		System.out.println("Third hotel : ");
//		System.out.println(h3);
		System.out.println();
		hal.printHotelArrList();
		*/
	}
}
