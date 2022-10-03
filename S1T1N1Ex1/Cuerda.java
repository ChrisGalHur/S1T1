package S1T1N1Ex1;

public class Cuerda extends Instrumento{
	
//	bloque estatico
	static{
		System.out.println("Los instrumentos de cuerda se preparan para tocar.");
	}
	
//	bloque inicialización
	{
		System.out.println("Añadimos un instrumento de cuerda a la banda.");
	}
	
	//Constructor
	public Cuerda(String nombre, int precio){
		super (nombre, precio);
	}

	//Llamada método abstracto
	public String tocar() {
		return "Se está tocando un instrumento de cuerda";
	}
}
