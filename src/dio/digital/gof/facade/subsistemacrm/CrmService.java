package dio.digital.gof.facade.subsistemacrm;

public class CrmService {

	private CrmService() {
		super();
	}
	
	public static void gravarCliente(String nome, String cep,String cidade,String estado) {
		System.out.println("Scliente salvo no sistema...");
	
		System.out.println("Cliente salvo no sistema de CRM: ");
		System.out.println(nome);
		System.out.println(cep);
		System.out.println(cidade);
		System.out.println(estado);
	
	}
	
}
