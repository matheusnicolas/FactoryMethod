package ClassesConcretas.FactoryMethod;

import ClassesConcretas.FactoryMethod.Pao.PaoFrances;
import ClassesConcretas.FactoryMethod.Presunto.PresuntoFrango;
import ClassesConcretas.FactoryMethod.Queijo.QueijoMussarela;
import ClassesConcretas.FactoryMethod.Salada.ComSalada;

public class SanduicheBasicoJP extends Sanduiche{

	public SanduicheBasicoJP(){
		super.pao = new PaoFrances();
		super.queijo = new QueijoMussarela();
		super.presunto = new PresuntoFrango();
		super.salada = new ComSalada();
	}
	
	public String prepare(){
		return "Preparando um sanduíche: \n" + pao.tipoPao() + "\n" + queijo.tipoQueijo() 
		+ "\n" + presunto.tipoPresunto() + "\n" + salada.tipoSalada();
	}
}
