package esercizioGiorno4Sottoclassi;

public class Studente extends Persona {

	public enum StatoStudente {
		IN_CORSO, FUORI_CORSO, LAUREATO, INTERROTTO
	}

	private int matricolaStudente;
	private String corsoDiLaurea;
	public StatoStudente stato;

	public Studente(String nome, String cognome, int matricolaStudente, String corsoDiLaurea) {
		super(nome, cognome);

		setMatricolaStudente(matricolaStudente);
		setCorsoDiLaurea(corsoDiLaurea);

	}

	public void infoStudente() {
		super.info();
		System.out.print(" Numero matricola: " + getMatricolaStudente());
		System.out.println(" Iscritto al corso di: " + getCorsoDiLaurea() );
	}

//	public StatoStudente setStatoStudente(StatoStudente stato) {
//		switch (stato) {
//		case IN_CORSO:
//			System.out.println("Il tuo stato e' " + stato);
//			break;
//		case FUORI_CORSO:
//			System.out.println("Il tuo stato e' " + stato);
//			break;
//		case LAUREATO:
//			System.out.println("Il tuo stato e' " + stato);
//		default:
//			System.out.println("Il tuo stato e' " + stato);
//			break;
//		}
//		return stato;
//	}

	public int getMatricolaStudente() {
		return matricolaStudente;
	}

	public void setMatricolaStudente(int matricolaStudente) {
		this.matricolaStudente = matricolaStudente;
	}

	public String getCorsoDiLaurea() {
		return corsoDiLaurea;
	}

	public void setCorsoDiLaurea(String corsoDiLaurea) {
		this.corsoDiLaurea = corsoDiLaurea;
	}

}
