package S1T1N1Ex2;

public class Main {

	public static void main(String[] args) {
		/*- Ejercicio 2
		Crea una clase "Coche" con los atributos: marca, modelo y potencia. La marca debe ser est�tico final, 
		el modelo est�tico y la potencia final. Demuestra la diferencia entre los tres. 
		�Hay alguno que pueda inicializarse al constructor de la clase?
		A�ade dos m�todos a la clase "Coche". Un m�todo est�tico llamado frenar() y otro no est�tico llamado acelerar(). 
		El m�todo acelerar debe mostrar por consola: "El veh�culo est� acelerando" y el m�todo frenar() debe mostrar: 
		"El veh�culo est� frenando".

		Demuestra c�mo invocar el m�todo est�tico y el no est�tico desde el main() de la clase principal.*/
		
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
		
		//LLamada a m�todos
		System.out.println(Coche.frenar());
		System.out.println("Ha frenado la clase.\n"
				+ "");
		System.out.println(Coche2.frenar());
		System.out.println("Ha frenado el coche " + Coche2.toString() + ".\n"
				+ "");
	}

}
