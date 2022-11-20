package dio.digital.gof.facade.subsistemacep;

public class CepApi {

private static CepApi instancia = new CepApi();
	
	private CepApi() {
		super();
	}
	
	
	public static CepApi getIntancia() {
		return instancia;
	}
	
	public String recuperarCidade(String cep) {
		return "Araraquara";
	}
	
	public String recuperarEstado(String cep) {
		return "SP";
	}
}
