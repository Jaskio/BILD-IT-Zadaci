package zadaci_10_08_2016;

public class Zadatak3 {
	/*
	 * Napisati program koji ispisuje sve mogu�e kombinacije za biranje dva broja u 
	 * rasponu od 1 do 7. Tako�er, program ispisuje broj svih mogu�ih kombinacija.  
	 * Dakle, program treba da ispi�e sve mogu�e parove brojeva u datom rasponu, 
	 * krenuv�i sa 1 2, 1 3, 1 4, itd. Broj mogu�ih kombinacija je 21. 
	 */
	public static void main(String[] args) {
		double counter = 0;
		System.out.println("Kombinacije za biranje dva broja u rasponu od 1 do 7: ");
		for (int i = 1; i <= 7; i++) {		// petlje za prvi
			for (int j = 1; j <= 7; j++) {	// i drugi broj
				if (i != j) {				// ako prvi broj nije jednak drugom, ispisati brojeve
				System.out.print(i + "" + j + ", ");
				counter += 0.5;						// brojac kombinacija
				}
			}
		}
		System.out.print("\nBroj kombinacija: " + (int) counter);
	}
}
