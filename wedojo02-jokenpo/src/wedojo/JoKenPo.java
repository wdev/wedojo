package wedojo;

public class JoKenPo {

	public String lance(OpcaoJoKenPo lance1, OpcaoJoKenPo lance2) {
		if (lance1 == null || lance2 == null) {
			throw new NullPointerException();
		}

		if (lance1 == lance2) {
			return "empate";
		}

		if (lance1.getPerdedor() == lance2) {
			return lance1.name().toLowerCase();
		} else {
			return lance2.name().toLowerCase();
		}
	}
}
