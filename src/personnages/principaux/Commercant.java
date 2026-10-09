package personnages.principaux;

import personnages.Humain;

public class Commercant extends Humain {
	
	public Commercant(String nom, int argent) {
		super(nom, argent, "thé");
	}

	public int seFaireExtorquer() {
		int argentExtorquer = this.getArgent();
		this.perdreArgent(this.getArgent());
		this.parler("NON ! Je viens de me faire extorquer par, ce monde est vraiment INJUSTE !");
		return argentExtorquer;
	}
	
	public void recevoir(int n) {
		this.gagnerArgent(n);
		this.parler("Ronin, je ne saurai comment vous remercier. Vous disposez de toute ma gratitude");
	}
}
