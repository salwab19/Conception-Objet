package histoires;

import personnage.Humain;

public class MonHistoire {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Humain salwa = new Humain("Salwa", 10000, "Iced latte");
		salwa.parler(null);
		salwa.direBonjour();
		salwa.boire();

	}

}
