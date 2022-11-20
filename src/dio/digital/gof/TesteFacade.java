package dio.digital.gof;

import dio.digital.gof.facade.Facade;

public class TesteFacade {

	public static void main(String[] args) {
		
		Facade facade = new Facade();
		facade.migrarCliente("Michael","14801788");
		
	}
	
	
}
