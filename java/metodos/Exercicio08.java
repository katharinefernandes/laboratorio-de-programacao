package metodos;

import java.util.Scanner;

public class Exercicio08 {

	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		String[] produtos = new String[] { "Notebook", "Computadores", "Tablets", "Servidores" };
		int[] metaVendas = new int[] { 30, 20, 15, 10 };

		// EXERCÍCIO A
		int[][] vendas = exercicioA(produtos);
		// EXERCICIO B
		int[] totalVendasLinha = exercicioB(vendas);
		// EXERCICIO C
		int[] totalVendasTri = exercicioC(vendas);
		// EXERCICIO D
		String[] metas = exercicioD(totalVendasLinha, metaVendas);
		// EXERCICIO E
		// exercicioE(totalVendasLinha, produtos);

		relatorioVendas(produtos, totalVendasLinha, totalVendasTri, metas);

	}

	// carrega quantidade de vendas
	public static int[][] exercicioA(String[] produtos) {

		int[][] produtosVendidos = new int[4][4];

		// trimestre
		for (int l = 0; l < produtosVendidos.length; l++) {
			System.out.println("------" + (l + 1) + "° TRIMESTRE ------");
			// produtos
			for (int c = 0; c < produtosVendidos[0].length; c++) {
				System.out.print("Informe a quantidade vendas de " + produtos[c] + ": ");
				produtosVendidos[l][c] = entrada.nextInt();
			}
		}

		return produtosVendidos;
	}

	// quantidade de produtos vendidos por linha
	public static int[] exercicioB(int[][] vendas) {

		int[] totalVendas = new int[4];

		// produto
		for (int c = 0; c < vendas[0].length; c++) {
			// trimestre
			for (int l = 0; l < vendas.length; l++) {
				// indice para cada produto
				totalVendas[c] += vendas[l][c];
			}
		}

		return totalVendas;

	}

	// verifica a quantidade total de vendas de cada produto por trimestre
	public static int[] exercicioC(int[][] vendas) {

		int[] totalVendas = new int[4];

		// trimestre
		for (int l = 0; l < vendas.length; l++) {
			// produto
			for (int c = 0; c < vendas.length; c++) {
				// indice para cada trimetres
				totalVendas[l] += vendas[l][c];
			}
		}

		return totalVendas;
	}

	// verifica se a venda dos produtos atingiu a meta
	public static String[] exercicioD(int[] totalVendasLinha, int[] metaVendas) {

		String[] metas = new String[4];

		for (int i = 0; i < metaVendas.length; i++) {
			if (totalVendasLinha[i] >= metaVendas[i]) {
				metas[i] = "Atingiu Meta";
			} else {
				metas[i] = "Não Atingiu";
			}
		}

		return metas;
	}

	// ranking das vendas
	public static void exercicioE(int[] totalVendasLinha, String[] produtos) {

		for (int i = 0; i < produtos.length; i++) {
			for (int o = 0; o < 3; o++) {
				if (totalVendasLinha[o] < totalVendasLinha[o + 1]) {
					int aux = totalVendasLinha[o];
					totalVendasLinha[o] = totalVendasLinha[o + 1];
					totalVendasLinha[o + 1] = aux;

					String aux2 = produtos[o];
					produtos[o] = produtos[o + 1];
					produtos[o + 1] = aux2;
				}
			}
		}

		System.out.println("\n------ RANKING DE VENDAS ------");
		for (int i = 0; i < totalVendasLinha.length; i++) {
			System.out.println((i + 1) + "° Lugar - " + produtos[i] + ": " + totalVendasLinha[i]);
		}

	}

	public static void relatorioVendas(String[] produtos, int[] totalVendasLinha, int[] totalVendasTri,
			String[] metas) {

		
		System.out.println("\n------ QUANTIDADE VENDAS PRODUTO ------");
		for (int i = 0; i < produtos.length; i++) {
			System.out.println("PRODUTO - " + produtos[i] + "\t | TOTAL VENDAS - " + totalVendasLinha[i]);
		}
		
		
		System.out.println("\n------ QUANTIDADE VENDAS TRIMESTRES ------");
		for (int i = 0; i < produtos.length; i++) {
			System.out.println("PRODUTO - " + produtos[i] + "\t | TOTAL VENDAS - " + totalVendasTri[i]);
		}
		
		System.out.println("\n------ VERIFICA SE ATINGIRAM META ------");
		for (int i = 0; i < produtos.length; i++) {
			System.out.println("PRODUTO - " + produtos[i] + "\t | META - " + metas[i]);
		}
		
		exercicioE(totalVendasLinha, produtos);

	}

}
