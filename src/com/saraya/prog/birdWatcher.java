package com.saraya.prog;

import java.util.Arrays;


public class birdWatcher {
	private static int[] birdsPerDay = { 0,2,5,3,7,8,4};

	    public void BirdWatcher(int[] birdsPerDay) {
	        this.birdsPerDay = birdsPerDay;
	    }
	    public  static int[] getLastWeek() {
	        return birdsPerDay;
	    }
	    public int getToday(int [] birdsPerDay) {
	 
	     return birdsPerDay[birdsPerDay.length-1];
	    	  //return birdsPerDay.length == 0 ? 0 :birdsPerDay[birdsPerDay.length -1];
	    	    }
	   public int incrementTodaysCount() {
	    int idx = birdsPerDay.length - 1;
	      birdsPerDay[idx] = ++birdsPerDay[idx];
	         return birdsPerDay[idx];
	    }
	    	    public boolean hasDayWithoutBirds() {
	    	    	        return Arrays.stream(birdsPerDay).filter(a -> a == 0).findAny().isPresent();
    	    }
	    	    	    public int getCountForFirstDays(int numberOfDays) {
	    	    	       return Arrays.stream(birdsPerDay).limit(numberOfDays).sum();
	    	    	    }
	    	    	    public int getBusyDays() {
	    	    	        return (int) Arrays.stream(birdsPerDay).filter(a -> a >= 5).count();
	    	    	    }
	    	    	

	public static void main(String[] args) {
		//int birdsPerDay [] = { 0, 2, 5, 3, 7, 8 , 4};
		birdWatcher birdCount = new birdWatcher();
		birdCount.incrementTodaysCount();
		System.out.println(birdCount.getToday(birdsPerDay));
		birdCount.hasDayWithoutBirds();
		birdCount.getCountForFirstDays(4);
		birdCount.getBusyDays();
		//System.out.println(Arrays.toString(getLastWeek()));
		

	}

}
