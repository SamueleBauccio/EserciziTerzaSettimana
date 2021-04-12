package esercizioGiorno4Sottoclassi;

public class Persona {
	private String nome;
	private String cognome;

	public Persona(String nome, String cognome) {
		this.nome = nome;
		this.cognome = cognome;
	}

	public void info() {
		System.out.print("Nome: " + nome + " Cognome: " + cognome);
	}

	public String getNome() {
		return nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

}