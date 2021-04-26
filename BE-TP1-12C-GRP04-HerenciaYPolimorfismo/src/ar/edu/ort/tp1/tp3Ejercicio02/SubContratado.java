package ar.edu.ort.tp1.tp3Ejercicio02;

public class SubContratado extends Empleado {
	private float cantHoras;
	private float precioHora;

	public SubContratado(String nombre, int edad, float cantHoras, float precioHora) {
		super(nombre, edad);
		this.cantHoras = cantHoras;
		this.precioHora = precioHora;
	}

	@Override
	public float calcularPago() {
		return cantHoras * precioHora;
	}
	
	@Override
	public String toString() {
		return super.toString() + " gana: " + calcularPago();
	}
	
	public float getCantHoras() {
		return cantHoras;
	}
	
	public float getPrecioHora() {
		return precioHora;
	}
}
