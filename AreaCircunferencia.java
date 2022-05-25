package fundamentos;

public class AreaCircunferencia {
	
	public static void main(String[] args) {
		/* no caso das variáveis tem duas formas: int (números inteiros) e
		 * double para números decimais 
		 */
		double raio = 3.4;
		// convenção: usa-se o nome da constante em letra maiúscula
		// o final na frente do double ou do int simboliza uma constante, sendo assim
		// nenhum outro valor poderá ser atrelado à essa constante.
		final double PI = 3.141592;
		
		double area = PI * raio * raio;
		
		System.out.println(area); 
		
		
		// um novo valor pode ser atribuido ao raio, uma vez que ele não é uma constante
		// e sim uma variável. 
		raio = 10; 
		area = PI * raio * raio;
		
		System.out.println("Area = " + area + " m2.");
		
	}

}
