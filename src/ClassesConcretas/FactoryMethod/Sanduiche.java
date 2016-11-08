package ClassesConcretas.FactoryMethod;

import Interface.FactoryMethod.PaoIF;
import Interface.FactoryMethod.PresuntoIF;
import Interface.FactoryMethod.QueijoIF;
import Interface.FactoryMethod.SaladaIF;

public abstract class Sanduiche {

	protected PaoIF pao;
	protected QueijoIF queijo;
	protected PresuntoIF presunto;
	protected SaladaIF salada;
	
	public abstract String prepare();
	
	public String bake(){
		return "Sandu�che no forno...";
	}
	
	public String pack(){
		return "Sandu�che empacotado e pronto pra ser servido!";
	}
}
