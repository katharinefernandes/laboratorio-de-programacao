package matrizes;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		DecimalFormat monetario = new DecimalFormat("R$ ##0.00");

		int[][] armazens = new int[5][3];
		double[] somaArmazem = new double[4];

		double[] totalProd = new double[3];
		double[] totalArmazem = new double[4];

		// Produto 2
		int vlrMaiorEstProd2 = 0, indMaiorEstProd2 = 0;
		// Maior e Menor
		int indMenorEstoque = 0, vlrMenorEstoque = 0;

		for (int l = 0; l < 4; l++) {
			System.out.println("--- Estoque do armazém (" + (l + 1) + ") ---");
			for (int c = 0; c < 3; c++) {
				System.out.print("--- Informe a quantidade em estoque do Produto (" + (c + 1) + "): ");
				armazens[l][c] = entrada.nextInt();
			}
		}

		System.out.println("----------- CUSTO DE CADA PRODUTO -----------");

		for (int c = 0; c < 3; c++) {
			System.out.print("--- Informe o custo do Produto (" + (c + 1) + "): ");
			armazens[4][c] = entrada.nextInt();
		}

		System.out.println("");

		// a)
		System.out.println("----------- QUANTIDADE DE ITENS EM CADA ARMAZÉM -----------");

		for (int l = 0; l < 4; l++) {
			for (int c = 0; c < 3; c++) {

				somaArmazem[l] += armazens[l][c];

				if (l == 0 && c == 0) {
					indMenorEstoque = 0;
					vlrMenorEstoque = armazens[l][c];
				} else {
					if (armazens[l][c] < vlrMenorEstoque) {
						indMenorEstoque = l;
						vlrMenorEstoque = armazens[l][c];
					}
				}

				if (armazens[l][1] > vlrMaiorEstProd2) {
					vlrMaiorEstProd2 = armazens[l][1];
					indMaiorEstProd2 = l;
				}

				totalProd[c] += (armazens[l][c] * armazens[4][c]);
			}
		}

		for (int l = 0; l < 4; l++) {
			System.out.println("--- Estoque no armazém (" + (l + 1) + "): " + somaArmazem[l]);
		}

		System.out.println("");

		System.out.println("----------- ARMAZÉM COM MAIOR ESTOQUE DO PRODUTO 2 -----------");
		System.out.println("--- Armazém (" + (indMaiorEstProd2 + 1) + ") - Quantidade em estoque: "
				+ monetario.format(vlrMaiorEstProd2));
		System.out.println("");
		System.out.println("----------- ARMAZÉM COM MENOR ESTOQUE -----------");
		System.out.println("--- Armazém (" + (indMenorEstoque + 1) + ") - Quantidade em estoque: "
				+ monetario.format(vlrMenorEstoque));

		System.out.println("");

		System.out.println("----------- CUSTO TOTAL DE CADA PRODUTO -----------");
		for (int c = 0; c < 3; c++) {
			System.out.println("--- Custo total do produto (" + (c + 1) + "): " + monetario.format(totalProd[c]));
		}

		for (int c = 0; c < 3; c++) {
			for (int l = 0; l < 4; l++) {
				totalArmazem[l] += (armazens[l][c] * armazens[4][c]);
			}
		}

		System.out.println("");
		System.out.println("----------- CUSTO TOTAL DE CADA ARMAZÉM -----------");
		for (int l = 0; l < 4; l++) {
			System.out.println("--- Custo total no armazém (" + (l + 1) + "): " + monetario.format(totalArmazem[l]));
		}

		entrada.close();

	}

}
