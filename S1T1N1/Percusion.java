package S1T1N1;

public class Percusion extends Instrumento{
	
	{
		System.out.println("Cojemos un instrumento de percusi�n.");
	}
	
	//Constructor
	public Percusion(String nombre, int precio){
		super (nombre, precio);
	}

	//Llamada m�todo abstracto
	public String tocar() {
		return "Se est� tocando un instrumento de percusi�n.";
	}
}
