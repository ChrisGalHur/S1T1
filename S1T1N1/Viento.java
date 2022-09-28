package S1T1N1;

public class Viento extends Instrumento{
	
	//Constructor
	public Viento(String nombre, int precio){
		super (nombre, precio);
	}
	
	//Llamada método abstracto
	public String tocar() {
		return "Se está tocando un instrumento de viento";
	}
}
