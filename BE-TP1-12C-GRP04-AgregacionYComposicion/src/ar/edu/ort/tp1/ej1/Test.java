package ar.edu.ort.tp1.ej1;

public class Test {

	public static void main(String[] args) {
		
		Persona messi = new Persona("Messi", "Lionel");
		messi.agregarEmail("lio@messi.com");
		messi.agregarTelefono("549", "114111", "2222", TipoDeLinea.CELULAR);
		messi.agregarTelefono("068", "32444", "5678", TipoDeLinea.CELULAR);
		messi.agregarTelefono("054", "4411", "5472", TipoDeLinea.FIJO);
		messi.mostrarTodo();
	}
}
