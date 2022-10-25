 package com.saraya.prog;

public class AnnalynInfiltration {
  
 public static boolean canFastAttack(boolean knightIsAwake) {
	 if(knightIsAwake == true) {
		 return false;
	 }
	 return true;
 }
 public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonnerIsAwake) {
	 if(knightIsAwake==false && prisonnerIsAwake==false && archerIsAwake == true) {
		 return true;
	 }
	 return false;
 }
 public static boolean canSignalPrisonner(boolean archerIsAwake, boolean prisonnerIsAwake) {
	 if(archerIsAwake == false && prisonnerIsAwake == true) {
		 return true;
	 }
	 return false;
 }
 public static boolean canFreePrisonner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonnerIsAwake,boolean petDogIsPresent) {
	 if(canSpy(knightIsAwake,archerIsAwake,prisonnerIsAwake) == true && petDogIsPresent == true) {
		 return true;
	 }
	 return false;
	 
 }
	public static void main(String[] args) {
		//boolean knightIsAwake = true;
		//System.out.println(AnnalynInfiltration.canFastAttack(knightIsAwake));
		boolean knightIsAwake = false;
		boolean archerIsAwake = true;
		boolean prisonnerIsAwake = false;
		//boolean petDogIsawake = false;
		System.out.println(AnnalynInfiltration.canSpy(knightIsAwake, archerIsAwake, prisonnerIsAwake));
		//System.out.println(AnnalynInfiltration.canSignalPrisonner(archerIsAwake, prisonnerIsAwake));
		//System.out.println(AnnalynInfiltration.canFreePrisonner(knightIsAwake, archerIsAwake, prisonnerIsAwake,petDogIsawake ));
	}

}
