package zadaci_09_08_2016;

import java.util.Scanner;

public class Zadatak2 {
	/*
	 * Great circle distance predstavlja udaljenost izme�u dvije ta�ke na 
	 * povr�ine sfere. Neka nam (x1, y1) i (x2, y2) predstavljaju geografsku 
	 * �irinu i du�inu dvije ta�ke. Great circle distance izme�u ove dvije 
	 * ta�ke mo�e biti izra�unata koriste�i se sljede�om formulom: 
	 * d = radius * arccos (sin(x1) X sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2)). 
	 * Napisati program koij pita korisnika da unese geografsku �irinu i du�inu u 
	 * stepenima dvije ta�ke na povr�ini zemlje te mu ispisuje great circle distance. 
	 * Prosje�ni radius zemlje je 6.371.01 km. Stepene koje korisnik unese trebamo 
	 * promijeniti u radianse koriste�i se Math.toRadians metodom jer Java trigonometrijske 
	 * metode koriste radianse. �irina i du�ina u ovoj formuli se odnose na zapad i sjever. 
	 * Koristimo negativne vrijednosti da ozna�imo istok i jug. 
	 */
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Unesite koordinate prve tacke (u stepenima): ");
		double x1 = checkInput();		// provjera unos
		x1 = Math.toRadians(x1);		// pretvorba u radijane
		double y1 = checkInput();
		y1 = Math.toRadians(y1);
		System.out.println("Unesite koordinate druge tacke (u stepenima): ");
		double x2 = checkInput();
		x2 = Math.toRadians(x2);
		double y2 = checkInput();
		y2 = Math.toRadians(y2);
		
		gsd(x1, y1, x2, y2);		// poziv metode
	}
	
		// metoda za izracun udaljenost izmedju dvije tacke
	public static void gsd(double x1, double y1, double x2, double y2) {
		double radius = 6371.01;
		double d = radius * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));	// formula za izracun udaljenosti
		System.out.printf("Udaljenost: %5.2f km", d);		// ispis rezultata
	}
	
		// metoda za provjeru unosa
	public static double checkInput() {
		double num = 0;
		boolean check = true;
		do {
			try {
				num = input.nextInt();		// unos
				check = false;
			}
			catch (Exception e) {		// hvatanje greske
				System.out.println("Pogresan unos, probajte ponovo:");
				input.nextLine();		// ocisti input
			}
		} while (check);
		return num;
	}
}
