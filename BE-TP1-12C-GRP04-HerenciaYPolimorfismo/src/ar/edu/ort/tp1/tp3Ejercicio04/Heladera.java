package ar.edu.ort.tp1.tp3Ejercicio04;

public class Heladera extends Electrodomestico{
	private double capacidad;
	private boolean frost;
	
	
	public Heladera(String marca, String modelo, String numeroSerie, int voltaje, boolean encendido, double precio, double capacidad, boolean frost) {
		super(marca, modelo, numeroSerie, voltaje, encendido, precio);
		this.capacidad = capacidad;
		this.frost = frost;
	}

	@Override
	public String toString() {
		return super.toString() + "Capacidad: " + capacidad + "litros. Tiene frost: " + frost + ". Precio: " + getPrecio(); 
	}
}
