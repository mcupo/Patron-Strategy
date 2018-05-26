package ar.edu.ort;

public class Test {

	public static void main(String[] args) {

        VectorEnteros vector = new VectorEnteros(1000000, new EstrategiaOrdenamientoBubble());
        
        vector.ordenar();
        
        vector.setEstrategia(new EstrategiaOrdenamientoInsertion());
        vector.ordenar();
        
        vector.setEstrategia(new EstrategiaOrdenamientoShell());
        vector.ordenar();
	}
	
	public static void cargarVector(VectorEnteros vector){
		int f,n;
		for(f=0; f<vector.getTope(); f++)
		{
			n= (int)(Math.random() * vector.getTope()) + 1;
			vector.agregar(n);
		}
	}
}