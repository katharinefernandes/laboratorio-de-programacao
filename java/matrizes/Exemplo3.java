package matrizes;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exemplo3 {

	public static void main(String args[]) {

		Scanner entrada = new Scanner(System.in);

		String[] nomes = new String[] { "Ana", "João", "Luis" };
		double[][] notas = new double[3][4];
		double somaNotas = 0;
		
		DecimalFormat formata = new DecimalFormat("##0.0");

		for (int a = 0; a < 3; a++) {
			for (int n = 0; n < 3; n++) {
				System.out.print("Digite a nota " + (n + 1) + "° do aluno(a) " + nomes[a] + ": ");
				notas[a][n] = entrada.nextDouble();
				// soma três notas do aluno
				somaNotas += notas[a][n];
			}
			// armazena na última coluna da matriz a média
			notas[a][3] = somaNotas / 3;
			somaNotas = 0;
		}
		
		System.out.println("");
		System.out.println("LISTA ALUNOS - MÉDIA");

		// LISTA ALUNO E MÉDIA
		for (int i = 0; i < 3; i++) {
			System.out.println("Aluno " + nomes[i] + " - Média: " + formata.format(notas[i][3]));
		}
		
		System.out.println("");
		System.out.println("MATRIZ NOTAS");
		for (int a = 0; a < 3; a++) {
			for (int n = 0; n < 4; n++) {
				System.out.print(notas[a][n]);
			}
			System.out.println("");
		}


		entrada.close();
	}

}
