package matrizes;

import java.text.DecimalFormat;
import java.util.Scanner;

// DECIMAL FORMAT
public class Exercicio06 {

	public static void main(String args[]) {

		Scanner entrada = new Scanner(System.in);
		
		DecimalFormat formata = new DecimalFormat("##0.0");

		String[] produtos = new String[5];
		double[][] precoProdutos = new double[5][4];

		double[] custoTransporte = new double[5];
		double[][] impostos = new double[5][4];
		double valorImposto = 0;

		for (int l = 0; l < produtos.length; l++) {
			System.out.print("Informe o nome do produto " + (l + 1) + ": ");
			produtos[l] = entrada.next();

			System.out.print("Informe o custo do transporte do produto " + (l + 1) + ": ");
			custoTransporte[l] = entrada.nextDouble();
		}

		for (int l = 0; l < 5; l++) {
			System.out.println("Informe o preço do produto: " + produtos[l]);
			for (int c = 0; c < 4; c++) {
				System.out.print("Preço do produto na loja " + (c + 1) + ": ");
				precoProdutos[l][c] = entrada.nextDouble();
			}
		}

		for (int l = 0; l < impostos.length; l++) {
			for (int c = 0; c < impostos[0].length; c++) {

				if (precoProdutos[l][c] <= 50) {
					impostos[l][c] = 0.05;
				} else if (precoProdutos[l][c] > 50 && precoProdutos[l][c] <= 100) {
					impostos[l][c] = 0.1;
				} else {
					impostos[l][c] = 0.2;

				}
			}
		}
		
		System.out.println("");

		for (int l = 0; l < precoProdutos.length; l++) {
			System.out
					.println("Nome do produto: " + produtos[l] + " - " + "Custo do transporte: " + custoTransporte[l]);
			for (int c = 0; c < precoProdutos[0].length; c++) {
				System.out.println("------ Loja " + (c + 1));
				valorImposto = precoProdutos[l][c] * impostos[l][c];
				System.out.println("------ Imposto " + formata.format(valorImposto));
				System.out.println("------ Preço " + formata.format(precoProdutos));
				System.out.println("------ Preço Final " + formata.format((valorImposto + custoTransporte[l] + precoProdutos[l][c])));
				System.out.println("");
			}
		}

		entrada.close();
	}

}
