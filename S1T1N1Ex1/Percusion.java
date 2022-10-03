package S1T1N1Ex1;

public class Percusion extends Instrumento{
	
//	bloque estatico
	static{
		System.out.println("Los instrumentos de percusi�n se preparan para tocar.");
	}
	
//	bloque inicializaci�n
	{
		System.out.println("A�adimos un instrumento de percusion a la banda.");
	}
	
	//Constructor
	public Percusion(String nombre, int precio){
		super (nombre, precio);
	}

	//Llamada m�todo abstracto
	public String tocar() {
		return "Se est� tocando un instrumento de percusi�n";
	}
}
