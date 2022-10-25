package com.saraya.prog;

import java.util.Arrays;

public class BirdsWatcher {
	
 public static int [] getLastWeek(){
	int lastWeek [] = {0, 2, 5, 3, 7, 8, 4};
	return lastWeek;
}
	public static int getToday(int [] today) {
		return today[today.length-1];
	}
	public static int incrementTodayCount(int [] today) {
		return getToday(today) + 1;
	}
	public static boolean hasDayWithoutBirds(int [] today) {
		for(int i=0; i<=today.length; i++) {
		if(today[i] == 0) {
			return true;
		}
		}
		return false;
		}
	
	public static int getCountsForFirstDays(int [] today, int tailToday) {
			int sum = 0 ;
			for(int i=0; i<tailToday; i++) { 
				sum = sum+today[i];
			}
		return sum;
	}
	public static int getBusyDays(int [] today) {
		int sum = 0;
		for(int i : today) {
			if(i >= 5) {
				sum ++;
				}
	}
		return sum;
	}
	public static void main(String[] args) {
		int today[] = {0, 2, 5, 3, 7, 8, 4};

		System.out.println(Arrays.toString(getLastWeek()));
		System.out.println(getToday(today));
		System.out.println(incrementTodayCount(today));
		System.out.println(hasDayWithoutBirds(today));
		System.out.println(getCountsForFirstDays(today,7));
		System.out.println(getBusyDays(today));
	}

}
