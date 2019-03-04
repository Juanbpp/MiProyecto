package sumador;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestASumar {

	/**
	 * comprueba si 5 es igual a 5 = 5
	 */
	@Test
	public void testUnaCifra() {
		ASumar sumi = new ASumar("5");
		String resultado = sumi.mostrar();
		assertEquals("5 = 5", resultado);
	}
/**
 * comprueba si el numero es negativo y es ""
 */
	@Test
	public void testNegativo() {
		ASumar sumi = new ASumar("-1");
		String resultado = sumi.mostrar();
		assertEquals("", resultado);
	}
/**
 * comprueba si el numero es mayor de 9 y devuelve una cadena y su valor total.
 */
	@Test
	public void testmasde1digito() {
		ASumar sumi = new ASumar("12");
		String resultado = sumi.mostrar();
		assertEquals("1 + 2 = 3", resultado);
	}

}