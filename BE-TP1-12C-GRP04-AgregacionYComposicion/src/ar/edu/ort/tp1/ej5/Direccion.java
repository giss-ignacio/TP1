package ar.edu.ort.tp1.ej5;

public class Direccion {
	private final String calle;
	private final String altura;
	private final String piso;
	private final String departamento;

	public Direccion(String calle, String altura, String piso, String departamento) {
		this.calle = calle;
		this.altura = altura;
		this.piso = piso;
		this.departamento = departamento;
	}
	
	@Override
	public String toString() {
		return calle + " " + altura + " " + piso + "°”" + departamento + "”";
	}

	public boolean coincide(String unPiso, String unDepto) {
		return this.piso.equals(unPiso) && this.departamento.equals(unDepto);
	}
}
