package examenED;

import static org.junit.Assert.*;

import org.junit.Test;

public class CadenasTest {

	@Test
	public void testQuitarAenPrimeras2Posiciones() {
		String palabra="Autobus";
		String resultado=palabra.substring(0,2);
		String resultado2=palabra.substring(2);
		String resultadofinal=resultado + resultado2;
		assertEquals(resultadofinal,palabra);
	}
	
	@Test
	public void testSonPrimerosYultimos2CharsLosMismos1() {
		String palabra="A";
		boolean retorno = false;
		if (palabra.length() <= 1)
			retorno=false;
		if (palabra.length() == 2)
			retorno=true;
			assertFalse(retorno);
	}
	
	@Test
	public void testSonPrimerosYultimos2CharsLosMismos2() {
		String palabra="AA";
		boolean retorno = false;
		if (palabra.length() <= 1)
			retorno=false;
		if (palabra.length() == 2)
			retorno=true;
			assertTrue(retorno);
	}
	
	@Test
	public void testSonPrimerosYultimos2CharsLosMismos3() {
		String palabra="LALA";
		boolean cierto=false;
		String primeros2Chars = palabra.substring(0, 2);
		String ultimos2Chars = palabra.substring(palabra.length() - 2);
		if(primeros2Chars.equals(ultimos2Chars))
			cierto=true;
		assertTrue(cierto);
	}

}
