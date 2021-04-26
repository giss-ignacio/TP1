package ar.edu.ort.tp1.tp3Ejercicio02;

public class TP3Test2 {

	public static void main(String[] args) {
		Empleado pedro = new Vendedor("Pedro", 25, 100f, 200f, 5f);
		Empleado maria = new Vendedor("Maria", 30, 100f, 200f, 10f);
		
		System.out.println(pedro.getClass().getSimpleName() + " 1 " + pedro.toString());
		System.out.println(maria.getClass().getSimpleName() + " 2 " + maria.toString());
	}

}
