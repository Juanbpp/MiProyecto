package sumador;

/**
 * 
 * @author Juan Bautista Penalva Perez
 *
 */
public class ASumar {
	private String valor_inicial;
	/**
	 * 
	 * @param string valor a calcular
	 */
	public ASumar(String string) {
		this.valor_inicial = string;
	}
	/**
	 * Si el numero tiene una longitud de 1 devuelve el mismo numero
	 * Si el numero es menor de 0 devuelve ""
	 * Si el numero es mayor de 9 devuelve una cadena con su suma.
	 * @return devuelve el valor de mostrar
	 */
	public String mostrar() {
		String numero = valor_inicial;
		if (numero.length() == 1) {
			return (numero + " = " + numero);
		} else if (Integer.parseInt(numero) < 0) {
			return ("");
		} else if (Integer.parseInt(numero) > 9) {
			String suma = "";
			for (int i = 0; i < valor_inicial.length(); i++) {
				String digito = valor_inicial.substring(i, i + 1);
				if (i == 0) {
					suma = suma + digito;
				} else {
					suma = suma + " + " + digito;
				}
			}
			numero = suma + " = " + total();
			return numero;
		}
		return numero;
	}
/**
 * 
 * @return devuelve la suma de los digitos.
 */
	public int total() {
		int suma = 0;

		for (int i = 0; i < valor_inicial.length(); i++) {
			// Cadena de un dígito.
			String digito = valor_inicial.substring(i, i + 1);
			suma = suma + Integer.parseInt(digito);
		}
		return suma;

	}
}
