package vetores;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		DecimalFormat numFormatado = new DecimalFormat("R$ #,##0.00");

		double[] vlrTotal = new double[10];
		double[] vlrObjetos = new double[10];
		int[] qtdVendida = new int[10];

		double totalGeral = 0;
		double valorComissao = 0;
		double maiorQuantidade = 0;

		int indiceMaiorQuantidade = 0;

		for (int i = 0; i < 10; i++) {

			System.out.println("---------------------- PRODUTO " + (i + 1) + " ----------------------");

			System.out.print("Informe o preço unitário de cada objeto: ");
			vlrObjetos[i] = entrada.nextDouble();

			System.out.print("Informe a quantidade vendida: ");
			qtdVendida[i] = entrada.nextInt();

			vlrTotal[i] = (double) (vlrObjetos[i] * qtdVendida[i]);
			
			totalGeral += vlrTotal[i];
		}

		System.out.println("---------------------- RELATÓRIO DE VENDAS ----------------------");

		for (int i = 0; i < 10; i++) {
			System.out.println("Qtde: " + qtdVendida[i] + "\tPreço: " + numFormatado.format(vlrObjetos[i]) + "\tTotal: " + numFormatado.format(vlrTotal[i]));
			
			if(vlrObjetos[i] > maiorQuantidade) {
				maiorQuantidade = vlrObjetos[i];
				indiceMaiorQuantidade = i;
			}
		}
		
		valorComissao = 780 + (totalGeral*1.05);
		
		System.out.println("------------------------------------------------------------------");
		
		System.out.print("Total Geral: " + numFormatado.format(totalGeral));
		System.out.println("");
		System.out.print("Comissão: " + numFormatado.format(valorComissao));
		System.out.println("");
		System.out.print("Preço da maior quantidade: " + numFormatado.format(maiorQuantidade) + " seu indice é: " + indiceMaiorQuantidade);
		
		entrada.close();
	}
}
