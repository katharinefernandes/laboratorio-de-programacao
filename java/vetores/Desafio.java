package vetores;

import java.util.Scanner;

public class Desafio {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		String[] nomeVendedor = new String[10];
		double[] comissao = new double[10];
		String[] estado = new String[10];

		double[] totalVendas = new double[10];
		double[] vlrFinalComissao = new double[10];

		double totalComissao = 0;
		int indiceMaiorComissao = 0;
		int indiceMenorTotVendas = 0;
		int vendedoresSp = 0;

		double maiorComissao = 0;
		double menorVenda = 0;

		for (int i = 0; i < nomeVendedor.length; i++) {

			System.out.println("---------------------- VENDEDOR " + (i + 1) + " ----------------------");

			System.out.print("Digite o nome do vendedor: ");
			nomeVendedor[i] = entrada.next();
			System.out.print("Digite o total de vendas: ");
			totalVendas[i] = entrada.nextDouble();
			System.out.print("Digite o percentual das comissões: ");
			comissao[i] = entrada.nextDouble() / 100;
			System.out.print("Digite o estado do vendedor: ");
			estado[i] = entrada.next();

			if (estado[i].equalsIgnoreCase("SP")) {
				vendedoresSp++;
			}
		}

		System.out.println("");

		for (int i = 0; i < nomeVendedor.length; i++) {
			vlrFinalComissao[i] = (double) totalVendas[i] * comissao[i];

			System.out.println(nomeVendedor[i] + "\t" + totalVendas[i] + "\t" + comissao[i] + "\t" + vlrFinalComissao[i]
					+ "\t" + estado[i]);

			totalComissao += vlrFinalComissao[i];

			if (vlrFinalComissao[i] > maiorComissao) {
				maiorComissao = vlrFinalComissao[i];
				indiceMaiorComissao = i;
			}

			if (i == 0) {
				menorVenda = totalVendas[i];
			}
			if (totalVendas[i] < menorVenda) {
				menorVenda = totalVendas[i];
				indiceMenorTotVendas = i;
			}

		}

		System.out.println("");

		System.out.println("Total Geral das comissões: " + totalComissao);
		System.out.println("Vendedor com a maior comissão: " + nomeVendedor[indiceMaiorComissao]);
		System.out.println("Quantidade de vendedores de SP: " + vendedoresSp);
		System.out.println("Vendedor com menor total de vendas: " + nomeVendedor[indiceMenorTotVendas]);

		entrada.close();
	}
}
