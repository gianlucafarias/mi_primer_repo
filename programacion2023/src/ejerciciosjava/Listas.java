package ejerciciosjava;

import java.util.ArrayList;
import java.util.Iterator;

public class Listas {
	
	public static void main(String[] args) {
	PartidoFutbol partido1 = new PartidoFutbol ("Boca", "Palmeiras", 2, 0);
	PartidoFutbol partido2 = new PartidoFutbol ("Boca", "River", 2, 0);
	PartidoFutbol partido3 = new PartidoFutbol ("Palmeiras", "Boca", 0, 0);
	PartidoFutbol partido4 = new PartidoFutbol ("Boca", "Fluminense", 2, 0);

	ArrayList <PartidoFutbol> listaPartidos = new ArrayList<PartidoFutbol>();
	
	listaPartidos.add(partido1);
	listaPartidos.add(partido2);
	listaPartidos.add(partido3);
	listaPartidos.add(partido4);

	System.out.println("Resultados de los partidos de futbol");
	Iterator<PartidoFutbol> iteradorPartidos = listaPartidos.iterator();
	
	
	
	while(iteradorPartidos.hasNext())
	{
		PartidoFutbol elemento = iteradorPartidos.next();
		System.out.println(elemento.getEquipoLocal() 
				+ " " + elemento.getGolesLocal() 
				+ " - " + elemento.getGolesVisitante() + " " + elemento.getEquipoVisitante());
	}
	
	
	while (iteradorPartidos.hasNext())
	{
		PartidoFutbol partido = iteradorPartidos.next();
		if (partido.getGolesLocal() != partido.getGolesVisitante())
		{
			iteradorPartidos.remove();
		}
	}

	
	}
}