package ClassesConcretas.FactoryMethod;

import ClassesConcretas.FactoryMethod.Pao.PaoBola;
import ClassesConcretas.FactoryMethod.Presunto.PresuntoPeru;
import ClassesConcretas.FactoryMethod.Queijo.QueijoCheddar;
import ClassesConcretas.FactoryMethod.Salada.SemSalada;

public class SanduicheBasicoRT extends Sanduiche {

	public SanduicheBasicoRT(){
		super.pao = new PaoBola();
		super.queijo = new QueijoCheddar();
		super.presunto = new PresuntoPeru();
		super.salada = new SemSalada();
	}
	
	public String prepare(){
		return "Preparando um sanduíche: \n" + pao.tipoPao() + "\n" + queijo.tipoQueijo() 
		+ "\n" + presunto.tipoPresunto() + "\n" + salada.tipoSalada();
	}
	
}