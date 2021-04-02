package ar.edu.ort.tp1.ej2;

import java.util.ArrayList;

public class Persona {
	private String apellido;
	private String nombre;
	private ArrayList<NumeroTelefonico> telefonos;
	private ArrayList<Email> emails;
	private ArrayList<Mascota> mascotas;
	
	public Persona() {
		this.telefonos = new ArrayList<>();
		this.emails = new ArrayList<>();
		this.mascotas = new ArrayList<>();
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
	 * lio@messi.com, liomessi_newells@hotmail.com 
	 * Mascotas: Perro,
	 * Pluto Gato, Felix 
	 * Conejo, Bugs
	 */
	public void mostrarTodo() {

		System.out.printf("%s, %s\n Telefonos: ", this.apellido, this.nombre);
		for (NumeroTelefonico telefono : this.telefonos) {
			System.out.printf("%s:\n %s\n", telefono.getTipoDeLinea(), telefono.getValor());
		}
		for (Email email : this.emails) {
			System.out.println(email.getValor());
		}
		System.out.println("Mascotas: ");
		for (Mascota mascota : this.mascotas) {
			System.out.printf("  %s, %s,\n", mascota.getTipoDeAnimal(), mascota.getNombre());
		}
	}
	
	
	public void agregarTelefono(String caracteristica, String numeroDeAbonado, String codigoDePais, TipoDeLinea tipoDeLinea) {
		telefonos.add(new NumeroTelefonico(caracteristica, numeroDeAbonado, codigoDePais, tipoDeLinea));
	}
	
	public void agregarEmail(String email) {
		emails.add(new Email(email));
	}
	
	public Email quitarEmail(String email) {
		Email emailQuitado = buscarEmail(email);
		if (emailQuitado != null) {
			this.emails.remove(emailQuitado);
		}
		return emailQuitado;
	}
	
	public Email buscarEmail(String emailABuscar) {
		Email emailBuscado = null;
		for (Email email : this.emails) {
			if (email.getValor().equals(emailABuscar)) {
				emailBuscado = email;
			}
		}
		return emailBuscado;
	}
	
	public void agregarMascota(Mascota mascota) {
		if (!this.mascotas.contains(mascota)) {
			this.mascotas.add(mascota);
		}
	}
	
	public Mascota quitarMascota(Mascota mascota) {
		Mascota mascotaQuitada = null;
		if (this.mascotas.contains(mascota)) {
			this.mascotas.remove(mascota);
			mascotaQuitada = mascota;
		}
		return mascotaQuitada;
	}
	
	
}
