package dio.digital.gof.Strategy;

public class ComportamentoAgressivo implements Strategy{

	@Override
	public void mover() {
		System.out.println("Movendo-se agressivamente...");
	}

}
