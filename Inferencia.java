package fundamentos;

public class Inferencia {
	
	public static void main(String[] args) {
		
		double a = 4.5; // declaração e inicialização
		System.out.println(a);
		
		// o java vai inferir o tipo pelo valor apresentado. Nesse caso, a variável será
		// do tipo double porque o valor está 4.5
		var b = 4.5;
		System.out.println(b);
		
		// na variável c, o java vai inferir que essa variável é o tipo string.
		var c = "Texto";
		System.out.println(c);
		
		c = "Outro texto"; 
		System.out.println(c);
		// uma vez a variável sendo definida, ela não pode ser atribuida a um valor
		// que seja diferença do tipo que foi definido pela primeira vez. 
		
		double d; // declaração
		d = 345565.234; // inicialização
		System.out.println(d); // utilização
		
	}

}
