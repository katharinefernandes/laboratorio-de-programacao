package matrizes;

import java.util.Scanner;

public class Exemplo4 {

	public static void main(String args[]) {

		Scanner entrada = new Scanner(System.in);

		// [codProduto] [quantidade]
		int[][] produto = new int[5][2];

		// [valorProduto] [subTotal]
		double[][] vlrProduto = new double[5][2];

		double totalGeral = 0;
		double subTotal = 0;

		// linhas produtos
		for (int i = 0; i < 5; i++) {
			subTotal = 0;

			System.out.println("Produto " + (i + 1));

			System.out.print("Digite o código: ");
			produto[i][0] = entrada.nextInt();
			System.out.print("Digite o preço: ");
			vlrProduto[i][0] = entrada.nextDouble();
			System.out.print("Digite o quantidade: ");
			produto[i][1] = entrada.nextInt();
			System.out.println("");

			subTotal = vlrProduto[i][0] * produto[i][1];
			vlrProduto[i][1] = subTotal;

			totalGeral += subTotal;
		}

		for (int i = 0; i < 5; i++) {
			System.out.print("Código: " + produto[i][0]);
			System.out.print("\t Preço: " + vlrProduto[i][0]);
			System.out.print("\t Quantidade: " + vlrProduto[i][1]);
			System.out.print("\t Total: " + subTotal);

			System.out.println("");
		}

		System.out.println("");
		System.out.println("Total Geral: " + totalGeral);

		entrada.close();
	}

}
