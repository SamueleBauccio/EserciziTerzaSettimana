package esercizioGiorno5;

import java.util.Scanner;

public class LettoreMultimediale {
	Scanner tastiera = new Scanner(System.in);
	private ElementoMultimediale[] elements = new ElementoMultimediale[5];
	private int numeroElementiInseriti;

	public boolean inserisciInArray(ElementoMultimediale file) {
		if (numeroElementiInseriti >= 5) {
			System.out.println("Il lettore e' gia pieno ");
			return false;
		}
		for (int i = 0; i < elements.length; i++) {
			if (elements[i] == null) {
				elements[i] = file;
				return true;
			}
		}
		return false;

	}

	public void mostraArray() {

		for (int i = 0; i < elements.length; i++) {
			if (elements[i] != null) {
				System.out.println(elements[i]);
			} else {
				System.out.println("Elemento vuoto ");
			}
		}
	}

	public void eseguiLettoreMultimediale() {

		int valoreDaTastiera;
		do {
			System.out.println(
					"Segli il file da riprodurre inserendo un valore compreso tra 1 e 5; altrimenti premi 0 per uscire.");

			valoreDaTastiera = tastiera.nextInt();

			switch (valoreDaTastiera) {
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
				if (elements[valoreDaTastiera - 1] != null) {
					elements[valoreDaTastiera - 1].esegui();
				} else {
					System.out.println("Lo slot " + valoreDaTastiera + " non contiene nulla ");
				}
				break;
			case 0:
				System.out.println("Grazie e arrivederci!!! ");
				break;
			default:
				System.out.println("Devi inserire un numero tra 0 e 5 ");
			}

		} while (valoreDaTastiera != 0);

//con istanceof (dato un indirizzo qualsiasi va a vedere se in quel indirizzo c' e' un oggetto di tipo ElementoMultimedialeRiproducibile
//				if(elements[0] instanceof ElementoMultimedialeRiproducibile) {
//														le 2 parentesi tonde indicano un CAST ovvero una forzatura nell eseguire 
//					ElementoMultimedialeRiproducibile e = (ElementoMultimedialeRiproducibile) elements[0];
//					e.play();
//				} else if (elements[0] instanceof Immagine) {
//					Immagine i= (Immagine) elements[0];	
//					i.show();
//				}
//				
//			case 2:
//				System.out.println(elements[1]);
//				break;
//			case 3:
//				System.out.println(elements[2]);
//				break;
//			case 4:
//				System.out.println(elements[3]);
//				break;
//			case 5:
//				System.out.println(elements[4]);
//				break;
//			case 0:
//				System.out.println("Grazie e arrivederci");
//				break;

		tastiera.close();
	}
}
