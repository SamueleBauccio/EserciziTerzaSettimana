package eserciziEnum;

public class DIrezione {
	// final sta per costante
	public static final int NORD = 0;
	public static final int SUD = 0;
	public static final int EST = 0;
	public static final int OVEST = 0;

	// non e' fortemente tipata perch`prende in input un intero e quindi potrebbe
	// essere inserito
	// qualsiasi numero senza che il compilatore lo da come errore
	// per questo si utilizzano gli ENUM ( classe della quale esisteranno solo n oggetti)
	//sono piu' potenti e li posso chiamare anche nei metodi come se fossero oggetti : Direction dir
	//si possono associare 
	public static void move(int dir) {

	}
//	public static void moveBetter(Direction dir) {
//		Direction dir = 
//
//	}
}
