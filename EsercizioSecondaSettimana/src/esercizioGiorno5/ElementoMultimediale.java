package esercizioGiorno5;
//Classe madre per immagine e ElementoMultimedialeRiproducibile

public abstract class ElementoMultimediale {

	protected String titolo;

	public ElementoMultimediale(String titolo) {
		this.titolo = titolo;
	}
	public abstract void esegui();
}
