package pk.edu.pl.projekt.projekt;


public class Main {
	static Uslugi[] uslugi =
			new Uslugi[100];

			static WykonUslS[] stanowiska =
			new WykonUslS[100];

			static int wykUslugi = 0;
			static TwUslug stwUslugi;
			static void pobUslugi(String uslugaIn, int stanowisko) {
			uslugi[wykUslugi] =
			stwUslugi.pobUsl(uslugaIn);
			stanowiska[wykUslugi++] =
			new WykonUslS(stanowisko);
			}
			public static void main(String[] args) {
			stwUslugi = new TwUslug();
			pobUslugi("konto osobiste1",1);
			pobUslugi("kredyt hipoteczny",3);
			pobUslugi("konto osobiste2",2);
			pobUslugi("kredyt chwilowka",6);
			pobUslugi("lokata",4);

			for (int i = 0; i < wykUslugi; i++) {
			uslugi[i].podUslugi(stanowiska[i]);
			}
			System.out.println(" ");
			System.out.println("Ilosc wykonanych uslug: " +
			stwUslugi.pobIlosciWykUslug());
			}
			}