package ClassesConcretas.FactoryMethod;


public class CGLanchoneteStore extends SanduicheStore {

	public Sanduiche createSanduiche(String tipo){
		if(tipo.equalsIgnoreCase("Sanduiche B�sico")){
			return new SanduicheBasicoCG();
		}
		return null;
	}
	
	
	
	
}
