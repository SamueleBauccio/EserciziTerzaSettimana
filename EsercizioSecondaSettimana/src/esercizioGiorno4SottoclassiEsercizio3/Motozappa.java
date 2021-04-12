package esercizioGiorno4SottoclassiEsercizio3;

import java.time.LocalDate;

public class Motozappa extends MacchinaConRuote {
	private int numeroFrese;

	public Motozappa(int numeroOrdine, String marca, LocalDate dataDiIngresso, int numeroRuote, int numeroFrese) {
		super(numeroOrdine, marca, dataDiIngresso, numeroRuote);
		this.numeroFrese=numeroFrese;
	}

	public int getNumeroFrese() {
		return numeroFrese;
	}

}
