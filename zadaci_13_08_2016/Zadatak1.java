package zadaci_13_08_2016;

import java.util.Scanner;

	/*
	 * (Izra�unavanje napojnice) Napisati program koji u�itava ukupan iznos ra�una koji treba uplatiti kao i procenat tog ra�una 
	 * kojeg �elimo platiti kao napojnicu te izra�unava ukupan ra�un i napojnicu. Na primjer, ukoliko korisnik unese 10 kao ra�un 
	 * i 15 % kao procenat za napojnicu program treba da ispi�e da je ukupan ra�un za uplatiti 11.5 a napojnica 1.5. 
	 */

public class Zadatak1 {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter amount of your bill:");
		double bill = checkInput();						// unos i provjera unosa
		System.out.println("Enter tip (percentage of your bill):");
		double tip = checkInput();
		
		double newTip = bill * tip / 100;				// pretvorba procentualne napojnice u stvarni iznos
		System.out.printf("Total bill to be paid is %4.2f and tip is %3.2f", bill + newTip, newTip);
	}
		// metoda koja provjerava unos 
	public static double checkInput() {
		double num = 0;
		boolean check = true;
		do {
			try {
				num = input.nextDouble();
				if (num < 0) {				// ako je broj negativan, pretvoriti u pozitivan
					num = Math.abs(num);
				}
				check = false;
			}
			catch (Exception e) {			// hvatanje greske i pruzena prilika da se ispravi unos :)
				System.out.println("Wrong input, try again:");
				input.nextLine();
			}
		} while (check);
		return num;
	}
}
