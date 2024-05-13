package cp2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CheckPoint02 {

	static Scanner sc = new Scanner(System.in);
	static int totVendasGeral;
	static DecimalFormat dp = new DecimalFormat("#%");

	public static void main(String[] args) {

		System.out.println("------ GERENCIADOR DE VENSAS ONLINE ------\n");

		String[] produtos = new String[] { "TV e Vídeo", "Eletroportáveis", "Eletrodoméstico" };
		String[] meses = new String[] { "Janeiro", "Fevereiro", "Março" };

		int[][] vendasProdutos = carregVendasProdutos(produtos, meses);
		double[] percentualVendas = verificaPercentualVendas(vendasProdutos);

		System.out.println("\n------ PORCENTAGEM DE VENDAS -------");
		for (int i = 0; i < percentualVendas.length; i++) {
			System.out.println(produtos[i] + "\t" + dp.format(percentualVendas[i]));
		}

		verificaMaiorVenda(produtos, meses, vendasProdutos);
		rankingProdutos(produtos, percentualVendas);
	}

	public static int[][] carregVendasProdutos(String[] produtos, String[] meses) {

		int[][] vendasProdutos = new int[3][3];

		System.out.println("------ QUANTIDADE DE VENDAS ------");

		// produtos
		for (int i = 0; i < produtos.length; i++) {
			System.out.println("Produto - " + produtos[i]);
			// meses
			for (int j = 0; j < meses.length; j++) {
				System.out.print("Informe a quantidade de vendas no mês de " + meses[j] + ": ");
				vendasProdutos[i][j] = sc.nextInt();
				totVendasGeral += vendasProdutos[i][j];
			}
		}

		return vendasProdutos;
	}

	public static double[] verificaPercentualVendas(int[][] vendasProdutos) {

		double[] totalVendas = new double[3];
		double[] percentualVendas = new double[3];

		// produtos
		for (int l = 0; l < vendasProdutos.length; l++) {
			// meses
			for (int c = 0; c < vendasProdutos[0].length; c++) {
				totalVendas[l] += vendasProdutos[l][c];
			}
		}

		for (int i = 0; i < totalVendas.length; i++) {
			percentualVendas[i] = (totalVendas[i] / totVendasGeral);
		}

		return percentualVendas;

	}

	public static void verificaMaiorVenda(String[] produtos, String[] meses, int[][] vendasProdutos) {

		System.out.println("------ MAIORES VENDAS ------");
		// meses
		for (int c = 0; c < vendasProdutos[0].length; c++) {
			int qtdMaiorVenda = 0, indiceProduto = 0;
			// produtos
			for (int l = 0; l < vendasProdutos.length; l++) {
				if (vendasProdutos[l][c] > qtdMaiorVenda) {
					qtdMaiorVenda = vendasProdutos[l][c];
					indiceProduto = l;
				}
			}
			System.out.println(meses[c] + " - " + produtos[indiceProduto]);
		}

	}

	public static void rankingProdutos(String[] produtos, double[] percentualVendas) {

		for (int i = 0; i < percentualVendas.length; i++) {
			for (int o = 0; o < (percentualVendas.length - 1); o++) {
				if (percentualVendas[o] < percentualVendas[o + 1]) {
					double aux = percentualVendas[o];
					percentualVendas[o] = percentualVendas[o + 1];
					percentualVendas[o + 1] = aux;

					String aux2 = produtos[o];
					produtos[o] = produtos[o + 1];
					produtos[o + 1] = aux2;
				}
			}
		}

		System.out.println("------ RANKING VENDAS ------");
		for (int i = 0; i < produtos.length; i++) {
			System.out.println((i + 1) + "° " + produtos[i]);
		}
	}
}
