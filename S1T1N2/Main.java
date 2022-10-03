package S1T1N2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*Nivel 2

		- Ejercicio 1
		-Crea una clase llamada "Teléfono" con los atributos marca y modelo, y el método trucar(). Este método tiene que recibir un String con un número de teléfono.
		-El método tiene que mostrar por consola un mensaje diciendo que se está trucando al número recibido por parámetro.
		-Crea una interfaz llamada "Camera" con el método fotografiar(), y otra interfaz llamada Reloj con el método alarma().
		Crea una clase llamada "Smartphone" que sea subclase de "Teléfono" y que a la vegada implemente las interfaces "Camera" y "Reloj".
		-El método fotografiar() tiene que mostrar por consola: “Se está haciendo una foto” y el método alarma() tiene que mostrar: “Está sonando la alarma”.
		-Desde el main() de la aplicación, crea un objeto Smartphone y llama a los métodos anteriores.*/
		
		//Variables
		String numeroLlamar;
		
		//Scanner
		Scanner scan = new Scanner(System.in);
		
		//Creo Smartphone
		Smartphone oneplus = new Smartphone("Oneplus","CHR");
		
		//LLamo a los métodos
		//Método llamar()
		System.out.println("Número de Telefono:");
		numeroLlamar = scan.next();
		System.out.println(oneplus.llamar(numeroLlamar));
		
		//Método fotografiar()
		System.out.println(oneplus.fotografiar());
		
		//Método alarma()
		System.out.println(oneplus.alarma());
			
	}
}
