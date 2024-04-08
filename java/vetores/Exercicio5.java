package vetores;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		String[] gabarito = new String[] { "A", "A", "A", "A", "A", "A", "A", "A" };
		String[] resposta = new String[8];
		int notaProva = 0;
		String[] alunos = new String[10];
		int qtdAprovados = 0;

		for (int i = 0; i < alunos.length; i++) {
			notaProva = 0;

			System.out.println("---------------------- ALUNO " + (i + 1) + " ----------------------");
			System.out.print("Digite o número do " + (i + 1) + "° aluno: ");
			alunos[i] = entrada.next();

			for (int c = 0; c < resposta.length; c++) {
				System.out.print("Digite a resposta dada pelo aluno " + alunos[i] + " à " + (c + 1) + " questão: ");
				resposta[c] = entrada.next();

				if (gabarito[c].equalsIgnoreCase(resposta[c])) {
					notaProva++;
				}
			}

			if (notaProva > 6) {
				qtdAprovados++;
			}

			System.out.println("A nota do aluno " + alunos[i] + " foi: " + notaProva);
		}

		System.out.println("---------------------- PERCENTUAL DE APROVAÇÃO ----------------------");
		System.out.println("Percentual de Aprovação: " + ((qtdAprovados) * 100) / alunos.length);

		entrada.close();
	}
}
