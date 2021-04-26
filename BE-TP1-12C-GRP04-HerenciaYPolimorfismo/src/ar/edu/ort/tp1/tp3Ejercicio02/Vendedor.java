package ar.edu.ort.tp1.tp3Ejercicio02;

public class Vendedor extends SubContratado {
	private float porcentaje;

	public Vendedor(String nombre, int edad, float cantHoras, float precioHora, float porcentaje) {
		super(nombre, edad, cantHoras, precioHora);
		this.porcentaje = porcentaje;
	}

	@Override
	public float calcularPago() {
		float base = super.calcularPago();
		return base + base * (porcentaje / 100);
	}
	
	@Override
	public String toString() {
		return this.getNombre() + " gana: " + calcularPago();
	}
}
