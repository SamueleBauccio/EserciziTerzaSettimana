package eserciziGiorno3Ereditarietà;

public class ContoCorrente {
	private double saldo;
	
	

	public ContoCorrente(double saldo) {
		this.setSaldo(saldo);
	}

// ritorna un double perche' la funzione 
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	// E' obbligatorio che un costruttore di classe figlia chiamai il costruttore di classe madre. super(nomeVariablili);
	// Se la variabile e' privata viene ereditata dalla figlia ma il 
	// codice non riesce a alvorare con questa variabile perche' e' privata.
	// Mentre se una variabile e' protected, puo' essere vista sia dalla classe
	// madre che da tutte le figlie.
	// Se una variabile e' pubblica puo essere letta da tutte le linee di
	// codice del mio programma e quindi e' difficile capire dove risale il
	// problema.
	// quando una variabile e' public non si piu' piu' modificare.
	//Le variabili protected non sono visibili fuori dal package della classe che le definisce

	public double deposita(double ammontare) {
		saldo += ammontare;
		return saldo;
	}

	public double preleva(double ammontare) {
		saldo -= ammontare;
		return saldo;
	}

}
