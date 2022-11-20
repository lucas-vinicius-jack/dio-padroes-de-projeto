package dio.digital.gof.facade;

import dio.digital.gof.facade.subsistemacep.CepApi;
import dio.digital.gof.facade.subsistemacrm.CrmService;

public class Facade {

	public void migrarCliente(String nome, String cep) {
		 
		String cidade = CepApi.getIntancia().recuperarCidade(cep);
		String estado = CepApi.getIntancia().recuperarEstado(cep);
		
		CrmService.gravarCliente(nome, cep, cidade, estado);
		
		
	}
	
}
