package s1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import s1.demo.BuscaLinear;

public class BuscaLinearTest {

	@Test
	public void testBusca() {
		int[] a1 = {0, 1, 2, 3, 4, 5};
		assertEquals(0, BuscaLinear.busca(a1, 0));
		assertEquals(3, BuscaLinear.busca(a1, 3));
		assertEquals(5, BuscaLinear.busca(a1, 5));
		assertEquals(-1, BuscaLinear.busca(a1, 6));
		assertEquals(-1, BuscaLinear.busca(a1, -1));
		
		int[] a2 = {4, 3, 5, 2, 0, 1};
		assertEquals(5, BuscaLinear.busca(a2, 1));
		assertEquals(3, BuscaLinear.busca(a2, 2));
		assertEquals(0, BuscaLinear.busca(a2, 4));
	}
}
