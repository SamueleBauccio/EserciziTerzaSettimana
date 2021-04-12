package esercizioGiorno5;

// interfaccia di video e audio 
public interface ElementoConVolumeRegolabile {
	final int VOLUME_MASSIMO=10;

	void abbassaVolume();

	void aumentaVolume();
	
	int getVolume();

}