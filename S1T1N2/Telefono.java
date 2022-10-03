package S1T1N2;

public class Telefono {
	
	//Atributos
	private String marca;
	private String modelo;
	
	//Constructor
	public Telefono(String marca, String modelo) {
		super();
		this.marca = marca;
		this.modelo = modelo;
	}
	
	//Getters
	public String getMarca() {
		return marca;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	//Setters
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	//Métodos
	public String llamar(String numeroLlamar) {
		return "Se está llamando a " + numeroLlamar + ".";
	}
	
}
