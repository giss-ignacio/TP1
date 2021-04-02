package ar.edu.ort.tp1.ej2;

public class Test {

	public static void main(String[] args) {
		
		Persona messi = new Persona("Messi", "Lionel");
		messi.agregarEmail("lio@messi.com");
		messi.agregarEmail("liomessi_newells@hotmail.com");
		messi.agregarTelefono("549", "114111", "2222", TipoDeLinea.CELULAR);
		messi.agregarTelefono("068", "32444", "5678", TipoDeLinea.CELULAR);
		messi.agregarTelefono("054", "4411", "5472", TipoDeLinea.FIJO);
		
		Mascota pluto = new Mascota("Pluto", "Perro");
		Mascota felix = new Mascota("Felix", "Gato");
		Mascota bugs = new Mascota("Bugs", "Conejo");
		messi.agregarMascota(pluto);
		messi.agregarMascota(felix);
		messi.agregarMascota(bugs);
		messi.mostrarTodo();
		
		messi.quitarMascota(pluto);
		messi.quitarMascota(bugs);
		messi.quitarEmail("liomessi_newells@hotmail.com");
		messi.mostrarTodo();
	}
}
