package com.saraya.prog;

public class ElonsToyCar {
	 int distanceDriven;

	 int batteryPercentage = 100;

	private static ElonsToyCar buy() {
		return new ElonsToyCar();
	}
	private String distanceDisplay() {
		return String.format("Driven %d meters", distanceDriven);
	
	}
	private String batteryDisplay() {
		 if(this.batteryPercentage == 0) {
			 return "Battery empty";
			}
			 return String.format("Battery at %d%%", batteryPercentage);
	   }
	
	private void drive() {
		if(this.batteryPercentage != 0) {
			    		this.distanceDriven += 20;
			            this.batteryPercentage--;
			    	}   

	}

	public static void main(String[] args) {
		ElonsToyCar car = ElonsToyCar.buy();
		System.out.println(car.distanceDisplay());
		System.out.println(car.batteryDisplay());
		//System.out.println(car.drive());
	}
			
	

}
