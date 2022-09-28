package S1T1N1;

public class Viento extends Instrumento{
	
	{
		System.out.println("Cojemos un instrumento de viento.");
	}
	
	//Constructor
	public Viento(String nombre, int precio){
		super (nombre, precio);
	}
	
	//Getters
	//public String getNombre() {
//		return this.nombre;
//	}
	
	public int getPrecio() {
		return this.precio;
	}
	
	//Setters
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	//Llamada método abstracto
	public String tocar() {
		return "Se está tocando un instrumento de viento." + this.nombre + ".";
	}
}
