package S1T1N1;

public class Cuerda extends Instrumento{
	//Constructor
	public Cuerda(String nombre, int precio){
		super (nombre, precio);
	}

	//Llamada m�todo abstracto
	public String tocar() {
		return "Se est� tocando un instrumento de cuerda";
	}
}
