package tsp_hillclimbing.entities;

public class Ciudad {
	private static final double TIERRA_ECUATORIAL_RADIO=6378.1370D;
	private static final double CONVERTIR_GRADOS_RADIANES=Math.PI/180D;
	private static final double CONVERTIR_KM_MILES=0.621371;
	
	
	private double longitud;
	private double latitud;
	private String nombre;
	
	
	
	public Ciudad( String nombre,double latitud, double longitud) {
		this.longitud = longitud*CONVERTIR_GRADOS_RADIANES;
		this.latitud = latitud*CONVERTIR_GRADOS_RADIANES;
		this.nombre = nombre;
	}
	
	public double medidaDistancia(Ciudad ciudad) { 
		double deltaLongitud= ciudad.getLongitud()-this.getLongitud();
		double deltaLatitud= ciudad.getLatitud()-this.getLatitud();
		double a=Math.pow(Math.sin(deltaLatitud/2D), 2D)+
				Math.cos(this.getLatitud())*Math.cos(ciudad.getLatitud())*Math.pow(deltaLongitud/2D,2D);
		return CONVERTIR_KM_MILES*TIERRA_ECUATORIAL_RADIO*2D*Math.atan2(Math.sqrt(a), Math.sqrt(1D-a));
	}
	
	public double getLongitud() {
		return longitud;
	}
	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}
	public double getLatitud() {
		return latitud;
	}
	public void setLatitud(double latitud) {
		this.latitud = latitud;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String toString() {
		return this.nombre;
	}
	
	
}


