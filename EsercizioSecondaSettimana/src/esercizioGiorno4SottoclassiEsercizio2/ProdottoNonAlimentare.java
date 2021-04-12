package esercizioGiorno4SottoclassiEsercizio2;

public class ProdottoNonAlimentare extends Prodotto {
	private CategorieMerceologica categorieMerceologica;

	public ProdottoNonAlimentare(int codiceUnivoco, String descizione, double costo,
			CategorieMerceologica categorieMerceologica) {

		super(codiceUnivoco, descizione, costo);
		this.categorieMerceologica = categorieMerceologica;

	}

	public CategorieMerceologica getCategorieMerceologica() {
		return categorieMerceologica;
	}
}
