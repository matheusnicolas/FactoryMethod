package ClassesConcretas.FactoryMethod;

public class RTLanchoneteStore extends SanduicheStore{

	public Sanduiche createSanduiche(String tipo){
		if(tipo.equalsIgnoreCase("Sanduiche B�sico")){
			return new SanduicheBasicoRT();
		}
		return null;
	}

	
	
}
