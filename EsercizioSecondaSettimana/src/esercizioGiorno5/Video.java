package esercizioGiorno5;

public class Video extends ElementoMultimedialeRiproducibile
		implements ElementoConVolumeRegolabile, ElementoConLuminositaRegolabile {

	protected int luminosita;

	public Video(String titolo, int durata, int volume, int luminosita) {
		super(titolo, durata, volume);
		this.luminosita = luminosita;
	}

	// il metodo append non e' un void... ritorna l' oggetto sulla quale il metodo e' chiamato. (this)
	//quindi e' possibile richiamare a catena i metodi 
	//StringBuilder e' una classe che aiuta a costruire delle stringhe pezzo per pezzo.
	//per ritornare una stringa costruita con lo StringBuilder e' necessario 
	//richiamarla in funzione con .toString();
	//La funzione toString e' definita originatiamente in obgect e viene chiamata 
	//ogni volta che mando in output la reference di un oggetto ( indirizzo)
	//originariamentre stampa in nome completo della classe seguito dal nome dell oggetto.
	//se desideriamo che stampi un output predefinito da noi, facciamo l override del 
	//metodo toString e di conseguenza il metodo println stampera' la stringa che e' 
	//stata ritornata dal metodo toString();
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("Video: Titolo: ");
	
		sb.append(titolo)
		.append(" Durata: ").append(durata)
		.append(" Volume: ").append(volume)
		.append(" Luminosita: ").append(luminosita);
		return sb.toString();
	}

	@Override
	public void play() {
		String v = " ";
		for (int i = 0; i < durata; i++) {
			v += titolo + " ";
		}
		for (int i = 0; i < volume; i++) {
			v += "!";
		}
		for (int i = 0; i < luminosita; i++) {
			v += "*";
		}
		System.out.println(v);
	}

	@Override
	public void aumentaLuminosita() {
		if (luminosita < LUMINOSITA_MASSIMA) {
			luminosita++;
		} else {
			System.out.println("La luminosita e' gia' al massimo ");
		}

	}

	@Override
	public void abbassaLuminosita() {
		if (luminosita > 0) {
			luminosita--;
		} else {
			System.out.println("La luminosita e' gia' al minimo ");
		}

	}

	@Override
	public void aumentaVolume() {
		if (volume < VOLUME_MASSIMO) {
			volume++;
		} else {
			System.out.println("Il volume e' gia' al massimo ");
		}
	}

	@Override
	public void abbassaVolume() {
		if (volume > 0) {
			volume--;
		} else {
			System.out.println("Il volume e' gia' al minimo ");
		}

	}

	@Override
	public int getLuminosita() {
		return luminosita;

	}

	@Override
	public int getVolume() {
		return volume;
	}
}
