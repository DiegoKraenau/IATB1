package tsp_hillclimbing.entities;

import java.util.ArrayList;
import java.util.Arrays;

public class Driver {
	
	private ArrayList<Ciudad> ciudadesIniciales=new ArrayList<Ciudad>(

	
	 Arrays.asList(
			new Ciudad("Lima", -12.0621065, -77.0365256),
			new Ciudad("Arequipa", -16.398867, -71.536961),
			new Ciudad("Cusco",-13.5170887,-71.9785356),
			new Ciudad("Trujillo",-8.1116778,-79.0287742),
			new Ciudad("Tumbes", -3.833333, -80.5),
			new Ciudad("Ica", -14.3325, -75.499722),
			new Ciudad("Junin", -11.5, -75),
			new Ciudad("Loreto", -5, -75),
			new Ciudad("Puno", -15, -70)
			) 
	 
			);
	
	public static void main(String[] args) {
		Driver driver=new Driver();
		Ruta ruta=new Ruta(driver.ciudadesIniciales);
		imprimirHead(ruta);
		System.out.print(ruta+" |  "+ruta.getDistancialTotalString());
		new HillClimbing().encontrarRutaMasCorta(ruta);
	}
	
	public static void imprimirHead(Ruta ruta) {
		String headColumn1="Ruta";
		String columnasRestantes="Distancia | Resultado";
		int ciudadNombresLargo=0;
		for(int x=0;x<ruta.getCiudades().size();x++) {
			ciudadNombresLargo+=ruta.getCiudades().get(x).getNombre().length();
		}
		int arregloLargo=ciudadNombresLargo+ruta.getCiudades().size()*2;
		int mitadLargo=(arregloLargo-headColumn1.length())/2;
		for(int x=0;x<mitadLargo;x++) {
			System.out.print(" ");
		}
		System.out.print(headColumn1);
		for(int x=0;x<mitadLargo;x++) {
			System.out.print(" ");
		}
		if((arregloLargo%2)==0) {
			System.out.print(" ");
		}
		System.out.println(" | "+columnasRestantes);
		ciudadNombresLargo+=columnasRestantes.length()+3;
		for(int x=0;x<ciudadNombresLargo+ruta.getCiudades().size()*2;x++) {
			System.out.print("-");
		}
		System.out.println("");
	}
	
	
}

