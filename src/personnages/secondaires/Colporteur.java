package personnages.secondaires;

import personnages.principaux.Commercant;

public class Colporteur extends Commercant{

	public Colporteur(String nom, int argent) {
		super(nom, argent);
	}
	
	public int seFaireExtorquer() {
		int argentExtorquer = this.getArgent()/2;
		this.perdreArgent(this.getArgent());
		this.parler("NON ! Je viens de me faire extorquer, ce monde est vraiment INJUSTE !");
		this.parler("Heuresement que je garde la moitié de mes sous dans mes chaussures.. Eheh.");
		return argentExtorquer;
	}

}
