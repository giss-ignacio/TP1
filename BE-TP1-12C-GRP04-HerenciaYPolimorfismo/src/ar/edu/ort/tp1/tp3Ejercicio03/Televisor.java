package ar.edu.ort.tp1.tp3Ejercicio03;

public class Televisor extends Electrodomestico {
	private double dimension;
	private boolean smart;
	
	public Televisor() {
		super();
	}
	
	public Televisor(String marca, String modelo, String numeroSerie, int voltaje, boolean encendido,
			double precio, double dimension, boolean smart) {
		super(marca, modelo, numeroSerie, voltaje, encendido, precio);
		this.dimension = dimension;
		this.smart = smart;
	}

	@Override
	public String toString() {
		return super.toString() + "Dimension: " + dimension + " pulgadas. Smart: " + smart + ". Precio:" + getPrecio();
	}
	
	

}
