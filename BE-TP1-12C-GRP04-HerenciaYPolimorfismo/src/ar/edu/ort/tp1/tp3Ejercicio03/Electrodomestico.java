package ar.edu.ort.tp1.tp3Ejercicio03;

public class Electrodomestico {
	private String marca;
	private String modelo;
	private String numeroSerie;
	private int voltaje;
	private boolean encendido;
	private double precio;
	
	public Electrodomestico() {
		this.marca = "";
		this.modelo = "";
		this.numeroSerie = "";
		this.voltaje = 0;
		this.encendido = false;
		this.precio = 0;
	}
	
	public Electrodomestico(String marca, String modelo, String numeroSerie, int voltaje, boolean encendido,
			double precio) {
		this();
		this.marca = marca;
		this.modelo = modelo;
		this.numeroSerie = numeroSerie;
		this.voltaje = voltaje;
		this.encendido = encendido;
		this.precio = precio;
	}

	public String toSimpleString() {
		return this.getClass().getSimpleName() + "[marca=" + marca + ", modelo=" + modelo + "] ";
	}
	
	@Override
	public String toString() {
		return toSimpleString();
	}

	public double getPrecio() {
		return this.precio;
	}
}
