package S1T1N1Ex1;

public class Viento extends Instrumento{
	
//	bloque estatico
	static{
		System.out.println("Los instrumentos de viento se preparan para tocar.");
	}
	
//	bloque inicializaci�n
	{
		System.out.println("A�adimos un instrumento de viendo a la banda.");
	}
	
	//Constructor
	public Viento(String nombre, int precio){
		super (nombre, precio);
	}
	
	//Llamada m�todo abstracto
	public String tocar() {
		return "Se est� tocando un instrumento de viento";
	}
}
