package com.hotelResevationSystem;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HotelArrayList {
	private ArrayList<Hotels> hotelArrList = new ArrayList<Hotels>();
	
	public void addToHotelArrayList(Hotels h) {
		hotelArrList.add(h);
	}
	
	public void printHotelArrList() {
		System.out.println("Updated Hotel array list is : ");
		System.out.println(getHotelArrList());
		System.out.println();
	}	
	
	public List<Hotels> getHotelArrList(){
		return hotelArrList;
	}
	
	public void getCheapestHotel(int typeOfCustomer, int day1, int day2, int days) {
		// TODO Auto-generated method stub
		int diff = day2 - day1 + 1;
		String cityNameToPrint = "";
		int globalSum = 10000;
		if(typeOfCustomer == 1) {
			Iterator itr = hotelArrList.iterator();
			while(itr.hasNext()) {
				int localSum = 0;
				Hotels h = (Hotels) itr.next();
				if(diff == days) {
					for(int i = day1; i<=day2; i++) {
						if(i == 1 || i == 2 || i == 3 || i == 4 || i == 5) {
							localSum += h.getHotelRateRegularWeekDay();
						}else {
							localSum += h.getHotelRateRegularWeekEnd();
						}
					}
				}else if((days-diff)%7 == 0) {
					for(int i = day1; i<=day2; i++) {
						if(i == 1 || i == 2 || i == 3 || i == 4 || i == 5) {
							localSum += h.getHotelRateRegularWeekDay();
						}else {
							localSum += h.getHotelRateRegularWeekEnd();
						}
					}
					localSum = localSum + 5*(h.getHotelRateRegularWeekDay()) + 2*(h.getHotelRateRegularWeekEnd());
				}
				if(globalSum > localSum) {
					cityNameToPrint = h.getHotelName();
					globalSum = localSum;
				}
			}
		}
		else 
		{
			Iterator itr = hotelArrList.iterator();
			while(itr.hasNext()) {
				int localSum = 0;
				Hotels h = (Hotels) itr.next();
				if(diff == days) {
					for(int i = day1; i<=day2; i++) {
						if(i == 1 || i == 2 || i == 3 || i == 4 || i == 5) {
							localSum += h.getHotelRateRewardWeekDay();
						}else {
							localSum += h.getHotelRateRewardWeekEnd();
						}
					}
				}else if((days-diff)%7 == 0) {
					for(int i = day1; i<=day2; i++) {
						if(i == 1 || i == 2 || i == 3 || i == 4 || i == 5) {
							localSum += h.getHotelRateRewardWeekDay();
						}else {
							localSum += h.getHotelRateRewardWeekEnd();
						}
					}
					localSum = localSum + 5*(h.getHotelRateRewardWeekDay()) + 2*(h.getHotelRateRewardWeekEnd());
				}
				if(globalSum > localSum) {
					cityNameToPrint = h.getHotelName();
					globalSum = localSum;
				}
			}
		}
		
		System.out.println("Hotel is : " + cityNameToPrint + " and the total "
							+ "price would be : " + globalSum);
	}

	public void getBestRatedHotel(int typeOfCustomer, int day1, int day2, int days) {
		// TODO Auto-generated method stub
//		String cityNameToPrint = "";
		Hotels dumH = new Hotels();
		//int globalSum = 10000;
		int maxRating = -1;
		Iterator itr = hotelArrList.iterator();
		while(itr.hasNext()) {
			Hotels h = (Hotels) itr.next();
			if(h.getHotelRating() > maxRating) {
				maxRating = h.getHotelRating();
				dumH = h;
			}
		}
		int diff = day2 - day1 + 1;
		int localSum = 0;
		if(typeOfCustomer == 1) {
				if(diff == days) {
					for(int i = day1; i<=day2; i++) {
						if(i == 1 || i == 2 || i == 3 || i == 4 || i == 5) {
							localSum += dumH.getHotelRateRegularWeekDay();
						}else {
							localSum += dumH.getHotelRateRegularWeekEnd();
						}
					}
				}else if((days-diff)%7 == 0) {
					for(int i = day1; i<=day2; i++) {
						if(i == 1 || i == 2 || i == 3 || i == 4 || i == 5) {
							localSum += dumH.getHotelRateRegularWeekDay();
						}else {
							localSum += dumH.getHotelRateRegularWeekEnd();
						}
					}
					int weeks = (days-diff)/7;
					localSum = localSum + weeks*(5*(dumH.getHotelRateRegularWeekDay()) + 2*(dumH.getHotelRateRegularWeekEnd()));
				}
		}else {
			if(diff == days) {
				for(int i = day1; i<=day2; i++) {
					if(i == 1 || i == 2 || i == 3 || i == 4 || i == 5) {
						localSum += dumH.getHotelRateRewardWeekDay();
					}else {
						localSum += dumH.getHotelRateRewardWeekEnd();
					}
				}
			}else if((days-diff)%7 == 0) {
				for(int i = day1; i<=day2; i++) {
					if(i == 1 || i == 2 || i == 3 || i == 4 || i == 5) {
						localSum += dumH.getHotelRateRewardWeekDay();
					}else {
						localSum += dumH.getHotelRateRewardWeekEnd();
					}
				}
				int weeks = (days-diff)/7;
				localSum = localSum + weeks*(5*(dumH.getHotelRateRewardWeekDay()) + 2*(dumH.getHotelRateRewardWeekEnd()));
			}
		}
		System.out.println("Hotel is : " + dumH.getHotelName() + " and the total "
				+ "price would be : " + localSum);
	}
}