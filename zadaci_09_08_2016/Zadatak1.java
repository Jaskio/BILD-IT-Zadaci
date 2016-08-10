package zadaci_09_08_2016;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak1 {
	/*
	 * Napisati program koji pita korisnika da unese cijeli broj za dana�nji dan 
	 * u sedmici (0 za ponedjeljak, 1 za utorak...) i da unese broj dana nakon 
	 * dana�njeg dana te mu ispi�e koji je to dan u budu�nosti. (Primjer: ako 
	 * korisnik unese 1 kao dana�nji dan a 3 kao dan u budu�nosti program mu ispisuje 
	 * da je danas utorak a dan u budu�nosti je petak.) 
	 */
	static Scanner input = new Scanner(System.in);
	static int startDay = 0, nextDay = 0;
	
	public static void main(String[] args) {
		
		System.out.println("Unesite danasnji dan(0 za pon, 1 za uto...): ");
		startDay = inputCheck();
		while (startDay < 0 || startDay > 6) {			// provjera da li je unos u pravilnom rasponu
			System.out.println("Pogresno, unesite brojeve 0-6: ");
			startDay = inputCheck();		
		}
		System.out.println("Unesite broj dana nakon danasnjeg dana");
		nextDay = inputCheck();
		while (nextDay < 0) {
			System.out.println("Pogresno, unesite broj iznad nule: ");
			nextDay = inputCheck();
		}
		System.out.println("Dan u buducnosti je: ");	// poziv metode i
		System.out.println(dayName());					// ispis rezultata
	}
		// metoda za pronalazenje imena buduceg dana
	public static String dayName() {
		String s = "";
		int trueDay = (startDay + nextDay) % 7;			// formula za ispis buduceg dana
			switch (trueDay) {
				case 0: s = "Ponedjeljak"; break;
				case 1: s = "Utorak"; break;
				case 2: s = "Srijeda"; break;
				case 3: s = "Cetvrtak"; break;
				case 4: s = "Petak"; break;
				case 5: s = "Subota"; break;
				case 6: s = "Nedjelja"; break;
			}
			return s;
		}
			// metoda za provjeru unosa
	public static int inputCheck() {
		int n = 0;
		boolean inCheck = true;
		do {
			try {
				n = input.nextInt();		// unos
				inCheck = false;
			}
			catch (InputMismatchException e) {			// uhvati gresku
				System.out.println("Pogresan unos, probajte ponovo:");
				input.nextLine();		// ocisti input
			}
		} while (inCheck);
		return n;
	}
}

