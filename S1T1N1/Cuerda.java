package S1T1N1;

public class Cuerda extends Instrumento{
	
	{
		System.out.println("Cojemos un instrumento de cuerda.");
	}
	
	//Constructor
	public Cuerda(String nombre, int precio){
		super (nombre, precio);
	}

	//Llamada método abstracto
	public String tocar() {
		return "Se está tocando un instrumento de cuerda.";
	}
}
