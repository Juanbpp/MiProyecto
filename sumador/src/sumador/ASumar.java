package sumador;

public class ASumar {

	private String valor_inicial;

	public ASumar(String string) {
		 this.valor_inicial = string;
		
		// TODO Auto-generated constructor stub
	}
/**
 * 
 * @return devuelve valor si es un numero de un digito
 */
	  public String mostrar() {
	        String numero = valor_inicial;
	        if (numero.length() == 1) {
	            return (numero + " = " + numero);
	        }
			return null; 
	}		

}
