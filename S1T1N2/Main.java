package S1T1N2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*Nivel 2

		- Ejercicio 1
		-Crea una clase llamada "Tel�fono" con los atributos marca y modelo, y el m�todo trucar(). Este m�todo tiene que recibir un String con un n�mero de tel�fono.
		-El m�todo tiene que mostrar por consola un mensaje diciendo que se est� trucando al n�mero recibido por par�metro.
		-Crea una interfaz llamada "Camera" con el m�todo fotografiar(), y otra interfaz llamada Reloj con el m�todo alarma().
		Crea una clase llamada "Smartphone" que sea subclase de "Tel�fono" y que a la vegada implemente las interfaces "Camera" y "Reloj".
		-El m�todo fotografiar() tiene que mostrar por consola: �Se est� haciendo una foto� y el m�todo alarma() tiene que mostrar: �Est� sonando la alarma�.
		-Desde el main() de la aplicaci�n, crea un objeto Smartphone y llama a los m�todos anteriores.*/
		
		//Variables
		String numeroLlamar;
		
		//Scanner
		Scanner scan = new Scanner(System.in);
		
		//Creo Smartphone
		Smartphone oneplus = new Smartphone("Oneplus","CHR");
		
		//LLamo a los m�todos
		//M�todo llamar()
		System.out.println("N�mero de Telefono:");
		numeroLlamar = scan.next();
		System.out.println(oneplus.llamar(numeroLlamar));
		
		//M�todo fotografiar()
		System.out.println(oneplus.fotografiar());
		
		//M�todo alarma()
		System.out.println(oneplus.alarma());
			
	}
}
