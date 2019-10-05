package engsoft;

import java.util.ArrayList;

public class ProgressaoQuadrada extends Progressao {

	private Progressao progressao;
	private int quadrado;

	public ProgressaoQuadrada(Progressao progressao) {

		this.progressao = progressao;

	}

	@Override

	public int inicia() {

		return this.progressao.inicia();

	}

	@Override

	public int proxTermo() {

		int q = this.progressao.proxTermo();
        quadrado = q*q;
		return quadrado;

	}}
