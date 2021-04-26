package ar.edu.ort.tp1.tp3Ejercicio04;

public class Lavarropa extends Electrodomestico {
	private double cargaMaxima;
	private boolean automatico;
	
	public Lavarropa() {
		super();
	}
	
	public Lavarropa(String marca, String modelo, String numeroSerie, int voltaje, boolean encendido,
			double precio, double cargaMaxima, boolean automatico) {
		super(marca, modelo, numeroSerie, voltaje, encendido, precio);
		this.cargaMaxima = cargaMaxima;
		this.automatico = automatico;
	}
	
	@Override
	public String toString() {
		return super.toString() + "Carga Maxima: " + cargaMaxima + "kg. Es automatico: " + automatico + ". Precio:" + getPrecio();
	}
}
