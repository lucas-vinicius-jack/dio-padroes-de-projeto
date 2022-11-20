package dio.digital.gof.Strategy;

public class Robo {

	private Strategy comportamento;

	public void setComportamento(Strategy comportamento) {
		this.comportamento = comportamento;
	}
	
	public void mover() {
		this.comportamento.mover();
	}
	
}
