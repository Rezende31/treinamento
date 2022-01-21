package treinamento;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class lista {

	public static void main(String[] args) {
		// Armazena varios valores do mesmo tipo
		
		//Tipo[] nomeVariavel = new tipo[x]
		
		String[] nomes = new String[5];
		
		nomes[0] = "pos1";
		nomes[1] = "pos2";
		nomes[2] = "pos3";
		nomes[3] = "pos4";
		nomes[4] = "pos5";
		
		System.out.println(nomes[0]);
		System.out.println(nomes[1]);
		System.out.println(nomes[2]);
		System.out.println(nomes[3]);
		System.out.println(nomes[4]);
		
		System.out.println("------------------");
		
		nomes[0] = "trocandoNome";
		nomes[4] = "trocandoNome4";
		System.out.println(nomes[0]);
		System.out.println(nomes[4]);
		System.out.println("------------------");
		
		//Imprimindo usando o "for"
		
		for(int posVetor = 0; posVetor < 5; posVetor++) {
			System.out.println(nomes[posVetor]);	
		}
		
		System.out.println("------------------");
		System.out.println("------------------");
		//Testando outra forma de entrada
		
		String[] testeNomes = new String[] {
				"pos00", "pos01", "pos02", "pos03", "pos04"
		};
		
		for(int testePos = 0; testePos < 5; testePos++) {
			System.out.println(testeNomes[testePos]);
		}
		System.out.println("------------------");
		System.out.println("------------------");
		
		//Testando entrada com repetição.
		int[] numeros = new int[20];
		
		Arrays.fill(numeros, 10); // preenche o array com um valor
		
		System.out.println(Arrays.toString(numeros));
		
		System.out.println("------------------");
		System.out.println("------------------");
		
		//Testando entrada com for
		
		int[] testFor = new int[30];
		
		for(int posFor = 0; posFor < 30; posFor++) {
			System.out.println(testFor[posFor]);
		}
		System.out.println("------------------");
		System.out.println("------------------");
		
		String[] opcao = new String[] {
			"Anime", "Série", "Filme", "Sair"
		};
		
		int escolhaOpcao = 0;
		
		while (escolhaOpcao != 3) {
			escolhaOpcao = JOptionPane.showOptionDialog(
					null, 
					"O que vc deseja assistir?", 
					"LeoFlix", 
					JOptionPane.DEFAULT_OPTION, 
					JOptionPane.QUESTION_MESSAGE, 
					null, 
					opcao, 
					0
					);
			System.out.println("Opção escolhida: " + escolhaOpcao);
					
					
		}
	}

}
