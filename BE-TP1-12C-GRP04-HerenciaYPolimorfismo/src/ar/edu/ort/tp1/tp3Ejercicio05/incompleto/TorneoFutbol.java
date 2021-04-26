package ar.edu.ort.tp1.tp3Ejercicio05.incompleto;

import java.util.ArrayList;

public abstract class TorneoFutbol {

	private ArrayList<Jornada> jornadas;
	private ArrayList<Equipo> equipos;
	
	public TorneoFutbol() {
		this.jornadas = new ArrayList<>();
		this.equipos = new ArrayList<>();
	}

	public void agregarJornada(Jornada jornada) {
		this.jornadas.add(jornada);
	}
	
	public void eliminarJornada(Jornada jornada) {
		if (this.jornadas.contains(jornada)) {
			this.jornadas.remove(jornada);
		}
	}
	
	public void agregarEquipo(Equipo equipo) {
		if (!this.equipos.contains(equipo)) {
			this.equipos.add(equipo);
		}
	}
	
	public void eliminarEquipo(Equipo equipo) {
		if (this.equipos.contains(equipo)) {
			this.equipos.remove(equipo);
		}
	}
	
	public void finalizarJornada(Jornada jornada) {
		if(jornadas.contains(jornada)) {
			for (Partido partido : jornada.getPartidos()) {
				calcularPuntos(partido);
			}
		}
	}
	
	public void mostrarTabla() {
		System.out.println(getTipo());
		System.out.println("Tabla de posiciones al cabo de " + String.valueOf(jornadas.size()) + " fechas:");
		for (Equipo equipo : this.equipos) {
			System.out.println(equipo.getNombre() + ":" + equipo.getPuntos() + " puntos");
		}
		
	}
	
	public abstract String getTipo();
	
	public void calcularPuntos(Partido partido) {
		int puntosLocal				= 0;
		int puntosVisitante			= 0;
		int golesEquipoLocal 		= partido.getGolesEquipoLocal();
		int golesEquipoVisitante 	= partido.getGolesEquipoVisitante();
		
		if(golesEquipoLocal > golesEquipoVisitante)//Si gana el local
		{
			puntosLocal += puntajePartidoGanado();
			puntosVisitante += puntajePartidoPerdido();
			if (golesEquipoVisitante == 0) {
				puntosLocal += puntajeVallaInvicta();
			}
			if (golesEquipoLocal - golesEquipoVisitante > 4) {
				puntosLocal += puntajeGanador4Goles();
			}
		} else if (golesEquipoVisitante > golesEquipoLocal) {//Si gana el visitante

			puntosVisitante += puntajePartidoGanado();
			puntosLocal += puntajePartidoPerdido();
			if (golesEquipoLocal == 0) {
				puntosVisitante += puntajeVallaInvicta();
			}
			if (golesEquipoVisitante - golesEquipoLocal > 4) {
				puntosVisitante += puntajeGanador4Goles();
			}
		} else { // Si empatan
			puntosLocal += puntajePartidoEmpatado();
			puntosVisitante += puntajePartidoEmpatado();
			if (golesEquipoLocal > 3) {
				puntosLocal += puntajeEmpateMas3Goles();
				puntosVisitante += puntajeEmpateMas3Goles();
			}
		}
		partido.getEquipoLocal().setPuntos(puntosLocal);
		partido.getEquipoVisitante().setPuntos(puntosVisitante);
	}
	
	public int puntajePartidoEmpatado() {
		return 1;
	}
	
	public abstract  int puntajePartidoGanado();
	
	public abstract int puntajePartidoPerdido();
	
	public abstract int puntajeVallaInvicta();
	
	public abstract int puntajeGanador4Goles();
	
	public abstract int puntajeEmpateMas3Goles();
}
