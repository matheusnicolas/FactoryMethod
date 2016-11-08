package ClassesConcretas.FactoryMethod;


public class CGLanchoneteStore extends SanduicheStore {

	public Sanduiche createSanduiche(String tipo){
		if(tipo.equalsIgnoreCase("Sanduiche Básico")){
			return new SanduicheBasicoCG();
		}
		return null;
	}
	
	
	
	
}
