package eserciziGiorno2;

import eserciziGiorno2.Dipendente.Dipartimento;
import eserciziGiorno2.Dipendente.Livello;

public class DipendentiStart {

	public static void main(String[] args) {

		Dipendente gino = new Dipendente("20580", Dipartimento.PRODUZIONE);
		Dipendente lollo = new Dipendente("24844", Dipartimento.PRODUZIONE);
		Dipendente brigido = new Dipendente("88100", 30, Livello.IMPIEGATO, Dipartimento.AMMINISTRAZIONE, 1000);
		Dipendente pippo = new Dipendente("9760", 30, Livello.DIRIGENTE, Dipartimento.VENDITE, 1000);
		
		
		//gino.promuovi();
		System.out.println("Complimenti, sei stato promosso a " + gino.promuovi());
		System.out.println("Complimenti, sei stato promosso a " + lollo.promuovi());
		System.out.println("Complimenti, sei stato promosso a " + brigido.promuovi());
		System.out.println(pippo.promuovi());
		
		
		
		//double somma = gino.calcolaPaga(5);
		
	}
	
	//ritorjare lo stipendio per tutti i dipendenti sapendo che hanno fatto le ore di straordinario


}
