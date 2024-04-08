package fiap;

import java.util.Scanner;

public class ExemploJava {

	// estrutura principal
	public static void main(String[] args) {

		// Classe para entrada de dados
		Scanner entrada = new Scanner(System.in);

		// variáveis entrada
		int idade = 0;
		double peso = 0, altura = 0;
		char corOlho;
		String corCabelo = "";

		// variáveis processamento
		int cont50 = 0, contAltura = 0, contCabelo = 0, contCorOlho = 0;
		double somaAltura = 0, mediaAltura = 0;

		// repeticao

		for (int i = 0; i < 3; i++) {

			System.out.println((i + 1) + "° Pessoa");
			System.out.println("Informe a idade:");
			idade = entrada.nextInt();
			System.out.println("Informe o peso:");
			peso = entrada.nextDouble();
			System.out.println("Informe a altura:");
			altura = entrada.nextDouble();
			// String
			System.out.println("Informe a cor do cabelo Preto/Castanho:");
			corCabelo = entrada.next();
			// Char
			System.out.println("Informe a cor do olho A/P/C/V:");
			corOlho = Character.toUpperCase(entrada.next().charAt(0));

			while (corOlho != 'A' && corOlho != 'P' && corOlho != 'C' && corOlho != 'V') {
				System.out.println("Informe a cor do olho corretamente A/P/C/V:");
				corOlho = Character.toUpperCase(entrada.next().charAt(0));

			}

			// A) Quantidade de Pessoas com a idade > 50
			if (idade > 50) {
				cont50++;
			}
			// B) Média das alturas das pessoas entre 10 e 20 anos
			if (idade > 10 && idade < 35) {
				somaAltura += altura;
				// somaAltura = somaAltura + altura;
				contAltura++;
			}
			// C) Quantidade de pessoas com o cabelo preto
			if (corCabelo.equalsIgnoreCase("Preto")) {
				contCabelo++;
			}
			// D) Quantidade de pessoas com o olho azul
			if (corOlho == 'A') {
				contCorOlho++;
			}

		}

		mediaAltura = (double) somaAltura / contAltura;

		System.out.println("Quantidade de pessoas com idade superior a 50 anos:" + cont50);
		System.out.println("Média das alturas: " + mediaAltura);
		System.out.println("Quantidade de pessoas com o cabelo preto:" + contCabelo);
		System.out.println("Quantidade de pessoas com o olho azul:" + contCorOlho);

	}

}
