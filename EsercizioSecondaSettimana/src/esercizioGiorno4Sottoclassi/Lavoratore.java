package esercizioGiorno4Sottoclassi;

import java.time.LocalDate;

public class Lavoratore extends Persona {
	

//	private enum StatoLavoratore {
//		IN_ATTIVITA, IN_FERIE, IN_MALATTIA
//	}

	private String matricolaLavoratore;
	private String azienda;
	private LocalDate dataAssunzione;
	//private StatoLavoratore stato;
	

	public Lavoratore(String nome, String cognome, String matricolaLavoratore, String azienda, LocalDate dataAssunzione) {
		super(nome, cognome);
		setMatricolaLavoratore(matricolaLavoratore);
		setAzienda(azienda);
		setDataAssunzione(dataAssunzione);
	}
	

	public void infoLavoratore() {
		super.info();
		System.out.println(" Numero matricola: " + matricolaLavoratore + " Azienda: " + azienda + " Data di assunzione: " +  dataAssunzione);
	}

	public String getMatricolaLavoratore() {
		return matricolaLavoratore;
	}

	public void setMatricolaLavoratore(String matricolaLavoratore) {
		this.matricolaLavoratore = matricolaLavoratore;
	}

	public String getAzienda() {
		return azienda;
	}

	public void setAzienda(String azienda) {
		this.azienda = azienda;
	}

	public LocalDate getDataAssunzione() {
		return dataAssunzione;
	}

	public void setDataAssunzione(LocalDate dataAssunzione) {
		this.dataAssunzione = dataAssunzione;
	}

}
