package ar.edu.ort.tp1.ej1;

public class NumeroTelefonico {
	private String caracteristica;
	private String numeroDeAbonado;
	private String codigoDePais;
	private TipoDeLinea tipoDeLinea;
	
	public NumeroTelefonico(String caracteristica, String numeroDeAbonado, String codigoDePais, TipoDeLinea tipoDeLinea) {
		if (esNumerico(caracteristica) && esNumerico(numeroDeAbonado) && esNumerico(codigoDePais)) {
			this.caracteristica = caracteristica;
			this.numeroDeAbonado = numeroDeAbonado;
			this.codigoDePais = codigoDePais;
			this.tipoDeLinea = tipoDeLinea;
		} else {
			System.out.println("numero ingresado no valido.");
		}

	}
	
	public String getValor( ) {
		// (+PPP) CCCC-AAAA
		return String.format("(+%s) %s-%s", codigoDePais, caracteristica, numeroDeAbonado);
	}
	
	public String getTipoDeLinea() {
		return this.tipoDeLinea.toString();
	}
	
	private static boolean esNumerico(String strNum) {
		boolean esNumerico = false;
	    if (strNum.matches("^\\d+$")) {
	    	esNumerico = true;
	    } 
		return esNumerico;
	}
}
