package tp1.tp4.ej2;

public class Alumno extends Persona {
	public static final RangoDeEnteros RANGO_NRO_DOCUMENTO = new RangoDeEnteros(1000000, 99999999);
	private int numeroLegajo;

	public Alumno(int numeroLegajo, String nombreCompleto, int anioNacimiento) {
		super(nombreCompleto, anioNacimiento);
		this.setNumeroLegajo(numeroLegajo);
	}
	
	public Alumno(int numeroLegajo, String nombreCompleto, int anioNacimiento, int anioFallecimiento) {
		super(nombreCompleto, anioNacimiento, anioFallecimiento);
		this.setNumeroLegajo(numeroLegajo);
	}

	private void setNumeroLegajo(int numeroLegajo) {
		if (RANGO_NRO_DOCUMENTO.incluye(numeroLegajo) ) {
			this.numeroLegajo = numeroLegajo;
		} else {
			throw new IllegalArgumentException("numero de legajo fuera de rango");
		}
		
		
	}
	
	@Override
	public String toString() {
		return super.toString() + ", numero de legajo: " + numeroLegajo;
	}
}
