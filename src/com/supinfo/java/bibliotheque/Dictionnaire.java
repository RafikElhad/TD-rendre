package com.supinfo.java.bibliotheque;



public class Dictionnaire extends Document 
{
	private String langue;
	 
	
	public Dictionnaire()
	{
		// appel du constructeur explicite sans parametre
		// de la classe documents  
		super();
	}
	
	public Dictionnaire(int numEnreg, String titre,
			String langue) 
	
	{
		super(numEnreg, titre);
		this.langue = langue; 
	}

	public String getLangue() {
		return langue;
	}

	public void setLangue(String langue) {
		this.langue = langue;
	}
	
	

	

	@Override
	public String toString() {
		return super.toString() + ", langue=" + langue + "]"; 
	}
	
	

}
