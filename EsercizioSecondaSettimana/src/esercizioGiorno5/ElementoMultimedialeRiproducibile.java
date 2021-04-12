package esercizioGiorno5;

//classe madre di video e audio 
public abstract class ElementoMultimedialeRiproducibile extends ElementoMultimediale {

	protected int durata;
	protected int volume = 5;
	protected final int maxVolume = 10;

	public ElementoMultimedialeRiproducibile(String titolo, int durata, int volume) {
		super(titolo);
		this.durata = durata;
		this.volume = volume;
	}

	public void abbassaVolume(int volume) {
		if (volume > 0) {
			volume--;
		} else {
			System.out.println("Il volume e' gia' al minimo ");
		}
	}
	//una funzione concreta puo' richiamare una funzione astratta
	public void esegui() {
		play();
	}
	
	public abstract void play();

	public void aumentaVolume(int volume) {
		if (volume < maxVolume) {
			volume++;
		} else {
			System.out.println("Il volume e' gia' al massimo ");
		}
	}
}
