package personnage;

public class Humain {
	private String nom;
	private int argent;
	private String boisson;
	
	public Humain(String nom, int argent, String boisson) {
		this.nom = nom;
		this.argent = argent;
		this.boisson = boisson;
	}
	
	public void parler (String text) {
		System.out.println(this.nom+" - "+text);
	}
	
	public void direBonjour() {
		String texte = "Bonjour ! Je m’appelle "+ this.nom+ " et j’aime boire du "+ this.boisson;
		parler(texte);
	}
	
	public void boire() {
		String texte = "Mmmm, un bon verre de "+this.boisson+"! GLOUPS !";
		parler(texte);
	}
	
	public int getArgent() {
		return argent;
	}
	
	public String getBoisson() {
		return boisson;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void gagnerArgent(int n) {
		argent+=n;
	}
	
	public void perdreArgent(int n) {
		argent-=n;
	}

}
