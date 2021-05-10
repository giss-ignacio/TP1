package tp1.tp4.tj3;

import java.time.Year;
import java.util.Scanner;

public class Ej3 {
	public static void main(String[] args) {
		int nacimiento = 0;
		int fallecimiento = 0;
		Scanner input = new Scanner(System.in);
		// TODO implementar
		LectorEnteros lector = new LectorEnteros(input);
		try {
			int num1 = lector.pedir();
			System.out.println("El numero ingresado es: " + num1);
		} catch (IllegalArgumentException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		try {
			nacimiento = lector.pedir("Ingrese la fecha de nacimiento (desde 1900 hasta hoy): ");
			System.out.println("El numero ingresado es: " + nacimiento);
		} catch (IllegalArgumentException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		try {
			fallecimiento = lector.pedir("Ingrese la fecha de fallecimiento (desde la fecha de nacimiento hasta hoy, ó -1 si la persona aún vive): ");
			System.out.println("El numero ingresado es: " + fallecimiento);
		} catch (IllegalArgumentException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		int anioActual = Year.now().getValue();
		int edad = 0;
		if (fallecimiento == -1) {
			edad = anioActual - nacimiento;
		} else {
			edad = fallecimiento - nacimiento;
		}
		
		
		System.out.println("La edad de la persona es: " + edad);
		
		if (fallecimiento == -1) {
			System.out.println("La persona vive");
		} else {
			System.out.println("La persona no vive");
		}
		
		input.close();
	}
}
