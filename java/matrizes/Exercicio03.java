package matrizes;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio03 {

	public static void main(String args[]) {

		Scanner entrada = new Scanner(System.in);

		String[] nomeLojas = new String[8];
		String[] nomeProdutos = new String[4];

		double[][] precos = new double[4][8];

		DecimalFormat formata = new DecimalFormat("R$ #0.##");

		for (int i = 0; i < nomeLojas.length; i++) {
			System.out.print("Informe o nome da loja " + (i + 1) + ": ");
			nomeLojas[i] = entrada.next();
		}

		for (int i = 0; i < nomeProdutos.length; i++) {
			System.out.print("Informe o nome do produto " + (i + 1) + ": ");
			nomeProdutos[i] = entrada.next();
		}

		// LINHAS
		for (int i = 0; i < nomeProdutos.length; i++) {
			// COLUNAS
			for (int c = 0; c < nomeLojas.length; c++) {

				precos[i][c] = (double) (Math.random() * 190);
			}
		}

		System.out.println("");

		// LINHAS
		for (int i = 0; i < nomeProdutos.length; i++) {
			System.out.println("--- Produto: " + nomeProdutos[i]);
			// COLUNAS
			for (int c = 0; c < nomeLojas.length; c++) {

				if (precos[i][c] < 120) {
					System.out.println(" ------ Loja: " + nomeLojas[c] + " Preço: " + formata.format(precos[i][c]));
				}
			}
		}

		entrada.close();
	}

}
