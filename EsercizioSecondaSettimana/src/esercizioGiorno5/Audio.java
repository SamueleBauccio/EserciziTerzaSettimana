package esercizioGiorno5;

public class Audio extends ElementoMultimedialeRiproducibile implements ElementoConVolumeRegolabile {

	public Audio(String titolo, int durata, int volume) {
		super(titolo, durata, volume);

	}

	@Override
	public String toString() {
		StringBuilder aud = new StringBuilder("Audio: Titolo: ");
				aud.append(titolo)
				.append(" Durata: ").append(durata)
				.append(" Volume: ").append(volume);
		return aud.toString();
	}

	@Override
	public void play() {
		String d = " ";
		for (int i = 0; i < durata; i++) {
			d += titolo + " ";
		}
		for (int i = 0; i < volume; i++) {
			d += "!";
		}
		System.out.println(d);
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
	public void aumentaVolume() {
		if (volume < VOLUME_MASSIMO) {
			volume++;
		} else {
			System.out.println("Il volume e' gia' al massimo ");
		}
	}

	@Override
	public int getVolume() {
		return volume;
	}

}
