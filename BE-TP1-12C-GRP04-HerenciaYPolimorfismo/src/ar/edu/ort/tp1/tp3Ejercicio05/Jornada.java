package ar.edu.ort.tp1.tp3Ejercicio05;

import java.util.ArrayList;

public class Jornada {

	private ArrayList<Partido> partidos;
	private int fecha;//1,2...n

	public Jornada() {
		partidos = new ArrayList<>();
	}
	
	public Jornada(int fecha) {
		this();
		this.fecha = fecha;
	}
	
	public void agregarPartido(Partido partido) {
		if (!this.partidos.contains(partido)) {
			this.partidos.add(partido);
		}
	}
	
	public void eliminarPartido(Partido partido) {
		if (this.partidos.contains(partido)) {
			this.partidos.remove(partido);
		}
	}
	
	public ArrayList<Partido> getPartidos() {
		return partidos;
	}

	public int getFecha() {
		return fecha;
	}

	public void setFecha(int fecha) {
		this.fecha = fecha;
	}
}
