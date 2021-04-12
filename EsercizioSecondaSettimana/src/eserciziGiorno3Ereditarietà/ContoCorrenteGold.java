package eserciziGiorno3Ereditariet�;

public class ContoCorrenteGold extends ContoCorrente {

	private String codiceSegreto;

	// I costruttori non vengono ereditati dalla classe madre.
	// I costruttori di una classe figlia deve invocare il costruttore della classe
	// madre.
	public ContoCorrenteGold(double saldo, String codiceSegreto) {

		// super � l'azione di default per invocare il costruttore della classe madre.
		// Nel nostro caso il slemplice - super(); - genera un errore perch� la nostra
		// classe madre non ha un costruttore di default

		// super();

		// Per risolvere l'errore utilizzeremo la keyword super passandogli i parametri
		// che richiede il costruttore madre.
		// L'istruzione super(....) deve essere la prima del costruttore.
		super(saldo);

		// Le variabili della classe madre vengono inizializzate dalcostruttore della
		// classe madre,
		// infatti vengono passate alla funzione super.
		// Le variabili della classe figlia vengono inizializzate dal costruttore della
		// classe figlia, come di seguito.
		this.codiceSegreto = codiceSegreto;
	}

//	public double bonifica(double ammontare, ContoCorrente destinazione) {
//		saldo -= ammontare;
//		destinazione.saldo += ammontare;
//		return saldo;
//	}

	// Stiamo facendo l'override del metodo deposita ereditato dalla classe madre
	// Questo ci serve quando vorremo cambiare le funzionalit� interne del metodo
	// stesso
	// L'importante � mantenere identici i tipi e le quantit� di parametri input e
	// return e il nome del metodo
	public double deposita(double ammontare) {

		// metodo riscritto da 0
		// return saldo += ammontare + 1;

		// metodo che richiama il metodo dalla classe madre e sul suo return aggiunge
		// delle funzionalit�
		return super.deposita(ammontare) + 1;
	}

	public boolean confrontaCodiciSegreti(ContoCorrenteGold target) {
		return (target.codiceSegreto.length() > this.codiceSegreto.length());
	}
}
