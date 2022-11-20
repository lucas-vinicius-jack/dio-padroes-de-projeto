package dio.digital.gof;

import dio.digital.gof.Strategy.ComportamentoAgressivo;
import dio.digital.gof.Strategy.ComportamentoDefensivo;
import dio.digital.gof.Strategy.ComportamentoNormal;
import dio.digital.gof.Strategy.Robo;
import dio.digital.gof.Strategy.Strategy;

public class TesteStrategy {

	public static void main(String[] args) {
		
		Strategy comportamentoDefensivo = new ComportamentoDefensivo();
		Strategy comportamentoNormal = new ComportamentoNormal();
		Strategy comportamentoAgressivo = new ComportamentoAgressivo();
		
		Robo robo = new Robo();
		robo.setComportamento(comportamentoDefensivo);
		robo.mover();
		robo.setComportamento(comportamentoNormal);
		robo.mover();
		robo.mover();
		robo.setComportamento(comportamentoAgressivo);
		robo.mover();
		robo.mover();
		robo.mover();


	}

}
