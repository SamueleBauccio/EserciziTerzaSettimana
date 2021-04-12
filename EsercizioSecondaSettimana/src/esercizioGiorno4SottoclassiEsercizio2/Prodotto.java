package esercizioGiorno4SottoclassiEsercizio2;

public abstract class Prodotto {

	private int codiceUnivoco;
	private String descrizione;
	private double costo;

	public Prodotto(int codiceUnivoco, String descizione, double costo) {
//		this.codiceUnivoco = codiceUnivoco;
//		this.descrizione = descizione;
//		this.costo = costo;
		setCodiceUnivoco(codiceUnivoco);
		setDescrizione(descizione);
		setCosto(costo);
	}

	public void applicaSconto(double prezzoUnitario) {
		costo -= 0.05 * costo;
	}

	public String datiProdotto() {
		String dati= "Numero codice: " + codiceUnivoco + ". " + descrizione + ". " + costo;
		return dati;
	}

	public int getCodiceUnivoco() {
		return codiceUnivoco;
	}

	public void setCodiceUnivoco(int codiceUnivoco) {
		this.codiceUnivoco = codiceUnivoco;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public double getCosto() {
		return costo;
	}

	public void setCosto(double costo) {
		this.costo = costo;
	}
}
