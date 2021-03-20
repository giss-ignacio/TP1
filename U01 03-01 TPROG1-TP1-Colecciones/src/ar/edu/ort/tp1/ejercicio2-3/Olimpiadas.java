package ar.edu.ort.tp1.ejercicio2_3;

public class Olimpiadas {

	public static void main(String[] args) {

		Carrera carrera = new Carrera();
		carrera.agregarCorredor(new Corredor("jose", 120.0D));
		carrera.agregarCorredor(new Corredor("luis", 120.0D));
		carrera.agregarCorredor(new Corredor("lucas", 122.4D));
		carrera.agregarCorredor(new Corredor("juan", 126.4D));
		carrera.agregarCorredor(new Corredor("jorge", 136.4D));
		
		System.out.println("Primer puesto:");
		for (Corredor corredor : carrera.obtenerPrimerPuesto()) {
			System.out.println("  " + corredor.getNombre());
		}
		
		System.out.println("Segundo puesto:");
		for (Corredor corredor : carrera.obtenerSegundoPuesto()) {
			System.out.println("  " + corredor.getNombre());
		}
		
		System.out.println("Tercer puesto:");
		for (Corredor corredor : carrera.obtenerTercerPuesto()) {
			System.out.println("  " + corredor.getNombre());
		}
		
	}

}
