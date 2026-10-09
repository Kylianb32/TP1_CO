package personnages.secondaires;

import personnages.Humain;

public class GrandMere extends Humain {
	
	private Humain [] memoire = new Humain [30];
	
	public GrandMere(String nom, int argent) {
		super(nom, argent, "thé");
	}
	
	public void faireConnaissanceAvec(Humain h) {
		
	}
	
	public void ragoter() {
		
	}

}
