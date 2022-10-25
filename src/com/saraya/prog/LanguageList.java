package com.saraya.prog;

import java.util.ArrayList;
import java.util.List;

public class LanguageList {
	
	private static  List<String> languages = List.of("Java", "python", "C", "Kotlin", "Js") ;

	  public static boolean isEmpty() {
	    if(languages.isEmpty()) {
	    	return true;
	    }
	    return false;
	    //return languages.isEmpty();
	  }
	  public static List<String> addLanguage(String language) {
	        List <String> anna = new ArrayList<>(languages);
		     anna.add(language);
		      return anna;
	  }
	  
	  public static List<String> removeLanguage(String language) {
		  List <String> anna = new ArrayList<>(languages);
	         anna.remove(language);
	         return anna;
	  }
	  
	  public static String firstLanguage() {
	      return languages.get(0);
	  }
	  
	  public static int count() {
	    return languages.size();
	  }
	  
	  public static boolean containsLanguage(String language) {
	    if(language.contains(language)) {
	    	return true;
	    }
	    return false;
	  }
	  
	  public static boolean isExciting() {
	    if(languages.contains("Java") || languages.contains("Kotlin")){
	    	return true;
	    }
	    return false;
	  }
	  
	public static void main(String[] args) {
		//List <String> languages = List.of(); 
        System.out.println(languages.isEmpty());
      // System.out.println(LanguageList.addLanguage("Ruby"));
       // System.out.println(LanguageList.removeLanguage(""));
       System.out.println(LanguageList.firstLanguage());
       System.out.println(LanguageList.count());
       System.out.println(LanguageList.containsLanguage("JAVA"));
       System.out.println(LanguageList.isExciting());
	}
}
