package ar.edu.ort.tp1.ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Carrera {
	private final double MAX_TIEMPO = 10000000.0D;
	private List<Corredor> corredores;

	public Carrera() {
		corredores = new ArrayList<>();
	}

	public void agregarCorredor(Corredor corredor) {
		corredores.add(corredor);
	}
	
	public List<Corredor> obtenerPrimerPuesto() {
		return obtenerMejoresCorredores(this.corredores);
	}
	
	private List<Corredor> obtenerMejoresCorredores(List<Corredor> competidores) {
		Double mejorTiempo = MAX_TIEMPO;
		List<Corredor> mejores = new ArrayList<>();
		for (Corredor corredor : competidores) {
			if (corredor.esGanador(mejorTiempo)) {
				mejorTiempo = corredor.getTiempo();
				mejores.clear();
				mejores.add(corredor);
			} else if (corredor.esEmpate(mejorTiempo)) {
				mejores.add(corredor);
			}	
		}
		return mejores;
	}
}
