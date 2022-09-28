package S1T1N1;

public class S1T1N1 {

	public static void main(String[] args) {
		/*Nivell 1
		- Exercici 1

		En un grup de música hi ha diferents tipus d’instruments musicals. Hi ha instruments de vent, de corda i de percussió.

		Tots els instruments tenen com a atributs el seu nom, i el seu preu. A més, tenen un mètode anomenat tocar().
		Aquest, és abstracte a la classe instrument i, per tant, s’ha d’implementar a les classes filles.
		Si s’està tocant un instrument de vent, el mètode ha de mostrar per consola: "Està sonant un instrument de vent",
		si s’està tocant un instrument de corda: “Està sonant un instrument de corda” i si s’està tocant un instrument de percussió:
		“Està sonant un instrument de percussió”.


		El procés de càrrega d'una classe només té lloc una vegada.
		Demostra que la càrrega pot ser provocada per la creació de la primera instància d'aquesta classe o per l'accés a un membre estàtic d'aquesta. 

		Cerca informació sobre els blocs d'inicialització i blocs estàtics en Java.*/
		
		//Creación de objetos
		Viento instrumentoViento1 = new Viento("Flauta", 20);
		Viento instrumentoViento2 = new Viento("Trombón", 80);
		Cuerda instrumentoCuerda1 = new Cuerda("Guitarra", 60);
		Percusion intrumentoPercusion1 = new Percusion("Tambor", 100);
		Cuerda intrumentoCuerda2 = new Cuerda("Violín", 150);
		
		//Salida
		System.out.println(instrumentoViento1.tocar() + " " + instrumentoViento1.getNombre() + ".");
		System.out.println(instrumentoCuerda1.tocar());
		System.out.println(intrumentoPercusion1.tocar());
		System.out.println();
	}

}
