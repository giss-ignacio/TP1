package ar.edu.ort.tp1.tp3Ejercicio01;

public class TP3Test1 {

	public static void main(String[] args) {
		Empleado jose = new Asalariado("Jose", 30, 10000f);
		Empleado carlos = new SubContratado("Carlos", 23, 50f, 100f);
		
		System.out.println(jose.getClass().getSimpleName() + " " + jose.toString());
		System.out.println(carlos.getClass().getSimpleName() + " " + carlos.toString());
	}

}
