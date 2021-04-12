package esercizioGiorno5;
// interfaccia di immagine e video 
public interface ElementoConLuminositaRegolabile {
	
	final int LUMINOSITA_MASSIMA=10;

	void aumentaLuminosita();

	void abbassaLuminosita();
	
	int getLuminosita();

}
