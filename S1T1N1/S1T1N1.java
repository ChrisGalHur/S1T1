package S1T1N1;

public class S1T1N1 {

	public static void main(String[] args) {
		/*Nivell 1
		- Exercici 1

		En un grup de m�sica hi ha diferents tipus d�instruments musicals. Hi ha instruments de vent, de corda i de percussi�.

		Tots els instruments tenen com a atributs el seu nom, i el seu preu. A m�s, tenen un m�tode anomenat tocar().
		Aquest, �s abstracte a la classe instrument i, per tant, s�ha d�implementar a les classes filles.
		Si s�est� tocant un instrument de vent, el m�tode ha de mostrar per consola: "Est� sonant un instrument de vent",
		si s�est� tocant un instrument de corda: �Est� sonant un instrument de corda� i si s�est� tocant un instrument de percussi�:
		�Est� sonant un instrument de percussi�.


		El proc�s de c�rrega d'una classe nom�s t� lloc una vegada.
		Demostra que la c�rrega pot ser provocada per la creaci� de la primera inst�ncia d'aquesta classe o per l'acc�s a un membre est�tic d'aquesta. 

		Cerca informaci� sobre els blocs d'inicialitzaci� i blocs est�tics en Java.*/
		
		//Creaci�n de objetos
		Viento instrumentoViento1 = new Viento("Flauta", 20);
		Viento instrumentoViento2 = new Viento("Tromb�n", 80);
		Cuerda instrumentoCuerda1 = new Cuerda("Guitarra", 60);
		Percusion intrumentoPercusion1 = new Percusion("Tambor", 100);
		Cuerda intrumentoCuerda2 = new Cuerda("Viol�n", 150);
		
		//Salida
		System.out.println(instrumentoViento1.tocar() + " " + instrumentoViento1.getNombre() + ".");
		System.out.println(instrumentoCuerda1.tocar());
		System.out.println(intrumentoPercusion1.tocar());
		System.out.println();
	}

}
