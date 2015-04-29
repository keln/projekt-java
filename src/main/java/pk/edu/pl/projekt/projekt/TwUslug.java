package pk.edu.pl.projekt.projekt;



public class TwUslug {
	
		Uslugi[] uslugi = new Uslugi[10];

		int ukonUslugi = 0;
		public Uslugi pobUsl(String uslDoPob) {
		if (ukonUslugi > 0) {
		for (int i = 0; i < ukonUslugi; i++) {
		if (uslDoPob.equals((uslugi[i]).pobUslugi())) {
		return uslugi[i];
		}
		}
		}
		uslugi[ukonUslugi] = new Uslugi(uslDoPob);
		return uslugi[ukonUslugi++];
		}
		public int pobIlosciWykUslug() {return ukonUslugi;}
		}