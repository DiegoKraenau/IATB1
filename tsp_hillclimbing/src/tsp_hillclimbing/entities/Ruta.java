package tsp_hillclimbing.entities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Ruta {
	private ArrayList<Ciudad> ciudades=new ArrayList<Ciudad>();
	
	public Ruta(ArrayList<Ciudad> ciudades) {
		this.ciudades.addAll(ciudades);
		Collections.shuffle(this.ciudades);
	}
	
	public Ruta(Ruta ruta) {
		ruta.ciudades.stream().forEach(x->ciudades.add(x));
	}
	
	public String toString() {
		
		return Arrays.toString(ciudades.toArray());
	}
	
	public double getDistanciaTotal() {
		int ciudadesSize=this.ciudades.size();
		
		return this.ciudades.stream().mapToDouble(x->{
			int ciudadIndex=this.ciudades.indexOf(x);
			double returnValue=0;
			if(ciudadIndex<ciudadesSize-1) {
				returnValue=x.medidaDistancia(this.ciudades.get(ciudadIndex+1));
			}
			return returnValue;
		}).sum()+this.ciudades.get(ciudadesSize-1).medidaDistancia(this.ciudades.get(0));
	}
	
	
	public String getDistancialTotalString() {
		String returnValue=String.format("%.2f", this.getDistanciaTotal());
		if(returnValue.length()==7)returnValue=" "+returnValue;
		return returnValue;
	}

	public ArrayList<Ciudad> getCiudades() {
		return ciudades;
	}

	public void setCiudades(ArrayList<Ciudad> ciudades) {
		this.ciudades = ciudades;
	}
	
	
}

