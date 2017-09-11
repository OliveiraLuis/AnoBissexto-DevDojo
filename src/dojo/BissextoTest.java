package dojo;

import static org.junit.Assert.*;

import org.junit.Test;

public class BissextoTest {

	@Test
	public void test1600EhPrimo() {
		boolean resposta = Bissexto.definePrimo(1600);
		assertEquals(true, resposta);
	}

}
