package ar.edu.ort;

//Clase Estrategia
public abstract class EstrategiaOrdenamiento {
	
	protected long tiempoInicial;
	protected long tiempoFinal;
	
	public abstract void ordenar(int vector[]);

}