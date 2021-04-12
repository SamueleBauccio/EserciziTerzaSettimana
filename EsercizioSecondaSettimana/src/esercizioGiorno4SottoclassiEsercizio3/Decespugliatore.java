package esercizioGiorno4SottoclassiEsercizio3;

import java.time.LocalDate;

public class Decespugliatore extends MacchinaAgricola {

	private boolean accensioneElettronica;

	public Decespugliatore(int numeroOrdine, String marca, LocalDate dataDiIngresso, boolean accensioneElettronica) {
		super(numeroOrdine, marca, dataDiIngresso);
	}

	public boolean isAccensioneElettronica() {
		return accensioneElettronica;
	}
}
