package personnages.principaux;

import personnages.Humain;

public class Ronin extends Humain {
	
	private int honneur = 1;
	
	public Ronin(String nom, int argent, String boisson) {
		super(nom, argent, boisson);
	}
	
	public void donner(int n, Commercant c) {
		this.perdreArgent(n);
		c.gagnerArgent(n);
	}
	
	public void provoquer(Yakuza y) {
		if(this.honneur*2 > y.getReputation()) {
			this.gagnerArgent(y.getArgent());
			this.honneur += 1;
			this.parler("Ce duel n'était que banalité.");
			y.perdreDuel();
			
		}
		else {
			this.honneur -= 1;
			this.parler("Comment ai-je pu perdre contre un être si faible.");
			y.gagnerDuel();
		}
	}
	
	
}
