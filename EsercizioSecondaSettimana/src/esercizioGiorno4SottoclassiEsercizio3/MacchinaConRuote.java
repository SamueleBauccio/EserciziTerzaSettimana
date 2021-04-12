package esercizioGiorno4SottoclassiEsercizio3;

import java.time.LocalDate;

public abstract class MacchinaConRuote extends MacchinaAgricola {

	protected int numeroRuote;

	public MacchinaConRuote(int numeroOrdine, String marca, LocalDate dataDiIngresso, int numeroRuote) {
		super(numeroOrdine, marca, dataDiIngresso);
		this.numeroRuote = numeroRuote;

	}

	public int getNumeroRuote() {
		return numeroRuote;
	}

}
