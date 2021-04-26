package ar.edu.ort.tp1.tp3Ejercicio03;

import java.util.ArrayList;
import java.util.Scanner;

public class TestEjercicio3 {

	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int opcion;
		ArrayList<Electrodomestico> itemsEnStock = new ArrayList<Electrodomestico>();
		Ticket ticket = new Ticket();

		itemsEnStock.add(new Televisor("Philips", "ModelZ", "123ASD", 150, false, 10000, 49, true));
		itemsEnStock.add(new Televisor("Sony", "ModelZ", "QWE123", 200, false, 8000, 49, true));
	
		itemsEnStock.add(new Heladera("Fravega", "Pepito", "RTY123", 350, true, 14000, 100, true));
		itemsEnStock.add(new Heladera("Philips", "Pepita", "VBN456", 400, true, 18000, 250, false));
		
		itemsEnStock.add(new Licuadora("Panasonic", "ModelX", "187SDD", 100, false, 3000, 150, 5));
		itemsEnStock.add(new Licuadora("Samsung", "ModelY", "456HJG", 50, false, 5000, 200, 8));
		
		itemsEnStock.add(new Lavarropa("Samsung", "LavaMAX", "123QWE", 30, true, 8500, 200, true));
		itemsEnStock.add(new Lavarropa("Koinor", "LavaMAX2", "TYUGHJ", 80, true, 11000, 150, false));
		
		
		
		do {
			System.out.println("Elija un n�mero del 1 al " + itemsEnStock.size() + " o 0 para terminar. \n");
			
			for (int i = 1; i <= itemsEnStock.size(); i++) {
				System.out.println("OPCION " + i + ": " + itemsEnStock.get(i - 1).toSimpleString());
			}
			
			opcion = Integer.parseInt(input.nextLine());
			
			if(opcion != 0) {
				Electrodomestico item = itemsEnStock.get(opcion - 1);
				
				System.out.println("Desea comprar el siguiente producto? (SI/NO)");
				System.out.println(item.toString());
				
				if(input.nextLine().equalsIgnoreCase("SI")) {
					ticket.addItem(item);
				}
			}
			
		} while (opcion != 0);
		
		
		System.out.println("TICKET DE VENTA: ");
		ticket.mostrarTicket();
		
	}
	
	

}
