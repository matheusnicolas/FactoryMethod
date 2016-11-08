package ClassesConcretas.FactoryMethod;

public class RTLanchoneteStore extends SanduicheStore{

	public Sanduiche createSanduiche(String tipo){
		if(tipo.equalsIgnoreCase("Sanduiche Básico")){
			return new SanduicheBasicoRT();
		}
		return null;
	}

	
	
}
