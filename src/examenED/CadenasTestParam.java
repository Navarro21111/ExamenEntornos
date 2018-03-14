package examenED;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
@RunWith(Parameterized.class)
public class CadenasTestParam {
	
private String cadena,parte1,parte2,resultado;
	
	public CadenasTestParam(String cadena, String parte1, String parte2, String resultado) {
	super();
	this.cadena = cadena;
	this.parte1 = parte1;
	this.parte2 = parte2;
	this.resultado = resultado;
}

	@Parameters
	public static Collection<Object[]>alabras(){
		return Arrays.asList(new Object[][]{ {"Alargar","al","argar","largar"},
											  {"Aterrizar","at","errizar","terrizar"},
											  {"Amenizar","Am","enizar","menizar"},
											  {"alcalino","al","calino","lcalino"},
		});
	}

	@Test
	public void test() {
		String palabra=cadena;
		String parte1=palabra.substring(0,2);
		String parte2=palabra.substring(2);
		String resultado=parte1 + parte2;
		assertEquals(resultado,palabra);
	}

}
