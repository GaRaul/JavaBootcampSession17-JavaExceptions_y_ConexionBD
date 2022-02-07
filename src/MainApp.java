
public class MainApp {

	public static void main(String[] args) {
		// Escribe un programa, utilizando para ello el paradigma de POO, que juegue
//		con el usuario a adivinar un n�mero. Debe cumplir los siguientes
//		requerimientos:
//		1. El ordenador debe generar un n�mero entre 1 y 500, y el usuario tiene
//		que intentar adivinarlo.
//		2. Cada vez que el usuario introduce un valor, el ordenador debe decirle al
//		usuario si el n�mero que tiene que adivinar es mayor o menor que el que
//		ha introducido el usuario.
//		3. Cuando consiga adivinarlo, debe indic�rselo e imprimir en pantalla el
//		n�mero de veces que el usuario ha intentado adivinar el n�mero.
//		4. Si el usuario introduce algo que no es un n�mero, debe indicarlo en
//		pantalla, y contarlo como un intento indicando que no ha conseguido
//		reconocer la entrada lanzando la excepci�n InputMismatchException.

		Ordenador ordenador = new Ordenador();
		
		ordenador.empezarJuego();
		
	}

}
