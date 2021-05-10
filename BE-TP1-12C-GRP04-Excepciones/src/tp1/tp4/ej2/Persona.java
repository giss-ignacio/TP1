package tp1.tp4.ej2;

import java.time.Year;

public class Persona {
	private String nombreCompleto;
	private int anioNacimiento;
	private int anioFallecimiento;
	private int anioActual;
	
	private static int VALOR_AUN_VIVE = -999;
	
	public Persona(String nombreCompleto, int anioNacimiento) {
		setAnioActual();
		this.anioFallecimiento = VALOR_AUN_VIVE;
		this.setNombreCompleto(nombreCompleto);
		this.setAnioNacimiento(anioNacimiento);
	}
	
	public Persona(String nombreCompleto, int anioNacimiento, int anioFallecimiento) {
		this(nombreCompleto, anioNacimiento);
		this.anioFallecimiento = anioFallecimiento;
	}
	
	public boolean vive() {
		return this.anioFallecimiento == VALOR_AUN_VIVE;
	}

	public String getNombreCompleto() {
		return nombreCompleto;
	}

	private void setNombreCompleto(String nombreCompleto) {
		if (nombreCompleto == null || nombreCompleto.isEmpty()) {
			throw new IllegalArgumentException("El nombre completo es vacio o null");
		}
		this.nombreCompleto = nombreCompleto;
	}

	public int getAnioNacimiento() {
		return anioNacimiento;
	}

	private void setAnioNacimiento(int anioNacimiento) {
		if (anioNacimiento > getAnioActual()) {
			throw new IllegalArgumentException("El año de nacimiento es mayor al año actual");
		}
		this.anioNacimiento = anioNacimiento;
	}

	public int getAnioFallecimiento() {
		return anioFallecimiento;
	}

	public void setAnioFallecimiento(int anioFallecimiento) {
		if (anioFallecimiento != VALOR_AUN_VIVE) {
			
			if (anioFallecimiento > getAnioActual()) {
				throw new IllegalArgumentException("El año de fallecimiento es mayor al año actual");
				
			} else if (anioNacimiento > anioFallecimiento) {
				throw new IllegalArgumentException("El año de nacimiento es posterior al año de fallecimiento");
			}
			
		}

		this.anioFallecimiento = anioFallecimiento;
	}

	public int getAnioActual() {
		return anioActual;
	}

	private void setAnioActual() {
		this.anioActual = Year.now().getValue();
	}

	@Override
	public String toString() {
		String msj = "Persona [nombre completo:" + nombreCompleto + ", anio de nacimiento:" + anioNacimiento;
		if (!vive()) {
			msj += ", anioFallecimiento:" + anioFallecimiento;
		}
		
		return msj + "]";
	}
	
}
