package engsoft;

import java.util.ArrayList;

public class ProgressaoQuadrada extends Progressao {

	private Progressao progressao;
	private int resultado;

	public ProgressaoQuadrada(Progressao progressao) {

		this.progressao = progressao;

	}

	@Override

	public int inicia() {

		return this.progressao.inicia();

	}

	@Override

	public int proxTermo() {

		int termo = this.progressao.proxTermo();
		resultado = (int) Math.pow(termo,2);
		return resultado;

	}
}
