package matrizes;

import java.text.DecimalFormat;
import java.util.Scanner;

// CHECKPOINT
public class Exercicio05 {

	public static void main(String args[]) {

		Scanner entrada = new Scanner(System.in);

		DecimalFormat formata = new DecimalFormat("##0.0");

		// produto // loja
		double[][] produtosLojas = new double[12][5];
		String[] lojas = new String[] { "LojaA", "LojaB", "LojaC", "LojaD", "LojaE" };
		String[] produtos = new String[] { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L" };

		double menorPreco = 0;
		int indiceProdMenorPreco = 0;
		int indiceLojaMenorPreco = 0;

		double maiorPreco = 0;
		int indiceProdMaiorPreco = 0;
		int indiceLojaMaiorPreco = 0;

		for (int l = 0; l < produtosLojas.length; l++) {
			System.out.println("PRODUTO: " + produtos[l]);
			for (int c = 0; c < produtosLojas[0].length; c++) {
				produtosLojas[l][c] = (double) (Math.random() * 100);
			}
		}

		for (int l = 0; l < produtosLojas.length; l++) {
			System.out.println("PRODUTO: " + produtos[l]);
			for (int c = 0; c < produtosLojas[0].length; c++) {
				System.out.println("Preço na loja " + lojas[c] + ": " + formata.format(produtosLojas[l][c]));
			}
		}

		for (int l = 0; l < produtosLojas.length; l++) {
			for (int c = 0; c < produtosLojas[0].length; c++) {
				if (c == 0 && l == 0) {
					indiceProdMenorPreco = l;
					indiceLojaMenorPreco = c;
					menorPreco = produtosLojas[l][c];
				} else {

					if (produtosLojas[l][c] < menorPreco) {
						indiceProdMenorPreco = l;
						indiceLojaMenorPreco = c;
						menorPreco = produtosLojas[l][c];
					} else {
						indiceProdMaiorPreco = l;
						indiceLojaMaiorPreco = c;
						maiorPreco = produtosLojas[l][c];
					}
				}

			}
		}
		
		System.out.println("");

		System.out.println("Produto mais Barato: " + produtos[indiceProdMenorPreco]);
		System.out.println("Loja: " + lojas[indiceLojaMenorPreco]);
		System.out.println("Preço: " + formata.format(menorPreco));

		System.out.println("Produto mais Caro: " + produtos[indiceProdMaiorPreco]);
		System.out.println("Loja: " + lojas[indiceLojaMaiorPreco]);
		System.out.println("Preço: " + formata.format(maiorPreco));

		entrada.close();
	}

}
