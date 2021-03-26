package ar.edu.ort.tp1.ej3;

import java.util.ArrayList;
import java.util.List;

public class Persona {
	private String apellido;
	private String nombre;
	private ArrayList<NumeroTelefonico> telefonos;
	private ArrayList<Email> emails;
	private Conjunto<Mascota> mascotas;
	private Conjunto<Hito> hitos;
	
	
	public Persona(String apellido, String nombre) {
		this.apellido = apellido;
		this.nombre = nombre;
		this.telefonos = new ArrayList<>();
		this.emails = new ArrayList<>();
		this.mascotas = new Conjunto<>();
		this.hitos = new Conjunto<>();
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
		
		System.out.println("Hitos: ");
		for (Hito hito : this.hitos) {
			System.out.printf("Descripcion: %s, fecha: %s,\n", hito.getDescripcion(), hito.getFecha());
			System.out.println("Personas involucradas: ");
			for (Persona involucrado : hito.getPersonasInvolucradas()) {
				System.out.println(involucrado.getNombreYApellido());
			}
		}
		
		System.out.println(" ");
	}
	
	
	private String getNombreYApellido() {
		return this.nombre + " " + this.apellido;
	}

	public void agregarTelefono(String caracteristica, String numeroDeAbonado, String codigoDePais, TipoDeLinea tipoDeLinea) {
		telefonos.add(new NumeroTelefonico(caracteristica, numeroDeAbonado, codigoDePais, tipoDeLinea));
	}
	
	public void agregarEmail(String email) {
		emails.add(new Email(email));
	}
	
	public void agregarMascota(Mascota mascota) {
		this.mascotas.agregar(mascota);
		
	}
	
	public Mascota quitarMascota(Mascota mascota) {
		return this.mascotas.remover(mascota);
	}
	
	public void agregarHito(Hito hito) {
		hitos.agregar(hito);
	}
	
	public Hito quitarHito(Hito hito) {
		return hitos.remover(hito);
	}
}
