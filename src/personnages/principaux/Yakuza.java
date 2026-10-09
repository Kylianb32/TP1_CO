package personnages.principaux;

import personnages.Humain;

public class Yakuza extends Humain {
	
	private String clan;
	private int reputation = 0;
	
	public Yakuza(String nom, int argent, String boisson, String clan) {
		super(nom, argent, boisson);
		this.clan = clan;
		
	}
	
	public String getClan() {
		return this.clan;
		
	}
	
	public int getReputation() {
		return this.reputation;

	}
	
	public void extorquer(Commercant c) {
		this.gagnerArgent(c.seFaireExtorquer());
		this.reputation += 1;
		this.parler("Ahahahah, je viens d'extorquer " + c.getNom() + ".");
	}
	
	public void gagnerDuel() {
		this.reputation += 1;
		this.parler("AHAHAH JE VIENS DE GAGNER MON DUEL");
	}
	
	public void perdreDuel() {
		this.perdreArgent(this.getArgent());
		this.reputation -= 1;
		this.parler("Aie... Je viens de perdre mon duel");
	}
	
	public void direBonjour() {
		super.direBonjour();
		this.parler("Mon clan est " + this.clan + ".");
	}
	
}
