package matrizes;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio04 {

	public static void main(String args[]) {

		Scanner entrada = new Scanner(System.in);

		DecimalFormat formata = new DecimalFormat("##0.0");

		int[][] semestre1 = new int[5][3];
		int[][] semestre2 = new int[5][3];
		int[][] anual = new int[5][3];
		int[] totalCurso = new int[5];

		int totalUnidade = 0;
		double pctCurso = 0;
		double totalMatriculas = 0;
		int maiorNumMatriculas = 0;
		int indiceMaior = 0;

//		System.out.println("1° SEMESTRE");
		// curso
		for (int i = 0; i < semestre1.length; i++) {
			// unidade
			for (int c = 0; c < semestre1[0].length; c++) {
//				System.out.print("Informe o número de inscritos do 1° semestre do curso" + (i + 1) + " na unidade "
//						+ (c + 1) + ": ");
//				semestre1[i][c] = entrada.nextInt();

				semestre1[i][c] = (int) (Math.random() * 10);
				semestre2[i][c] = (int) (Math.random() * 10);
			}
		}

//		System.out.println("");
//
//		System.out.println("2° SEMESTRE");
//		// curso
//		for (int i = 0; i < semestre2.length; i++) {
//			// unidade
//			for (int c = 0; c < semestre2[0].length; c++) {
//				System.out.print("Informe o número de inscritos do 2° Semestre do curso " + (i + 1) + " na unidade "
//						+ (c + 1) + ": ");
//				semestre2[i][c] = entrada.nextInt();
//
//			}
//		}

		// CARREGANDO MATRIZ ANUAL
		// curso
		for (int i = 0; i < anual.length; i++) {
			// unidade
			for (int c = 0; c < anual[0].length; c++) {
				anual[i][c] = semestre1[i][c] + semestre2[i][c];
			}
		}

		// TOTAL DE MATRÍCULAS NO ANO
		// curso
		for (int i = 0; i < anual.length; i++) {
			totalCurso[i] = 0;
			System.out.println("CURSO " + (i + 1));
			// unidade
			for (int c = 0; c < anual[0].length; c++) {
				System.out.println("Quantidade de matrículas na unidade " + (c + 1) + ": " + anual[i][c]);

				totalCurso[i] += anual[i][c];
				totalMatriculas += anual[i][c];
			}
		}

		System.out.println("");

		// TOTAL DE MATRICULAS POR UNIDADE NO ANO
		// UNIDADE
		System.out.println("TOTAL DAS MATRÍCULAS EM CADA UNIDADE ");
		for (int i = 0; i < anual[0].length; i++) {
			// CURSO
			for (int c = 0; c < anual.length; c++) {
				totalUnidade += anual[c][i];
			}
			System.out.println("Total de matrículas na unidade " + (i + 1) + ": " + totalUnidade);
			totalUnidade = 0;
		}

		System.out.println("");

		// PORCENTAGEM DE MATRICULAS DE CADA CURSO NO ANO
		// CURSO
		System.out.println("TOTAL DAS MATRÍCULAS EM CADA UNIDADE ");
		for (int i = 0; i < anual.length; i++) {
			pctCurso = (double) ((totalCurso[i] / totalMatriculas) * 100);
			System.out.println("Percentual de matrículas do curso " + (i + 1) + ": " + formata.format(pctCurso));

			// CURSO COM MAIOR NUM DE MATRICULAS
			if (totalCurso[i] > maiorNumMatriculas) {
				maiorNumMatriculas = totalCurso[i];	
				indiceMaior = i;
			}
		}
		
		System.out.println("");
		System.out.println("Curso com maior número de matrículas é o " + (indiceMaior + 1) + " com " + maiorNumMatriculas + " matriculas");

		entrada.close();
	}

}
