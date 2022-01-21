package treinamento;

public class Aula003 {

	public static void main(String[] args) {
		int minNum = Integer.MIN_VALUE;
		int dezNumeros = Integer.MAX_VALUE;
		
		long menorLong = Long.MIN_VALUE;
		long maiorLong = Long.MAX_VALUE;
		
		
		float menorFloat = Float.MIN_VALUE;
		float maiorFloat = Float.MAX_VALUE;
		
		double menorDouble = Double.MIN_VALUE;
		double maiorDouble = Double.MAX_VALUE;
		
		double outraVardouble = 999999999999999999999999999999999999999999999999999999d;
		
		long teste = 999999999999999999l;
		
		float varFloat = 99999999999999999999999999999999999999.452548612864482458f;
		
		System.out.println("O menor valor para um int é: " + minNum);
		System.out.println("O maior valor para um int é: " + dezNumeros);
		System.out.println("O menor valor para um long é: " + menorLong);
		System.out.println("O maior valor para um long é: " + maiorLong);
		System.out.println("O menor valor para um float é: " + menorFloat);
		System.out.println("O maior valor para um float é: " + maiorFloat);
		System.out.println("O menor valor para um double é: " + menorDouble);
		System.out.println("O maior valor para um double é: " + maiorDouble);
		//System.out.println(outraVarInt);
		System.out.println("long = " + teste);
		System.out.printf("Variavel double %.9f", outraVardouble); // O numero depois do ponto define o numero de casas depois da virgula
		System.out.printf("\n  %f %f", outraVardouble, outraVardouble);
		System.out.printf("\nVariavel long %d", teste);
		System.out.printf("\n %d", teste);
		System.out.printf("\nVariavel float %.10f", varFloat);

	}

}
