package ar.edu.ort;

//Clase Contexto
public class VectorEnteros {

	private int vector[];
	private final int tope;
	private EstrategiaOrdenamiento estrategia;
	
	public VectorEnteros(int tope, EstrategiaOrdenamiento estrategia) {
		vector 			= new int[tope];
		this.estrategia = estrategia;
		this.tope		= tope;
	}

	public void setEstrategia(EstrategiaOrdenamiento estrategia) {
		this.estrategia = estrategia;
	}

	public void agregar(int numero)
	{
		for(int i=0; i<vector.length; i++) {
			if(vector[i]==0){
				vector[i] = numero;
				break;
			}
		}
	}

	public void ordenar() {
		estrategia.ordenar(vector);
	}
	
	public int getTope() {
		return tope;
	}
}