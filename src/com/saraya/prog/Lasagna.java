package com.saraya.prog;

public class Lasagna {
	
	public int expectedMinutesOven(){
		return 40;
	}
	public int remainingOvenTime(int minOven) {
		return expectedMinutesOven()-minOven;
	}
	public int preparationTime(int numOfLayers) {
	   return numOfLayers*2;
	}
	public int totalTimesInMinutes(int numOfLayers, int time){
		return preparationTime(numOfLayers)+time;
	}
	
	public static void main(String[] args) {
		Lasagna lasagna = new Lasagna();
		System.out.println(lasagna.expectedMinutesOven());
		System.out.println(lasagna.remainingOvenTime(30));
		System.out.println(lasagna.preparationTime(6));
		System.out.println(lasagna.totalTimesInMinutes(3, 20));

	}

}
