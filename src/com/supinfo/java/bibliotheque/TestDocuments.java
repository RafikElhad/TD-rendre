package com.supinfo.java.bibliotheque;




public class TestDocuments { 

	public static void main(String[] args) { 
		
		Revue revue1 = new Revue(1, "La revue internationale de l'éducation familiale ", 7, 2012);  
		 
		Dictionnaire dictionnaire1 = new Dictionnaire(1, "Shikomori", "Comorien");   
		
		Roman roman1 = new Roman(1, "La République des Imberbes", "Ali Abdou Mdahoma", 304, 25000); 
		
		Manuel manuel1 = new Manuel(1, "les iles Comores", "Mohamed Toihir", 300, 2);   
	
	
		System.out.println("Revue " +revue1);
		System.out.println("=================================="); 
		System.out.println("Dictionnaire " +dictionnaire1); 
		System.out.println("==================================");  
		System.out.println("Roman " +roman1);
		System.out.println("==================================");  
		System.out.println("Manuel " +manuel1);   
		
	

	}

} 

