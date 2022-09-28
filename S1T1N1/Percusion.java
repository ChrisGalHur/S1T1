package S1T1N1;

public class Percusion extends Instrumento{
	//Constructor
	public Percusion(String nombre, int precio){
		super (nombre, precio);
	}

	//Llamada método abstracto
	public String tocar() {
		return "Se está tocando un instrumento de percusión";
	}
}
