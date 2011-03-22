package wedojo;

public enum OpcaoJoKenPo {

	PEDRA("TESOURA"), PAPEL("PEDRA"), TESOURA("PAPEL"), EMPATE("EMPATE");

	private String perdedor;

	OpcaoJoKenPo(String nomePerdedor) {
		this.perdedor = nomePerdedor;
	}

	public OpcaoJoKenPo getPerdedor() {
		return OpcaoJoKenPo.valueOf(perdedor);
	}

}
