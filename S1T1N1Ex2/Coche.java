package S1T1N1Ex2;

public class Coche {
	
	public static String frenar() {
		return "El vehículo está frenando.";
	}
	
	public String acelerar() {
		return "El vehículo está acelerando.";
	}

	private static final String marca = "Fiat";
	private static String modelo;
	private final int potencia;
	
	//Constructor
	public Coche(String martca, String modelo, int potencia) {
		this.modelo = modelo;
		this.potencia = potencia;
	}

	//Getters
	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public int getPotencia() {
		return potencia;
	}

	//Setters
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	//Métodos
	
	@Override
	public String toString() {
		return getMarca() + " " + getModelo() + " " + getPotencia();
	}
}
