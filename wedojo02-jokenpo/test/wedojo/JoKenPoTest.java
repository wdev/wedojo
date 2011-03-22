package wedojo;

import org.junit.Assert;
import org.junit.Test;

public class JoKenPoTest {

	@Test
	public void testeEmpatePapel() {
		JoKenPo joKenPo = new JoKenPo();

		String resultado;
		resultado = joKenPo.lance(OpcaoJoKenPo.PAPEL, OpcaoJoKenPo.PAPEL);
		Assert.assertEquals("empate", resultado);
	}

	@Test
	public void testeEmpatePedra() {
		JoKenPo joKenPo = new JoKenPo();

		String resultado;
		resultado = joKenPo.lance(OpcaoJoKenPo.PEDRA, OpcaoJoKenPo.PEDRA);
		Assert.assertEquals("empate", resultado);
	}

	@Test
	public void testeEmpateTesoura() {
		JoKenPo joKenPo = new JoKenPo();

		String resultado;
		resultado = joKenPo.lance(OpcaoJoKenPo.TESOURA, OpcaoJoKenPo.TESOURA);
		Assert.assertEquals("empate", resultado);
	}

	@Test(expected = NullPointerException.class)
	public void testeDoisLancesNulos() {
		JoKenPo joKenPo = new JoKenPo();
		joKenPo.lance(null, null);
	}
	
	@Test(expected = NullPointerException.class)
	public void testePrimeiroLanceNulo() {
		JoKenPo joKenPo = new JoKenPo();
		joKenPo.lance(null, OpcaoJoKenPo.PEDRA);
	}
	
	@Test(expected = NullPointerException.class)
	public void testeSegundoLanceNulo() {
		JoKenPo joKenPo = new JoKenPo();
		joKenPo.lance(OpcaoJoKenPo.PEDRA, null);
	}

	@Test
	public void testePapelPedra() {
		JoKenPo joKenPo = new JoKenPo();
		
		String resultado;
		resultado = joKenPo.lance(OpcaoJoKenPo.PAPEL, OpcaoJoKenPo.PEDRA);
		Assert.assertEquals("papel", resultado);
	}

	@Test
	public void testePapelTesoura() {
		JoKenPo joKenPo = new JoKenPo();

		String resultado;
		resultado = joKenPo.lance(OpcaoJoKenPo.PAPEL, OpcaoJoKenPo.TESOURA);
		Assert.assertEquals("tesoura", resultado);
	}

	@Test
	public void testePedraPapel() {
		JoKenPo joKenPo = new JoKenPo();

		String resultado;
		resultado = joKenPo.lance(OpcaoJoKenPo.PEDRA, OpcaoJoKenPo.PAPEL);
		Assert.assertEquals("papel", resultado);
	}
	
	@Test
	public void testePedraTesoura() {
		JoKenPo joKenPo = new JoKenPo();

		String resultado;
		resultado = joKenPo.lance(OpcaoJoKenPo.PEDRA, OpcaoJoKenPo.TESOURA);
		Assert.assertEquals("pedra", resultado);
	}	
	
	@Test
	public void testeTesouraPedra() {
		JoKenPo joKenPo = new JoKenPo();
		String resultado;
		resultado = joKenPo.lance(OpcaoJoKenPo.TESOURA, OpcaoJoKenPo.PEDRA);
		Assert.assertEquals("pedra", resultado);
	}		
	
	@Test
	public void testeTesouraPapel() {
		JoKenPo joKenPo = new JoKenPo();

		String resultado;
		resultado = joKenPo.lance(OpcaoJoKenPo.TESOURA, OpcaoJoKenPo.PAPEL);
		Assert.assertEquals("tesoura", resultado);
	}
	
	
}
