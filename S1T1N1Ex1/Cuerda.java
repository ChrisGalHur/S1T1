package S1T1N1Ex1;

public class Cuerda extends Instrumento{
	
//	bloque estatico
	static{
		System.out.println("Los instrumentos de cuerda se preparan para tocar.");
	}
	
//	bloque inicializaci�n
	{
		System.out.println("A�adimos un instrumento de cuerda a la banda.");
	}
	
	//Constructor
	public Cuerda(String nombre, int precio){
		super (nombre, precio);
	}

	//Llamada m�todo abstracto
	public String tocar() {
		return "Se est� tocando un instrumento de cuerda";
	}
}
