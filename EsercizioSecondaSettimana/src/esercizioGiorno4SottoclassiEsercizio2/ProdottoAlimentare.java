package esercizioGiorno4SottoclassiEsercizio2;

import java.time.LocalDate;

public class ProdottoAlimentare extends Prodotto {
	private LocalDate dataDiScadernza;
	boolean vegano;

	public ProdottoAlimentare(int codiceUnivoco, String descizione, double costo, LocalDate dataDiScadernza,
			boolean vegano) {
		super(codiceUnivoco, descizione, costo);
		setDataDiScadernza(dataDiScadernza);
		vegano = false;
	}

	public LocalDate getDataDiScadernza() {
		return dataDiScadernza;
	}

	public void setDataDiScadernza(LocalDate dataDiScadernza) {
		this.dataDiScadernza = dataDiScadernza;
	}

}