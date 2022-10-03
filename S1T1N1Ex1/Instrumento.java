package S1T1N1Ex1;

public abstract class Instrumento {
	
	static{
		System.out.println("La sala se ha abierto");
	}
	
	//Variables
	private String nombre;
	private int precio;
	
	//Constructor
	public Instrumento(String nombre, int precio) {
		this.nombre = nombre;
		this.precio = precio;
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
