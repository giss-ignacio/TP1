package ar.edu.ort.tp1.tp3Ejercicio04;

import java.util.ArrayList;

public class Ticket {
	private ArrayList<Electrodomestico> carrito;
	private double total;
	private Cliente cliente;
	
	public Ticket(Cliente cliente) {
		carrito = new ArrayList<Electrodomestico>();
		total = 0;
		this.cliente = cliente;
	} 
	
	
	public void addItem(Electrodomestico item) {
		total += item.getPrecio();
		carrito.add(item);
	}
	
	public void mostrarTicket() {
		for (Electrodomestico item : carrito) {
			item.imprimir();
		}
		System.out.println("Total: " + total);
		cliente.imprimir();
	}

}
