package ar.edu.ort.tp1.ej5;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		
		
		Vivienda vivienda1 = new Vivienda(new Direccion("Montañeses", "1234", "4", "C"));
		
		Persona arturo = new Persona("Roman", "Arturo", 53);
		Persona monica = new Persona("Gaztambide", "Mónica", 35);
		
		vivienda1.agregarPersona(arturo);
		vivienda1.agregarPersona(monica);
		
		Mueble mesa = new Mueble("Mesa", "Madera", "Marron");
		Mueble mesada = new Mueble("Mesada", "Marmol", "Rojo");
		Mueble perchero = new Mueble("Perchero", "Metal", "Negro");
		Mueble sillon = new Mueble("Sillon", "Cuero", "Azul");
		
		vivienda1.agregarMueble(mesa);
		vivienda1.agregarMueble(mesada);
		vivienda1.agregarMueble(perchero);
		vivienda1.agregarMueble(sillon);
		
		Vivienda vivienda2 = new Vivienda(new Direccion("Montañeses", "1234", "2", "B"));
		
		ArrayList<Vivienda> viviendas = new ArrayList<>();
		viviendas.add(vivienda1);
		viviendas.add(vivienda2);
		Edificio edificio = new Edificio(viviendas);
		
		edificio.mostrarTodo();
		
		edificio.realizarMudanza("4", "C", "2", "B");
		
		edificio.mostrarTodo();

	}

}

