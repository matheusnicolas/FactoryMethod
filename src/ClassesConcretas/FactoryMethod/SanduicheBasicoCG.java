package ClassesConcretas.FactoryMethod;

import ClassesConcretas.FactoryMethod.Pao.PaoIntegral;
import ClassesConcretas.FactoryMethod.Presunto.PresuntoFrango;
import ClassesConcretas.FactoryMethod.Queijo.QueijoPrato;
import ClassesConcretas.FactoryMethod.Salada.SemSalada;

public class SanduicheBasicoCG extends Sanduiche{

	public SanduicheBasicoCG(){
		super.pao = new PaoIntegral();
		super.queijo = new QueijoPrato();
		super.presunto = new PresuntoFrango();
		super.salada = new SemSalada();
	}

	
	public String prepare(){
		return "Preparando um sanduíche: \n" + pao.tipoPao() + "\n" + queijo.tipoQueijo() 
		+ "\n" + presunto.tipoPresunto() + "\n" + salada.tipoSalada();
	}
	
	
}
