package fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {
		/*
		 * uma das formas de fazer é atribuindo o método à variável
		 */
		String s = "Deus na terra, bolsonaro no inferno";
		s = s.replace("Deus", "Deusa");
		s = s.concat(". E Lula na presidência.");
		s = s.toUpperCase();
		System.out.println(s);
		
		/* 
		 * Outra forma de fazer é dentro da própria variável.
		 */
		
		String a = "Bolsonaro matou"
				.replace("matou", "é genocida por isso: ")
				.concat(s)
				.toUpperCase();
		System.out.println(a);
		
		// Tipos primitivos não tem o operador "." 
	
	}

}
