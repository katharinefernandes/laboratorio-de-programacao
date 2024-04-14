package metodos;

import java.util.Scanner;

public class Exercicio04 {

	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		int[] idade = new int[5];
		char[] sexo = new char[5];
		char[] corOlhos = new char[5];
		char[] corCabelo = new char[5];

		double mediaIdadeCorCabeloOlhoCP = 0;
		int maiorIdadeHabitante = 0;
		int qtdHabitantesFemCabeloOlhoLA = 0;

		for (int i = 0; i < idade.length; i++) {
			System.out.println("--- INFORMAÇÕES " + (i + 1) + "° HABITANTE ---");
			idade[i] = recebeIdade();
			sexo[i] = recebeSexo();
			corCabelo[i] = recebeCorCabelo();
			corOlhos[i] = recebeCorOlhos();
			System.out.println("");
		}

		mediaIdadeCorCabeloOlhoCP = mediaIdadeCorCabeloOlhoCP(idade, corCabelo, corOlhos);
		maiorIdadeHabitante = maiorIdadeHabitante(idade);
		qtdHabitantesFemCabeloOlhoLA = habitantesFemCabeloOlhoLA(sexo, idade, corOlhos, corCabelo);

		relatorioHabitantes(idade, sexo, corOlhos, corCabelo, mediaIdadeCorCabeloOlhoCP, maiorIdadeHabitante,
				qtdHabitantesFemCabeloOlhoLA);
	}

	public static char recebeSexo() {
		char sexo;
		System.out.print("Informe o sexo: ");
		sexo = Character.toUpperCase(entrada.next().charAt(0));

		while (sexo != 'M' && sexo != 'F') {
			System.out.print("Informe o sexo corretamente (F - Feminino | M - Masculino): ");
			sexo = Character.toUpperCase(entrada.next().charAt(0));
		}

		return sexo;
	}

	public static char recebeCorOlhos() {
		char corOlhos;

		System.out.print("Informe a cor dos olhos: ");
		corOlhos = Character.toUpperCase(entrada.next().charAt(0));

		while (corOlhos != 'A' && corOlhos != 'C') {
			System.out.print("Informe a cor dos olhos corretamente (A - Azul | C - Castanho): ");
			corOlhos = Character.toUpperCase(entrada.next().charAt(0));
		}

		return corOlhos;
	}

	public static char recebeCorCabelo() {
		char corCabelo;

		System.out.print("Informe a cor do cabelo: ");
		corCabelo = Character.toUpperCase(entrada.next().charAt(0));

		while (corCabelo != 'L' && corCabelo != 'P' && corCabelo != 'C') {
			System.out.print("Informe a cor do cabelo corretamente (L - Loiro | P - Preto | C - Castanho): ");
			corCabelo = Character.toUpperCase(entrada.next().charAt(0));
		}

		return corCabelo;
	}

	public static int recebeIdade() {
		int idade;

		System.out.print("Informe a idade: ");
		idade = entrada.nextInt();

		while (idade < 0) {
			System.out.print("Informe a idade corretamente: ");
			idade = entrada.nextInt();
		}

		return idade;
	}

	public static double mediaIdadeCorCabeloOlhoCP(int[] idade, char[] corCabelo, char[] corOlho) {
		int qtdPessoas = 0;
		int idadeTotal = 0;

		for (int i = 0; i < idade.length; i++) {
			if (corOlho[i] == 'C' && corCabelo[i] == 'P') {
				qtdPessoas++;
				idadeTotal += idade[i];
			}
		}

		if (qtdPessoas > 0) {
			return (double) idadeTotal / qtdPessoas;
		}

		return 0;

	}

	public static int maiorIdadeHabitante(int[] idade) {
		int maiorIdade = 0;

		for (int i = 0; i < idade.length; i++) {
			if (idade[i] > maiorIdade) {
				maiorIdade = idade[i];
			}
		}

		return maiorIdade;
	}

	public static int habitantesFemCabeloOlhoLA(char[] sexo, int[] idade, char[] corOlhos, char[] corCabelo) {
		int qtdHabitantes = 0;

		for (int i = 0; i < sexo.length; i++) {
			if (sexo[i] == 'F' && (idade[i] >= 18 && idade[i] <= 35) && (corOlhos[i] == 'A' && corCabelo[i] == 'L')) {
				qtdHabitantes++;

			}
		}

		return qtdHabitantes;
	}

	public static void relatorioHabitantes(int[] idade, char[] sexo, char[] corOlhos, char[] corCabelo,
			double mediaIdadeCorCabeloOlhoCP, int maiorIdadeHabitante, int qtdHabitantesFemCabeloOlhoLA) {

		System.out.println("--- RELATÓRIO DE HABITANTES ---");
		for (int i = 0; i < corCabelo.length; i++) {
			System.out.println((i + 1) + "° Habitante");
			System.out.println("Idade: " + idade[i]);
			System.out.println("Sexo: " + sexo[i]);
			System.out.println("Cor dos Olhos: " + corOlhos[i]);
			System.out.println("Cor dos Cabelos: " + corCabelo[i]);
			System.out.println("");
		}

		System.out.println("Média Idade Habitantes (Olhos - Castanhos | Cabelos - Pretos): " + mediaIdadeCorCabeloOlhoCP);
		System.out.println("Maior Idade Habitantes: " + maiorIdadeHabitante);
		System.out.println(
				"Quantidade Habitantes (Sexo - Feminino | Olhos - Azuis | Cabelos Louros: " + qtdHabitantesFemCabeloOlhoLA);
	}

}
