package esercizioGiorno5;

public class Immagine extends ElementoMultimediale implements ElementoConLuminositaRegolabile {

	private int luminosita;

	public Immagine(String titolo, int luminosita) {
		super(titolo);
		this.luminosita = luminosita;
	}

	public void show() {
		String s = titolo + " ";
		for (int i = 0; i < luminosita; i++) {
			s += "*";
		}
		System.out.println(s);
	}

	@Override
	public String toString() {
		StringBuilder imm = new StringBuilder("Immagine: Titolo: ");
		imm.append(titolo).append(" Luminosita: ").append(luminosita);
		return imm.toString();
	}

	@Override
	public void aumentaLuminosita() {
		if (luminosita < LUMINOSITA_MASSIMA) {
			luminosita++;
		} else {
			System.out.println("Hai raggiunto la luminosita massima. ");
		}

	}

	@Override
	public void abbassaLuminosita() {
		if (luminosita > 0) {
			luminosita--;
		} else {
			System.out.println("Hai raggiunto la luminosita minima. ");
		}

	}

	@Override
	public int getLuminosita() {
		return luminosita;

	}

	@Override
	public void esegui() {
		show();
	}

}
