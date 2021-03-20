package ar.edu.ort.tp1.ejercicio1;

public class Test {

	public static void main(String[] args) {
		Grupo grupo1 = new Grupo("TP1-C-Grupo-1");
		
		testearGrupo(grupo1);
		
	}
	
	private static void testearGrupo(Grupo grupo) {
		testAgregar("Pedro Nieto", grupo);
		
		testAgregar("Nacho Koch", grupo);
		
		testAgregar("Joaco Hertzulis", grupo);
		
		testAgregar("Nacho Giss", grupo);
		
		testAgregar("Cosme Fulanito", grupo);
		
		testComprobarIntegrante("Nacho Giss", grupo);
		
		testComprobarIntegrante("Beto Cesar", grupo);
		
		grupo.mostrar();
		
		testRemover("Cosme Fulanito", grupo);
		
		testRemover("Cosme Fulanito", grupo);
		
		grupo.mostrar();
		
		grupo.vaciar();
		
		grupo.mostrar();
	}
	
	private static void testAgregar(String integrante, Grupo grupo) {
		grupo.agregarIntegrante(integrante);
		System.out.println(integrante + " fue asignado al grupo " + grupo.getNombre());
	}
	
	private static void testComprobarIntegrante(String integrante, Grupo grupo) {
		if (grupo.buscarIntegrante(integrante) == null) {
			System.out.println(integrante + " no se encuentra en el grupo " + grupo.getNombre());
		} else {
			System.out.println(integrante + " se encuentra en el grupo " + grupo.getNombre());
		}
	}
	
	private static void testRemover(String integrante, Grupo grupo) {
		String integranteRemovido = grupo.removerIntegrante("Cosme Fulanito");
		if (integranteRemovido != null) {
			System.out.println(integranteRemovido + " fue removido del grupo " + grupo.getNombre());
		} else {
			System.out.println("No se pude remover al integrante " + integrante + " del grupo " + grupo.getNombre());
		}
		
	}
}
