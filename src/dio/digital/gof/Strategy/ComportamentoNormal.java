package dio.digital.gof.Strategy;

public class ComportamentoNormal implements Strategy{

	@Override
	public void mover() {
		System.out.println("Movendo-se normalmente...");
	}

}
