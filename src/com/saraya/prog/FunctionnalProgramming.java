package com.saraya.prog;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class FunctionnalProgramming {
	
	public static List <String> names = List.of("Aliou","Fatou","Modou","Siga","Ali","Mariam","Ibrahim");
	public static List <Integer> number = List.of(23,45,65,78,12,54,76,89,65);
	public static List <Integer> numbers = List.of(7,14,21,28,35,42,46,49,53,54,70);
	public static List <String> name = List.of("ousmane", "ouley", "oulimata","modou","naim","alassane","aliou","alia");

	public static void main(String[] args) {
		
		List <Integer> numbers = List.of(2,3,4,5,6,7,8,9);
		
		//Optional <Integer> num = number.stream().max((n1,n2) -> Integer.compare(n1, n2));
		//int num1 = num.get();
		//afficher le maximum
		//System.out.println(number.stream().max((n1,n2) -> Integer.compare(n1,n2)));
		//System.out.println(number.stream().max((n1,n2) -> Integer.compare(n1,n2)).get());
		//afficher le minimum
		//System.out.println(number.stream().min((n1,n2) -> Integer.compare(n1,n2)).get());
		//pair
		//number.stream().filter(e -> e%2 == 0).forEach(e -> System.out.println(e));
		//pair en liste
		//System.out.println(number.stream().filter(e -> e%2 ==0).collect(Collectors.toList()));
		//impair en liste
		//System.out.println(number.stream().filter(e -> e%2 != 0).collect(Collectors.toList()));
		//pair au carre en liste
		//System.out.println(number.stream().filter(e -> e%2 == 0).map(e -> e*e).collect(Collectors.toList()));
		//au carre de liste
		//System.out.println(number.stream().map(e -> e*e).collect(Collectors.toList()));
		//max pair liste
		//System.out.println(number.stream().filter(e -> e%2 == 0).max((n1,n2) -> Integer.compare(n1, n2)).get());
		//afficher 0 dans une liste vide
		//System.out.println(number.stream().filter(e -> e%2 == 0).max((n1,n2) -> Integer.compare(n1, n2)).orElse(0));
	//}
	
	 	//carre des nombres de 1 a 10
	
	//IntStream.range(1,11).forEach(e -> System.out.println(e));
	//IntStream.range(1,11).map(e -> e*e).forEach(e -> System.out.println(e));
	//name.stream().e.toUpperCase().forEach(e -> System.out.println(e));
	
	//liste des names en uppercase
	//liste de name afficher leur length

		//afficher la liste
		//name.stream().forEach(element -> System.out.println(element));		
		
		//afficher les elements se terminant par 'ou'
		//for(String word : name) {
			//if(word.endsWith("ou"))
				//System.out.print(word);
		//}
	    // name.stream().filter(e -> e.endsWith("ou")).forEach(element -> System.out.println(element));
	     
	     
	     
	     //somme des nombres de la liste
	     //int sum = 0;
	     //for(Integer num : number) {
	    	// sum += num;
	    	 //}
	     
	    	 //System.out.println(sum);
	    // }
	    // int sum = number.stream().reduce(0, (num1, num2) -> num1 + num2);
	     //System.out.println(sum);
		
	//exercice
	     //creer une liste de number afficher even/odd number utiliser filter
	     //afficher somme des odd numbers utiliser filter et reduce
	     //afficher somme des even numbers  utiliser filter et reduce
		
		
		
		//even number
		//numbers.stream().filter(a -> a%2==0).forEach(numbers -> System.out.println(numbers));
		
	    //odd numbers
		//numbers.stream().filter(a -> a%2==1).forEach(numbers -> System.out.println(numbers));
		
		//somme des even numbers
		//int sum = numbers.stream().filter(a ->a%2==0).reduce(0,(num1,num2) -> num1+num2);
		//System.out.println(sum);
		
		//somme des odd numbers
		//int summ = numbers.stream().filter(a -> a%2==1).reduce(0, (num1, num2) -> num1 + num2);
		//System.out.println(summ);
		
		//public static int sum() {
		//	return number.stream().reduce(0,(n1,n2) -> {
		//		System.out.println(n1 + " " + n2);
		//		return n1 + n2;
		//		});
		//	}
	
	
	//creer une liste de string 
	//ecrire tous les noms comnmecant par "ou" les mettres en uppercase
	//ecrire tous les noms qui se terminent par "al" les mettre en lowercase et les mettre dans une liste
	//faire une liste des carrees des nombres divisibles par 7 dans une liste
	//carre des nombres divisibles par 4 se trouvant entre 1 et 100 et les mettre dans une liste 
	//5,6,7,8 de exercism
		
		//name.stream().filter(e -> e.startsWith("ou")).forEach(ele -> System.out.println(ele));
		
		//System.out.println(name.stream().filter(e -> e.endsWith("al")).map(e -> e.toUpperCase()).collect(Collectors.toList()));
		
		//System.out.println(numbers.stream().filter(e -> e%7 == 0).map(e -> e*e).collect(Collectors.toList()));
		
		  //System.out.println(IntStream.range(1, 100).filter(e -> e%4 == 0).map(e -> e*e).collects(Collectors.toList()));
		
		
		
		//list de string
		//start 'al' end 'ou' lowercase uppercase contains tr 
		//list de number
		//even odd biggest and biggest of even and odd
		
		//start with al
		List <String> start = name.stream().filter(e -> e.startsWith("al")).collect(Collectors.toList());
		System.out.println(start.stream().map(e ->e.toUpperCase()).collect(Collectors.toList()));
		System.out.println(start.stream().map(e ->e.toLowerCase()).collect(Collectors.toList()));
		System.out.println(start);
	
	
		//ends with ou
		System.out.println(name.stream().filter(e -> e.endsWith("ou")).map(e -> e.toUpperCase()).collect(Collectors.toList()));
				
		//even number
		//numbers.stream().filter(a -> a%2==0).forEach(number -> System.out.println(numbers));
				
	   //odd numbers
	     //numbers.stream().filter(a -> a%2==1).forEach(number -> System.out.println(numbers));
				
		//uppercase
		//names.stream().map(e -> e.toUpperCase()).forEach(e -> System.out.println(e));
		
		
		//lowercase
		//names.stream().map(e ->e.toLowerCase()).forEach(el -> System.out.println(el));
		
		//contains tr
		//names.stream().filter(e -> e.contains("tr")).forEach(e -> System.out.println(e));

		//biggest
	    //System.out.println(number.stream().max((n1,n2) -> Integer.compare(n1,n2)).get());

		//biggest even
		//number.stream().max((n1,n2) -> Integer.compare(n1,n2)).filter(a -> a%2==0).get();
		
		//biggest even
		//number.stream().max((n1,n2) -> Integer.compare(n1,n2)).filter(a -> a%2==1).get();
				

}                   

	
}