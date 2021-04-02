package ar.edu.ort.tp1.ej3;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		
		Persona jose = new Persona("Rodriguez", "Jose");
		Persona roberto = new Persona("Pepe", "Roberto");

		Persona messi = new Persona("Messi", "Lionel");
		messi.agregarEmail("lio@messi.com");
		messi.agregarEmail("liomessi_newells@hotmail.com");
		messi.agregarTelefono("549", "114111", "2222", TipoDeLinea.CELULAR);
		messi.agregarTelefono("068", "32444", "5678", TipoDeLinea.CELULAR);
		messi.agregarTelefono("054", "4411", "5472", TipoDeLinea.FIJO);
		messi.agregarMascota(new Mascota("Pluto", "Perro"));
		messi.agregarMascota(new Mascota("Felix", "Gato"));
		messi.agregarMascota(new Mascota("Bugs", "Conejo"));

		ArrayList<Persona> participantesPasearPerro = new ArrayList<>();
		participantesPasearPerro.add(messi);
		participantesPasearPerro.add(jose);
		Hito pasearElPerro = new Hito("2020-03-02", "pasear el perro", participantesPasearPerro);
		
		ArrayList<Persona> participantesGanarCopa = new ArrayList<>();
		participantesGanarCopa.add(messi);
		participantesGanarCopa.add(jose);
		participantesGanarCopa.add(roberto);
		Hito ganarLaCopa = new Hito("2017-05-04", "ganar la copa", participantesGanarCopa);

		messi.mostrarTodo();
		
		jose.mostrarTodo();
		
		roberto.mostrarTodo();
	}
}

