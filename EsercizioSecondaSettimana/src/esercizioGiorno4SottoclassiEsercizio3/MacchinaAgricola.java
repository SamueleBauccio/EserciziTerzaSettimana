package esercizioGiorno4SottoclassiEsercizio3;

import java.time.LocalDate;

public abstract class MacchinaAgricola {
	protected int numeroOrdine;
	protected String marca;
	protected LocalDate dataDiIngresso;
	protected Lavorazione[] lavorazioni = new Lavorazione[10];
	protected int numeroLavorazioni;

	public MacchinaAgricola(int numeroOrdine, String marca, LocalDate dataDiIngresso) {
		this.numeroOrdine = numeroOrdine;
		this.marca = marca;
		this.dataDiIngresso = dataDiIngresso;
	}

	public double costoRiparazione() {
		double costo = 0;
		for (int i = 0; i < numeroLavorazioni; i++) {
			costo += lavorazioni[i].getCosto();
		}
		return costo;
	}

	public int getNumeroOrdine() {
		return numeroOrdine;
	}

	public void setNumeroOrdine(int numeroOrdine) {
		this.numeroOrdine = numeroOrdine;
	}

	public LocalDate getDataDiIngresso() {
		return dataDiIngresso;
	}

	public void setDataDiIngresso(LocalDate dataDiIngresso) {
		this.dataDiIngresso = dataDiIngresso;
	}

	public String getMarca() {
		return marca;
	}

}
