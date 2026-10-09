package personnages.secondaires;

import personnages.Humain;
import personnages.principaux.Commercant;
import personnages.principaux.Samourai;

public class Traitre extends Samourai {
	
	private int niveauDeTraitrise = 0;

	public Traitre(String nom, int argent, String boisson, String seigneur) {
		super(nom, argent, boisson, seigneur);
	}
	
	public void extorquer(Commercant c) {
		if(this.niveauDeTraitrise < 3) {
			this.gagnerArgent(c.seFaireExtorquer());
			this.niveauDeTraitrise += 1;
			this.parler("Ahahahah, je viens d'extorquer " + c.getNom() + ".");
		}
		else {
			this.parler("Je vais t'épargner aujourd'hui, j'ai déjà extorquer assez de monde.");
		}
	}
	
	public void direBonjour() {
		super.direBonjour();
		this.parler("Mon niveau de traitrise est de : " + this.niveauDeTraitrise + ".");
	}
	
	public void faireLeGentil(int n, Humain h) {
		if(this.getArgent() - n < 0) {
			this.parler("Mince je n'ai pas assez d'argent");
		}
		else {
			this.perdreArgent(n);
			h.gagnerArgent(n);
			this.parler("Tiens mon ami ! Un peu de sous.");
			niveauDeTraitrise -= n/10;
			if(niveauDeTraitrise < 0) {
				this.niveauDeTraitrise = 0;
			}
		}
		
	}

}
