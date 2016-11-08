package ClassesConcretas.FactoryMethod;

public class JPLanchoneteStore extends SanduicheStore {

	public Sanduiche createSanduiche(String tipo){
		if(tipo.equalsIgnoreCase("Sanduiche Básico")){
			return new SanduicheBasicoJP();
		}
		return null;
	}
}
