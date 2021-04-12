package esercizioGiorno5;

import java.util.Scanner;

public class Start {
	static Scanner tastiera = new Scanner(System.in);

	public static void main(String[] args) {
		LettoreMultimediale lettore = new LettoreMultimediale();

//		Video cosa = new Video("ciao", 9, 9, 1);
//		Audio ciao = new Audio("ciaone", 5, 6);
//		Immagine bau = new Immagine("baby", 8);
//
//		boolean inserito = lettore.inserisciInArray(cosa);
//		if (inserito) {
//			System.out.println("Inserito un video ");
//		}
//
//		inserito = lettore.inserisciInArray(ciao);
//		if (inserito) {
//			System.out.println("Inserito un audio ");
//		}
//
//		inserito = lettore.inserisciInArray(bau);
//		if (inserito) {
//			System.out.println("Inserito un' immagine ");
//		}

		for(int i=0; i<5; i++) {
			ElementoMultimediale x = richiediNuovoElemento();
			lettore.inserisciInArray(x);
		}
		
		lettore.mostraArray();

		lettore.eseguiLettoreMultimediale();

//		cosa.play();
//		ciao.play();
//		bau.show();

	}

	public static ElementoMultimediale richiediNuovoElemento() {
		ElementoMultimediale elemento;
		while (true) {
			System.out.println("Inserisci il tipo di elemento che desideri: v --> video  i --> immagine a --> audio ");
			String risposta = tastiera.nextLine();
			switch (risposta) {
			case "v":
				System.out.println("Inserisci il titolo del Video: ");
				String titolo = tastiera.nextLine();
				System.out.println("Inserisci la durata del Video: ");
				int durata = tastiera.nextInt();
				System.out.println("Inserisci il volume del Video: ");
				int volume = tastiera.nextInt();
				System.out.println("Inserisci la luminosita del Video: ");
				int luminosita = tastiera.nextInt();
				tastiera.nextLine();
				elemento = new Video(titolo, durata, volume, luminosita);
				return elemento;
			case "i":
				System.out.println("Inserisci il titolo del Immagine: ");
				String titoloImmagine = tastiera.nextLine();
				System.out.println("Inserisci la luminosita dell' Immagine: ");
				int luminositaImmagine = tastiera.nextInt();
				tastiera.nextLine();
				elemento = new Immagine(titoloImmagine, luminositaImmagine);
				return elemento;
			case "a":
				System.out.println("Inserisci il titolo dell' Audio: ");
				String titoloAudio = tastiera.nextLine();
				System.out.println("Inserisci la durata dell' Audio: ");
				int durataAudio = tastiera.nextInt();
				System.out.println("Inserisci il volume dell' Audio: ");
				int volumeAudio = tastiera.nextInt();
				tastiera.nextLine();
				elemento = new Audio(titoloAudio, durataAudio, volumeAudio);
				return elemento;
			default:
				System.out.println("Inserisci correttamente il tipo di elemento!! ");
			}
		}

	}

}