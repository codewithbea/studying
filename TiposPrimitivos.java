package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		// Informações do funcionário
		
		// Tipos numéricos inteiros
		
		byte anosDeEmpresa = 23; 
		short numeroDeVoos = 544; 
		int id = 12381;
		// Usa-se o L ao final do número para mostrar que é um literal long. 
		long pontosAcumulados = 3_234_845_223L; 
		
		// Tipos numéricos com pontos flutuantes.
		// Tem que colocar a letra F no final, para mostrar que está escrevendo 
		// um literal float.
		float salario = 11_445.45F; 
		double vendasAcumuladas = 2_991_797_103.01;
		
		//TIpo booleado
		boolean estaDeFerias = false; // true
		
		// Tipo caractere
		char status = 'A'; // ativo
		
		// Dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		// Numero de viagens
		System.out.println(numeroDeVoos / 2);
		
		// Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		System.out.println(id + ": ganha -> " + salario);
		System.out.println("Ferias? "+ estaDeFerias);
		System.out.println("Status: " + status);
		
	}

}
