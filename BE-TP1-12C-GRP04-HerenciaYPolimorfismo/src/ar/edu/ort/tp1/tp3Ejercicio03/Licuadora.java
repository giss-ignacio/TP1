package ar.edu.ort.tp1.tp3Ejercicio03;

public class Licuadora extends Electrodomestico {
	private int potencia;
	private int velocidades;
	
	public Licuadora() {
		super();
	}
	
	public Licuadora(String marca, String modelo, String numeroSerie, int voltaje, boolean encendido,
			double precio, int potencia, int velocidades) {
		
		super(marca, modelo, numeroSerie, voltaje, encendido, precio);
		this.potencia = potencia;
		this.velocidades = velocidades;
	}
	
	@Override
	public String toString() {
		return super.toString() + "Potencia: " + potencia + "watts. Tiene " + velocidades + " velocidades. Precio: " + getPrecio(); 
	}

}
