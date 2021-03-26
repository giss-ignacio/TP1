package ar.edu.ort.tp1.ej3;

import java.util.Date;

public class Test {

	public static void main(String[] args) {
		
		Persona jose = new Persona("Rodriguez", "Jose");
		Persona roberto = new Persona("Pepe", "Roberto");

		Persona messi = new Persona("Messirve", "Lionel");
		messi.agregarEmail("lio@messi.com");
		messi.agregarEmail("liomessi_newells@hotmail.com");
		messi.agregarTelefono("549", "114111", "2222", TipoDeLinea.CELULAR);
		messi.agregarTelefono("068", "32444", "5678", TipoDeLinea.CELULAR);
		messi.agregarTelefono("054", "4411", "5472", TipoDeLinea.FIJO);
		messi.agregarMascota(new Mascota("Pluto", "Perro"));
		messi.agregarMascota(new Mascota("Felix", "Gato"));
		messi.agregarMascota(new Mascota("Bugs", "Conejo"));

		Hito pasearElPerro = new Hito(new Date(120, 2, 3), "pasear el perro", new Conjunto<Persona>(messi, jose));
		Hito ganarLaCopa = new Hito(new Date(117, 5, 4), "ganar la copa", new Conjunto<Persona>(messi, roberto, jose));

		messi.mostrarTodo();
		
		jose.mostrarTodo();
		
		roberto.mostrarTodo();
	}
}

