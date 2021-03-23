package ar.edu.ort.tp1.ej1;

public class Email {
	private String dominio;
	private String cuenta;
	
	public Email(String email) {
		if (!email.contains("@")) {
			System.out.println("No es un email valido.");
		} else {
			setEmail(email);
		}
	}
	
	public String getValor() {
		return cuenta + "@" + dominio;
	}
	
	private void setEmail(String email) {
		String[] dominioYCuenta = email.split("@");
		this.dominio = dominioYCuenta[1];
		this.cuenta = dominioYCuenta[0];
	}

}
