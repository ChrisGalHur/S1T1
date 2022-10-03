package S1T1N1Ex1;

public class Percusion extends Instrumento{
	
//	bloque estatico
	static{
		System.out.println("Los instrumentos de percusión se preparan para tocar.");
	}
	
//	bloque inicialización
	{
		System.out.println("Añadimos un instrumento de percusion a la banda.");
	}
	
	//Constructor
	public Percusion(String nombre, int precio){
		super (nombre, precio);
	}

	//Llamada método abstracto
	public String tocar() {
		return "Se está tocando un instrumento de percusión";
	}
}
