package com.saraya.prog;

public class PlayingCard {
	public static  void parseCard(String card) {
		switch(card) {
		case "two":
			System.out.println(2);
			break;
		case "three":
			System.out.println("3");
			break;
		case "four":
			System.out.println("4");
			break;
		case "five":
			System.out.println(5);
			break;
		case "six":
			System.out.println(6);
			break;
		case "seven":
			System.out.println(7);
			break;
		case "eight":
			System.out.println(8);
			break;
		case "nine":
			System.out.println(9);
			break;
		case "ten":
			System.out.println(10);
			break;
		case "jack":
			System.out.println(10);
			break;
		case "queen":
			System.out.println(10);
			break;
		case "king":
			System.out.println(10);
			break;
		case "other":
			System.out.println(0);
			break;
		case "ace":
			System.out.println(11);
			break;
		default:
			System.out.println("not a card!!");
			break;
		}
	}
   public static boolean isBlackJack(String card1, String card2) {
	   String sum = card1 + card2;
	   switch(sum) {
	   case "ace" + "ten":
		   return true;
	   case "ace" + "king":
		   return true;
	   case "ace" + "queen":
		   return true;
	   case "ace" + "jack":
		   return true;
	   }
	return false;
	   }
   public static void largeHand(boolean isBlackJack,int dealerScore) {
	   if(isBlackJack == true && dealerScore == 0) {
		   System.out.println("W");
	   }
	   else if(isBlackJack == true && dealerScore != 0) {
		   System.out.println("S");
	   }
	   else {
		   System.out.println("P");
	   }
   }
   
public static void smallHand(int handScore, int dealerScore) {
	if(handScore<=11) {
		System.out.println("H");
	}
	else if(handScore>=17) {
		System.out.println("S");
	}
	else if(handScore>12 || handScore<17){
		System.out.println("S");
	}
	else if(handScore< 17 || handScore>12 && dealerScore<=7){
		System.out.println("H");
	}
	
}
	public static void main(String[] args) {
				parseCard("ace");
				System.out.println(isBlackJack("ace","ten"));
				
	}

	
	
}
