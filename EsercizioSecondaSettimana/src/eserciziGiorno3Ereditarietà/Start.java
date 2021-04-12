package eserciziGiorno3Ereditariet�;

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
//			//In realt� il compilatore lo fa in automatico perci� non sar� necesario specificare la parte (ContoCorrente)
//			cg2.bonifica(10, (ContoCorrente)cg); // <-- QUESTO � UN POLIMORFISMO
			//L'UPCASTING automatico sar� sempre possibile tra tipi simili a condizione che si faccia dal "pi� piccolo" verso il "pi� grande"
			//Esempio: un int sar� sempre possibile CASTARLO in un long il contrario non avviene implicitamente
			//Lo si pu� esplicitare:
			
			int x = 10;
			long y = 10;
			
			//FORZIOAMO il CAST con un NARROWING CAST ovvero restringiamo il tipo per farlo diventare uno pi� piccolo
			x = (int)y;
			//FORZIOAMO il CAST con un WIDENING CAST - in questo caso non � necessario specificare il cast, avverrebbe implicitamente
			y = (long)x;
			
			//E' impossibile fare un DOWNCASTiNG in quanto c essendo un ContoCorrente NON ha un codicee segreto
			//boolean result = cg2.confrontaCodiciSegreti(c);
			
			//L'UPCASTING � sempre permesso in maniera automatica in quanto "sicuro" non ci saranno maiperdita didati
			//IL DOWNCASTING invece "NON � sicuro", potrebbe comportare perdita di dati
		//	ContoCorrente x1 = new ContoCorrenteGold(1000, "password"); //Effettua UPCASTING, ed � concesso (E' ANCHE UN POLIMORFISMO)
			//ContoCorrenteGold x2 = new ContoCorrente(1000); //Sarebbe un DOWNCASTING ma non � concesso
		}


}
