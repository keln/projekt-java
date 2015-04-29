package pk.edu.pl.projekt.projekt;



public class Uslugi extends WykonUslug {


	
	String usluga;
	Uslugi(String usluga) {
	this.usluga = usluga;
	}
	public String pobUslugi() {
	return this.usluga;
	}
	public void podUslugi(WykonUslS wykonUslS) {

	System.out.println("Zakładanie " +
	usluga +
	" na stanowisku numer " +
	wykonUslS.pobStan());
	}
	}