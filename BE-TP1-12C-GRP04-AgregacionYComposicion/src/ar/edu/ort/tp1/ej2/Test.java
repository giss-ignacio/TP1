package ar.edu.ort.tp1.ej2;

public class Test {

	public static void main(String[] args) {
		
		Persona messi = new Persona("Messirve", "Lionel");
		messi.agregarEmail("lio@messi.com");
		messi.agregarEmail("liomessi_newells@hotmail.com");
		messi.agregarTelefono("549", "114111", "2222", TipoDeLinea.CELULAR);
		messi.agregarTelefono("068", "32444", "5678", TipoDeLinea.CELULAR);
		messi.agregarTelefono("054", "4411", "5472", TipoDeLinea.FIJO);
		messi.agregarMascota(new Mascota("Pluto", "Perro"));
		messi.agregarMascota(new Mascota("Felix", "Gato"));
		messi.agregarMascota(new Mascota("Bugs", "Conejo"));
		messi.mostrarTodo();
	}
}
