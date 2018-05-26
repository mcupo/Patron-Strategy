package ar.edu.ort;

public class Test {

	public static void main(String[] args) {
		
		int aux[], topeVector = 1000;
        VectorEnteros vector = new VectorEnteros(topeVector, new EstrategiaOrdenamientoBubble());
        aux = generarVector(topeVector);
        cargarVector(vector, aux);
        vector.ordenar();
        
        vector.setEstrategia(new EstrategiaOrdenamientoInsertion());
        cargarVector(vector, aux);
        vector.ordenar();
        
        vector.setEstrategia(new EstrategiaOrdenamientoShell());
        cargarVector(vector, aux);
        vector.ordenar();
	}
	
	public static int[] generarVector(int tope){
		int f,n, aux[] = new int[tope];
		for(f=0; f<tope; f++)
		{
			n= (int)(Math.random() * tope) + 1;
			aux[f]=n;
		}
		return aux;
	}
	
	public static void cargarVector(VectorEnteros vector, int [] aux){
		vector.limpiar();
		for(int i=0; i<vector.getTope(); i++)
		{
			vector.agregar(aux[i]);
		}
	}
}