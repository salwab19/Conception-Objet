package personnage.principaux;

import personnage.Humain;

public class Commercant extends Humain{
	
	public Commercant (String nom, int argent) {
		super (nom, argent, "thé");
	}
	
	public int sefaireExtorquer() {
		super.perdreArgent(getArgent());
		String texte = "Le monde est trop injuste !!!!";
		parler(texte);
		return getArgent();
	}
	
	public void recevoir(int argent) {
		gagnerArgent(argent);
		System.out.println("Merceeeeeeee");
	}

}
