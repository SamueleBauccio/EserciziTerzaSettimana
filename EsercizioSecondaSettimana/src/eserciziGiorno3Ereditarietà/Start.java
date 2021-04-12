package eserciziGiorno3Ereditarietà;

	public class Start {

		public static void main(String[] args) {
			
			//ContoCorrente c = new ContoCorrente(1000);
			ContoCorrenteGold cg = new ContoCorrenteGold(2000, "passwordsegreta");
					
			double nuovoSaldo = cg.deposita(1000);
			System.out.println(nuovoSaldo);
//			nuovoSaldo = cg.bonifica(500, c);
//			System.out.println(nuovoSaldo);
//			
//			ContoCorrenteGold cg2 = new ContoCorrenteGold(5000, "nessunolosa");
//			nuovoSaldo = cg.bonifica(1000, cg2);
//			System.out.println(nuovoSaldo);
//			
//			//UPCASTIG da ContoCorrenteGold a ContoCorrente.
//			//In realtà il compilatore lo fa in automatico perciò non sarà necesario specificare la parte (ContoCorrente)
//			cg2.bonifica(10, (ContoCorrente)cg); // <-- QUESTO è UN POLIMORFISMO
			//L'UPCASTING automatico sarà sempre possibile tra tipi simili a condizione che si faccia dal "più piccolo" verso il "più grande"
			//Esempio: un int sarà sempre possibile CASTARLO in un long il contrario non avviene implicitamente
			//Lo si può esplicitare:
			
			int x = 10;
			long y = 10;
			
			//FORZIOAMO il CAST con un NARROWING CAST ovvero restringiamo il tipo per farlo diventare uno più piccolo
			x = (int)y;
			//FORZIOAMO il CAST con un WIDENING CAST - in questo caso non è necessario specificare il cast, avverrebbe implicitamente
			y = (long)x;
			
			//E' impossibile fare un DOWNCASTiNG in quanto c essendo un ContoCorrente NON ha un codicee segreto
			//boolean result = cg2.confrontaCodiciSegreti(c);
			
			//L'UPCASTING è sempre permesso in maniera automatica in quanto "sicuro" non ci saranno maiperdita didati
			//IL DOWNCASTING invece "NON è sicuro", potrebbe comportare perdita di dati
		//	ContoCorrente x1 = new ContoCorrenteGold(1000, "password"); //Effettua UPCASTING, ed è concesso (E' ANCHE UN POLIMORFISMO)
			//ContoCorrenteGold x2 = new ContoCorrente(1000); //Sarebbe un DOWNCASTING ma non è concesso
		}


}
