package ar.edu.ort.tp1.tp3Ejercicio03;

import java.util.ArrayList;

public class Ticket {
	private ArrayList<Electrodomestico> carrito;
	private double total;
	
	public Ticket() {
		carrito = new ArrayList<Electrodomestico>();
		total = 0;
	} 
	
	
	public void addItem(Electrodomestico item) {
		total += item.getPrecio();
		carrito.add(item);
	}
	
	public void mostrarTicket() {
		for (Electrodomestico item : carrito) {
			System.out.println(item.toString());
		}
		System.out.println("Total: " + total);
	}

}
