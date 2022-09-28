package S1T1N1;

public abstract class Instrumento {
	
	static {
		System.out.println("La sala se ha abierto");
	}
	
	//Variables
	String nombre = "";
	int precio = 0;
	
	//Constructor
	public Instrumento(String nombre, int precio) {
		this.nombre = "";
		this.precio = 0;
	}
	
	//Getters
	public String getNombre() {
		return this.nombre;
	}
	
	public int getPrecio() {
		return this.precio;
	}
	
	//Setters
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	//Método abstracto
	public abstract String tocar();
}
