package tp1.tp4.tj3;

import java.util.Scanner;

public class LectorEnteros {
	private static final String MENSAJE_ERROR_SCANNER_NULL = "Debe recibirse un Scanner.";
	private static final String MENSAJE_CARGA_ENTERO = "Ingrese un numero entero cualquiera";
	private static final String MENSAJE_FUERA_DE_RANGO = "El valor ingresado esta fuera del rango aceptable";
	private static final String MENSAJE_NO_NUMERICO = "El valor ingresado debe ser un numero";

	private Scanner scanner;

	private int cargar(String mensaje) {
		if (mensaje.isEmpty()) {
			System.out.println(MENSAJE_CARGA_ENTERO);
		} else {
			System.out.println(mensaje);
		}
		try {
			return Integer.parseInt(scanner.nextLine());
		} catch (NumberFormatException e) {
			throw new IllegalArgumentException(MENSAJE_NO_NUMERICO);
		}
	}
	
	public LectorEnteros(Scanner scanner) {
		if (scanner == null) {
			throw new IllegalArgumentException(MENSAJE_ERROR_SCANNER_NULL);
		}
		this.scanner = scanner;
	}

	public int pedir(String mensaje) {
		return cargar(mensaje);
	}
	
	public int pedir() {
		return cargar("");
	}

	public int pedir(String mensaje, int limiteA, int limiteB){
		RangoDeEnteros rangoValido = new RangoDeEnteros(limiteA, limiteB);
		return pedir(mensaje, rangoValido);
	}

	public int pedir(String mensaje, RangoDeEnteros rangoValido){
		if (mensaje == null || rangoValido == null) {
			throw new IllegalArgumentException("Los parametros no pueden ser null");
		}
		int numero = cargar(mensaje);
		if (!rangoValido.incluye(numero)) {
			throw new NumberFormatException(MENSAJE_FUERA_DE_RANGO);
		}
		
		return numero;
	}
}
