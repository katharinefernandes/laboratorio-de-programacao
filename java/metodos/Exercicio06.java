package metodos;

import java.util.Scanner;

public class Exercicio06 {

	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		int[][] chamados = new int[5][3];

		chamados = verificaChamados();
		relatorioNumErros(chamados);
		relatorioCriterios(chamados);

	}

	public static int[][] verificaChamados() {

		int[][] chamados = new int[5][3];

		for (int i = 0; i < chamados.length; i++) {
			System.out.print("Informe o Id do funcionário: ");
			chamados[i][0] = entrada.nextInt();
			System.out.print("Informe o código do erro: ");
			chamados[i][1] = entrada.nextInt();

			while (chamados[i][1] < 1 || chamados[i][1] > 3) {
				System.out.print("Informe o código do erro corretamente (1|2|3): ");
				chamados[i][1] = entrada.nextInt();
			}

			System.out.print("Informe critério do chamado: ");
			chamados[i][2] = entrada.nextInt();
			while (chamados[i][2] < 1 || chamados[i][2] > 4) {
				System.out.print("Informe o critério do chamado (1|2|3|4): ");
				chamados[i][2] = entrada.nextInt();
			}
			
			System.out.println("");
		}

		return chamados;

	}

	public static void relatorioNumErros(int[][] chamados) {

		int cont1 = 0, cont2 = 0, cont3 = 0;

		System.out.println("\n------ RELATÓRIO DE CHAMADOS POR ERRO ------");

		for (int i = 0; i < chamados.length; i++) {
			if (chamados[i][1] == 1) {
				cont1++;
			} else if (chamados[i][1] == 2) {
				cont2++;
			} else {
				cont3++;
			}
		}

		System.out.println("Números de chamados com o Código do erro 1: " + cont1);
		System.out.println("Números de chamados com o Código do erro 2: " + cont2);
		System.out.println("Números de chamados com o Código do erro 3: " + cont3);
	}

	public static void relatorioCriterios(int[][] chamados) {

		int[] contagem = new int[4];
		String[] criterios = new String[] {"Sistema parado", "Grave", "Não grave", "Dúvida"};

		System.out.println("\n------ RELATÓRIO DE CHAMADOS POR CRITÉRIO ----");

		for (int i = 0; i < chamados.length; i++) {
			if (chamados[i][2] == 1) {
				contagem[0]++;
			} else if (chamados[i][2] == 2) {
				contagem[1]++;
			} else if (chamados[i][2] == 3) {
				contagem[2]++;
			} else {
				contagem[3]++;
			}
		}
		
		for (int i = 0; i < criterios.length; i++) {
			System.out.println("Número de chamados - " + criterios[i] + ": " + contagem[i]);			
		}
		

	}

}
