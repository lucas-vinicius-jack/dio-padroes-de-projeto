package dio.digital.gof.Strategy;

public class ComportamentoDefensivo implements Strategy{

	@Override
	public void mover() {
		System.out.println("Movendo-se defensivamente...");
	}

}
