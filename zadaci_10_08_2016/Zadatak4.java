package zadaci_10_08_2016;

import java.util.Scanner;

public class Zadatak4 {
	/*
	 * Napisati metodu koja pronalazi broj ponavljanja odre�enog karaktera u stringu. 
	 * Metoda treba da koristi sljede�i header: public static int count(String str, char a). 
	 * Na primjer, ukoliko pozovemo metodu na sljede�i na�in: count("Welcome", e) metoda 
	 * treba da vrati 2. Napisati program koji pita korisnika da unese string i koji karakter 
	 * �eli da prebroji u datom stringu te mu ispi�e koliko se puta odre�eni karakter ponovio 
	 * u zadatom stringu.
	 */
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Unesite string: ");
		String str = input.nextLine();		// unos stringa
		System.out.println("Unesite karakter (malim slovima): ");
		char a = checkInput();		// unos karaktera
		
		System.out.print("String: " + str + "\nKarakter " + a + " se pojavljuje " + count(str, a) + " puta");	// ispis rezultata
	}
	
			// metoda za broj ponavljanja odredjenog karaktera
	public static int count(String str, char a) {
		int counter = 0;
		char b = ' ';
		for (int i = 0; i < str.length(); i++) {
			b = str.toLowerCase().charAt(i);	// string prebaciti u mala slova
			if (b == a) {
				counter++;			// brojac ponavljanja karaktera
			}
		}
		return counter;
	}
	
			// metoda za provjeru unosa
	public static char checkInput() {
		char ch = ' ';
		boolean check = true;
		do {
			try {
				ch = input.next(".").charAt(0);		// samo jedan karakter dozvoljen
				check = false;
			}
			catch (Exception e) {		// hvatanje greske
				System.out.println("Pogresan unos, samo jedan karakter dozvoljen! Probaj ponovo:");
				input.nextLine();
			}
		} while (check);
		return ch;
	}
}
