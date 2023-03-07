package s3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import s1.demo.BuscaLinear;

public class BuscaLinearTest {

	@Test
	public void testBusca() {
		int[] a1 = {0, 1, 2, 3, 4, 5};
		Busca buscaLinear = new s3.BuscaLinear();
		assertEquals(0, buscaLinear.busca(a1, 0));
		assertEquals(3, buscaLinear.busca(a1, 3));
		assertEquals(5, buscaLinear.busca(a1, 5));
		assertEquals(-1, buscaLinear.busca(a1, 6));
		assertEquals(-1, buscaLinear.busca(a1, -1));
		
		int[] a2 = {4, 3, 5, 2, 0, 1};
		assertEquals(5, buscaLinear.busca(a2, 1));
		assertEquals(3, buscaLinear.busca(a2, 2));
		assertEquals(0, buscaLinear.busca(a2, 4));
	}
}
