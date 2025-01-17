package tsp_hillclimbing.entities;

public class HillClimbing {
	public static final int INTERACCIONES_MAXIMAS=100;
	
	public Ruta encontrarRutaMasCorta(Ruta rutaConcurrente) {
		Ruta rutaAdjacente;
		int contadorIterador=0;
		String compararRutas=null;
		while(contadorIterador<INTERACCIONES_MAXIMAS) {
			rutaAdjacente=obtenerRutaAdjacente(new Ruta(rutaConcurrente));
			if(rutaAdjacente.getDistanciaTotal()<=rutaConcurrente.getDistanciaTotal()) {
				compararRutas="NUEVA RUTA";
				contadorIterador=0;
				rutaConcurrente=new Ruta(rutaAdjacente);
				
			}else {
				compararRutas="interaccion #"+ contadorIterador++;
			}
			System.out.println("      | "+compararRutas);
			
			System.out.print(rutaConcurrente+"  |    "+rutaConcurrente.getDistancialTotalString());
		}
		
		if(contadorIterador==100) {
			System.out.println("     | RUTA FINAL");
		}else {
			System.out.println("     | "+compararRutas);
		}
		return rutaConcurrente;
	}
	
	private Ruta obtenerRutaAdjacente(Ruta ruta) {
		int x1=0,x2=0;
		while(x1==x2) {
			x1=(int)(ruta.getCiudades().size()*Math.random());
			x2=(int)(ruta.getCiudades().size()*Math.random());
		}
		Ciudad ciudad1=ruta.getCiudades().get(x1);
		Ciudad ciudad2=ruta.getCiudades().get(x2);
		
		ruta.getCiudades().set(x2, ciudad1);
		ruta.getCiudades().set(x1,ciudad2);
		
		return ruta;
	}
}

