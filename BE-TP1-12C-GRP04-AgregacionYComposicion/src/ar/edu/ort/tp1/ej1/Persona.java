package ar.edu.ort.tp1.ej1;

import java.util.ArrayList;

public class Persona {
	private String apellido;
	private String nombre;
	private ArrayList<NumeroTelefonico> telefonos;
	private ArrayList<Email> emails;
	
	public Persona() {
		this.telefonos = new ArrayList<>();
		this.emails = new ArrayList<>();
		this.nombre = "";
		this.apellido = "";
	}
	
	public Persona(String apellido, String nombre) {
		this();
		this.apellido = apellido;
		this.nombre = nombre;
		
	}
	
	/**
	 * Ejemplo:
	 * Messi, Lionel
	 * Telefonos: Celular:
	 * 549-114111-2222
	 * Celular:
	 * 068-032444-5678 Fijo:
	 * 054-4411-5472 email:
	 * lio@messi.com
	 */
	public void mostrarTodo() {

		System.out.printf("%s, %s\n Telefonos: ", this.apellido, this.nombre);
		for (NumeroTelefonico telefono : this.telefonos) {
			System.out.printf("%s:\n %s\n", telefono.getTipoDeLinea(), telefono.getValor());
		}
		for (Email email : this.emails) {
			System.out.println(email.getValor());
		}
	}
	
	
	public void agregarTelefono(String caracteristica, String numeroDeAbonado, String codigoDePais, TipoDeLinea tipoDeLinea) {
		telefonos.add(new NumeroTelefonico(caracteristica, numeroDeAbonado, codigoDePais, tipoDeLinea));
	}
	
	public void agregarEmail(String email) {
		emails.add(new Email(email));
	}
}
