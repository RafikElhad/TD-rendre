package com.supinfo.java.bibliotheque;

public class Roman extends Livre
{
	private int prixLitt;
	
	public Roman()
	{
		super();
	}
	
	public Roman(int numEnreg, String titre, 
			String auteur, int nbrPages, int prixLitt) 
	
	{
		super(numEnreg, titre, auteur, nbrPages);  
		this.prixLitt = prixLitt;
	}

	public int getPrixLitt() {
		return prixLitt;
	}

	public void setPrixLitt(int prixLitt) {
		this.prixLitt = prixLitt;
	}

	@Override
	public String toString() {
		return super.toString() + ", prixLitt=" + prixLitt + "]"; 
	}
	
	

}
