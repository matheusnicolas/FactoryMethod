package ClassesConcretas.FactoryMethod;

public class Main {

	public static void main(String[] args){
		
		RTLanchoneteStore lanchonete = new RTLanchoneteStore();
		CGLanchoneteStore lanchonete2 = new CGLanchoneteStore();
		JPLanchoneteStore lanchonete3 = new JPLanchoneteStore();
		System.out.println("Lanchonete RT: ");
		lanchonete.orderSanduiche("Sanduiche B�sico");
		System.out.println("");
		System.out.println("Lanchonete CG: ");
		lanchonete2.orderSanduiche("Sanduiche B�sico");
		System.out.println("");
		System.out.println("Lanchonete JP:");
		lanchonete3.orderSanduiche("Sanduiche B�sico");
		
	}
}