package eserciziGiorno2;

public class Dipendente {

	public static enum Livello {
		OPERAIO, IMPIEGATO, QUADRO, DIRIGENTE
	}

	public static enum Dipartimento {
		PRODUZIONE, AMMINISTRAZIONE, VENDITE
	}

	private Dipartimento dipartimento;
	private Livello livello;
	private final double stipendioBase = 1000;
	private String matricola;
	private double stipendio;
	private double importoOrarioStraordinario = 30;
	private double oreStraordinario = 5;

	public Dipendente(String matricola, Dipartimento dipartimento) {
		stipendio = stipendioBase;
		importoOrarioStraordinario = 30;
		livello = Livello.OPERAIO;
		this.dipartimento = dipartimento;
		this.matricola = matricola;

	}

	public Dipendente(String matric, double importoOrarioStraord, Livello posizione, Dipartimento settore,
			double stipendio) {
		matricola = matric;
		this.stipendio = stipendio;
		importoOrarioStraordinario = importoOrarioStraord;
		livello = posizione;
		dipartimento = settore;
	}

	public Livello getLivello(Livello posizione) {
		System.out.println("La posizione del dipendente e': " + posizione);
		return posizione;
	}

	public double getStipendio() {
		return stipendio;
	}

	public void setStipendio(double stipendio) {
		this.stipendio = stipendio;
	}

	public double getImportoOrarioStraordinario() {
		return importoOrarioStraordinario;
	}

	public void setImportoOrarioStraordinario(double importoOrarioStraordinario) {
		this.importoOrarioStraordinario = importoOrarioStraordinario;
	}

	public Dipartimento getDipartimento() {
		return dipartimento;
	}

	public void setDipartimento(Dipartimento dipartimento) {
		this.dipartimento = dipartimento;
	}

	public Livello getLivello() {
		return livello;
	}

	public double getStipendioBase() {
		return stipendioBase;
	}

	public double getOreStraordinario() {
		return oreStraordinario;
	}

	public void setOreStraordinario(double oreStraordinario) {
		this.oreStraordinario = oreStraordinario;
	}

	public void stampaDatiDipendente() {
		System.out.println("La matricola e': " + matricola);
		System.out.println("Lo stipendio e' " + stipendio);
		System.out.println("L' importo orario straordinario e' :" + importoOrarioStraordinario);
		System.out.println("La posizione del dipendente e': " + livello);
		System.out.println("Il settore del dipendente e' " + dipartimento);

	}

	public Livello promuovi() {
		switch (livello) {
		case OPERAIO:
			livello = Livello.IMPIEGATO;
			stipendio = stipendioBase * 1.2;
			// System.out.println("Congratulazioni!! Sei appena stato promosso a " +
			// livello);
			break;
		case IMPIEGATO:
			livello = Livello.QUADRO;
			stipendio = stipendioBase * 1.5;
			// System.out.println("Congratulazioni!! Sei appena stato promosso a " +
			// livello);
			break;
		case QUADRO:
			livello = Livello.DIRIGENTE;
			stipendio = stipendioBase * 2;
			// System.out.println("Congratulazioni!! Sei appena stato promosso a " +
			// livello);
			break;
		case DIRIGENTE:
			System.out.println("Il dipendente non può essere promosso ");
			break;
		}
		return livello;
	}

	// se il metodo e' statico (appartiene alla classe) lo richiamo con 
	//NomeClasse.calcolaPaga(pippo);
	// se non e' statico si richiama con : pippo.promuovi();
	//se NON sono statiche vuol dire che LAVORO CON I DATI DI QUELL OGGETTTO	 esempio stipendiobASE
	
	// static lavora con i dati di piu oggetti e quindi viene utilizzato come static 
	
	
	public static double calcolaPaga(Dipendente nome) {
		return nome.stipendio;
	}

	public static double calcolaPagaConStraordinario(Dipendente nome, double ore) {
		double totStraordinario = nome.stipendioBase + (nome.importoOrarioStraordinario * ore);
		return totStraordinario;
	}

	public double calcolaPaga(double oreoreStraordinario, boolean isSimulation) {
		double oreEffettive = 0;
		if (isSimulation == true) {
			oreEffettive = oreStraordinario;
		} else {
			oreEffettive = this.oreStraordinario;
		}
		double totStraordinario = this.stipendio + this.importoOrarioStraordinario * oreEffettive;
		return totStraordinario;
	}

	public static double calcolaStipendioMensile(Dipendente[] staff, double[] oreStraordinario) {
		double stipendioTotale = 0;
		for (int i = 0; i < staff.length; i++) {
			// stipendioTotale +=staff[i].stipendio + (staff[i])
			stipendioTotale += staff[i].calcolaPaga(oreStraordinario[i], true);
		}
		return stipendioTotale;
	}

	public static double calcolaStipendioMensile(Dipendente[] staff) {
		double stipendioTotale = 0;
		for (int i = 0; i < staff.length; i++) {
			// stipendioTotale +=staff[i].stipendio + (staff[i])
			stipendioTotale += staff[i].calcolaPaga(0, false);
		}
		return stipendioTotale;
	}
	
}
