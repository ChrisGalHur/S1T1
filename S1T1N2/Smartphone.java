package S1T1N2;

public class Smartphone extends Telefono implements Camara, Reloj{

	//Constructor
	public Smartphone(String marca, String modelo) {
		super(marca, modelo);
	}

	public String fotografiar() {
		return "Se est� haciendo una foto.";
	}

	public String alarma() {
		return "Est� sonando la alarma.";
	}
		
		
	}