package com.supinfo.java.bibliotheque;


public abstract class Livre extends Document  
{
	private String auteur;
	private int nbrPages; 
	  
	
	public Livre()
	{
		// appel du constructeur explicite sans parametre
		// de la classe documents  
		super();  
	} 
	
	public Livre(int numEnreg, String titre,  
			String auteur, int nbrPages)
	
	{ 
		super(numEnreg, titre);
		this.auteur = auteur;
		this.nbrPages = nbrPages; 
		
	}

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	public int getNbrPages() {
		return nbrPages;
	}

	public void setNbrPages(int nbrPages) {
		this.nbrPages = nbrPages;
	}
	
	

	

	@Override
	public String toString() {
		return super.toString() + ", auteur=" + auteur + ", nbrPages=" + nbrPages + "]";   
	}
	
	

}
