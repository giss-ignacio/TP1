package ar.edu.ort.tp1.ej4;

import java.util.Date;

public class Test {

	public static void main(String[] args) {
		Vivienda vivienda = new Vivienda(new Direccion("Montañeses", "1234", "4", "C"));
		
		Persona arturo = new Persona("Roman", "Arturo", 53);
		Persona monica = new Persona("Gaztambide", "Mónica", 35);
		
		vivienda.agregarPersona(arturo);
		vivienda.agregarPersona(monica);
		
		Mueble mesa = new Mueble("Mesa", "Madera", "Marron");
		Mueble mesada = new Mueble("Mesada", "Marmol", "Rojo");
		Mueble perchero = new Mueble("Perchero", "Metal", "Negro");
		Mueble sillon = new Mueble("Sillon", "Cuero", "Azul");
		
		vivienda.agregarMueble(mesa);
		vivienda.agregarMueble(mesada);
		vivienda.agregarMueble(perchero);
		vivienda.agregarMueble(sillon);
		
		testearVivienda(vivienda, 1);

	}
	
	/**
	 * Ejemplo:
	 * Vivienda 1: Direccion: Montañeses
	 * 1234 4°”C” Personas: Nombre:
	 * Arturo Roman, Edad: 53 Nombre:
	 * Mónica Gaztambide, Edad: 35
	 * Muebles: Mesa de Madera color
	 * Marrón. Mesada de Mármol color
	 * Rojo Perchero de Metal color
	 * Negro Sillón de Cuero color Azul
	 */
	private static void testearVivienda(Vivienda vivienda, int numero) {
		System.out.printf("Vivienda %d: Direccion: %s \n Personas: ", numero, vivienda.getDireccion().toString());
		
		for (Persona persona : vivienda.getPersonas()) {
			System.out.printf("Nombre: %s, Edad: %d\n", persona.getNombreYApellido(), persona.getEdad());
		}
		
		System.out.print("Muebles: ");
		for (Mueble mueble : vivienda.getMuebles()) {
			System.out.printf("%s de %s color %s\n", mueble.getNombre(), mueble.getMaterial(), mueble.getColor());
		}
	}
}

