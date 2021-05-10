package tp1.tp4.ej2;

import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final RangoDeEnteros RANGO_NRO_DOCUMENTO = new RangoDeEnteros(1000000, 99999999);
		final RangoDeEnteros RANGO_ANIO_NACIMIENTO = new RangoDeEnteros(1900, 2021);
		Alumno alu = null;
		int dni = 0, anioNacimiento = 0, anioFallecimiento = 0;
		String nombreCompleto, op;

		while (alu == null) {
			
			try {
				System.out.println("Ingrese nombre completo:");
				nombreCompleto = input.nextLine();
				
				System.out.println("Ingrese DNI:");
				dni = Integer.parseInt(input.nextLine());
				if (!RANGO_NRO_DOCUMENTO.incluye(dni)) {
					throw new RuntimeException("El DNI debe estar entre " + RANGO_NRO_DOCUMENTO.getLimiteInferior() + " y " + RANGO_NRO_DOCUMENTO.getLimiteSuperior());
				}
				
				System.out.println("Ingrese año de nacimiento:");
				anioNacimiento = Integer.parseInt(input.nextLine());
				if (!RANGO_NRO_DOCUMENTO.incluye(dni)) {
					throw new RuntimeException("El año de nacimiento debe estar entre " + RANGO_ANIO_NACIMIENTO.getLimiteInferior() + " y " + RANGO_ANIO_NACIMIENTO.getLimiteSuperior());
				}
				
				System.out.println("la person vive? (S/N)");
				op = input.nextLine();
				if (op.equals("S")) {
					alu = new Alumno(dni, nombreCompleto, anioNacimiento);
				} else if (op.equals("N")) {
					System.out.println("Ingrese año de fallecimiento:");
					anioFallecimiento = Integer.parseInt(input.nextLine());
					alu = new Alumno(dni, nombreCompleto, anioNacimiento, anioFallecimiento);
				} else { 
					throw new RuntimeException("opcion incorrecta");
				}
				
			} catch (RuntimeException e) {
				System.out.println("Error: " + e.getMessage());
			} catch (Exception e) {
				System.out.println("Error: " + e.getMessage());
			} 
		}
		input.close();
		System.out.println(alu.toString());

		if (alu.vive()) {
			System.out.println("La persona vive");
		} else {
			System.out.println("La persona no vive");
		}

	}
}