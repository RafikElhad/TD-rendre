package com.supinfo.java.bibliotheque;



public class Revue extends Document 
{
	private int mois;
	private int annee; 
	 
	
	public Revue()
	{
		// appel du constructeur explicite sans parametre
		// de la classe documents 
		super();
	}
	
	public Revue(int numEnreg, String titre,
			int mois, int annee)
	
	{
		super(numEnreg, titre);
		this.mois = mois;
		this.annee = annee;
	}

	public int getMois() {
		return mois;
	}

	public void setMois(int mois) {
		this.mois = mois;
	}

	public int getAnnee() {
		return annee;
	}

	public void setAnnee(int annee) { 
		this.annee = annee;
	}
	
	

	

	@Override
	public String toString() {
		return super.toString() + ", mois=" + mois + ", annee=" + annee + "]"; 
	}
	
	

}
