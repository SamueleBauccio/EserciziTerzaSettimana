package esercizioGiorno4Sottoclassi;

import java.time.LocalDate;

public class Start {

	public static void main(String[] args) {
		Studente giovanni = new Studente("Giovanni", "Lollobrigido", 22, "Informatica");
		Lavoratore franco = new Lavoratore("Franco", "Baudo", "125552", "Google", LocalDate.of(2021, 04, 8));
		Studente pippo = new Studente("Franco", "Bracco", 33325, "Filosofia");
		
		pippo.infoStudente();
		giovanni.infoStudente();
		franco.infoLavoratore();
		
	}

}
