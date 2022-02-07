import java.util.InputMismatchException;
import java.util.Scanner;

public class Ordenador {

	static Scanner teclado = new Scanner(System.in);
	static int intentosRestantes = 5;
	static int intentosHechos = 0;
	static int numero = generarNumero();

	public static int generarNumero() {
		// El ordenador debe generar un número entre 1 y 500
		int numero = (int) (Math.random() * 499) + 1;
		return numero;
	}

	public void empezarJuego() {
		int numeroIntento;

		System.out.println(numero);
		
		do {
			try {
				
				System.out.println("Introduce un numero del 1 al 500 - INTENTOS: " + intentosRestantes);
				numeroIntento = teclado.nextInt();
				intentosHechos++;
				
				comprobarNumero(numeroIntento);
				
			} catch (InputMismatchException e) {
				System.out.println("Valor introducido no reconocido, has perdido 1 intento.");
				intentosHechos++;
				intentosRestantes--;
			}
			
		} while (intentosRestantes > 0);
		
		System.out.println("Te has quedado sin intentos :(");
	}

	public static void comprobarNumero(int numeroIntento) {

		if (numero == numeroIntento) {
			System.out.println("Felicidades, has acertado el numero!!\nHas hecho " + intentosHechos + " intentos.");
			System.exit(0); // Cuando el usuario adivina el numero el programa acaba.
			
		} else if (numero > numeroIntento){
			System.out.println("Incorrecto, el numero es mayor a " + numeroIntento + ", has perdido 1 intento.");
			intentosRestantes--;
			
		} else if (numero < numeroIntento){
			System.out.println("Incorrecto, el numero es menor a " + numeroIntento + ", has perdido 1 intento.");
			intentosRestantes--;
			
		}

	}

}
