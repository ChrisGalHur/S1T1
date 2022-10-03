package S1T1N1Ex2;

public class Main {

	public static void main(String[] args) {
		/*- Ejercicio 2
		Crea una clase "Coche" con los atributos: marca, modelo y potencia. La marca debe ser estático final, 
		el modelo estático y la potencia final. Demuestra la diferencia entre los tres. 
		¿Hay alguno que pueda inicializarse al constructor de la clase?
		Añade dos métodos a la clase "Coche". Un método estático llamado frenar() y otro no estático llamado acelerar(). 
		El método acelerar debe mostrar por consola: "El vehículo está acelerando" y el método frenar() debe mostrar: 
		"El vehículo está frenando".

		Demuestra cómo invocar el método estático y el no estático desde el main() de la clase principal.*/
		
		Coche Coche1 = new Coche("Ferrari", "Panda", 105);
		System.out.println("Hemos creado el primer coche intentando crear un Ferrari.");
		System.out.println(Coche1.toString());
		Coche Coche2 = new Coche("Fiat", "Pedro", 200);
		System.out.println("Hemos creado el segundo coche.");
		System.out.println(Coche2.toString());
		
		//Coches en concesionario
		System.out.println("\nAhora en el concesionario hay.");
		System.out.println(Coche1.toString());
		System.out.println(Coche2.toString());
		
		//LLamada a métodos
		System.out.println(Coche.frenar());
		System.out.println("Ha frenado la clase.\n"
				+ "");
		System.out.println(Coche2.frenar());
		System.out.println("Ha frenado el coche " + Coche2.toString() + ".\n"
				+ "");
	}

}
