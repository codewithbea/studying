package fundamentos;

public class CalculoDaTemperatura {
	public static void main(String[] args) {
		
		/*
		 * Convenção: as constantes devem estar em letras maiúsculas. 
		 */
		
		final int DIFERENÇA = 32;
		// 5/9 dará zero, uma vez que é uma divisão que mostrará o número inteiro.
		// para ter uma divisão com os decimais, deve-se colocar o .0 no final dos números.
		final double FATOR = 5.0/9.0;
		
		int fahrenheit = 86;		
		double celsius = (fahrenheit - DIFERENÇA) * FATOR;
		
		System.out.println("O transformacao de " + fahrenheit + " Fahrenheit para Celsius e: " + celsius);
		
		fahrenheit = 0;
		celsius = (fahrenheit - DIFERENÇA) * FATOR;
		System.out.println("O transformacao de " + fahrenheit + " Fahrenheit para Celsius e: " + celsius);
		
		
	}

}
