package metodos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio07 {

	static Scanner entrada = new Scanner(System.in);
	static int[] arrayQuant = new int[5];
	static DecimalFormat formataMonetario = new DecimalFormat("R$ ##0.00");

	public static void main(String[] args) {

		String[] nomesCarros = new String[] { "Classic", "Cobalt", "Onix", "Prisma", "Cruze" };
		double[] precos = new double[] { 33600, 44900, 37790, 43150, 55400 };

		int[][] qtdCarrosVendidos = new int[4][5];

		qtdCarrosVendidos = qtdCarrosVendidos(nomesCarros);
		relatorioGerencial(nomesCarros, precos, qtdCarrosVendidos);

	}

	public static int[][] qtdCarrosVendidos(String[] nomesCarros) {

		int[][] quantidadeVendas = new int[4][5];

		System.out.println("------ CONTROLE DE VENDAS VIGORITO ------");

		for (int l = 0; l < quantidadeVendas.length; l++) {
			System.out.println("Vendas " + (l + 1) + "° TRIMESTRE");
			for (int c = 0; c < quantidadeVendas[0].length; c++) {
				System.out.print("Carro " + nomesCarros[c] + ": ");
				quantidadeVendas[l][c] = entrada.nextInt();
			}
			System.out.println("");
		}

		return quantidadeVendas;

	}

	public static double[] calculaTotalVendas(int[][] qtdCarrosVendidos, double[] precos) {

		double[] totalVendas = new double[5];
		
		for (int c = 0; c < qtdCarrosVendidos[0].length; c++) {
			for (int l = 0; l < qtdCarrosVendidos.length; l++) {
				arrayQuant[c] += qtdCarrosVendidos[l][c];
				totalVendas[c] = arrayQuant[c]*precos[c];
			}
		}
		
		return totalVendas;

	}

	public static void relatorioGerencial(String[] nomesCarros, double[] precos, int[][] qtdCarrosVendidos) {

		double totalVendas = 0;
		double[] totalCarros = calculaTotalVendas(qtdCarrosVendidos, precos);

		System.out.println("------ RELATÓRIO GERENCIAL VIGORITO ------");

		for (int i = 0; i < nomesCarros.length; i++) {
			System.out.println("Carro: " + nomesCarros[i] + "\t Quantidade Geral: " + arrayQuant[i] + "\t Total: "
					+ formataMonetario.format(totalCarros[i]));

			totalVendas += totalCarros[i];

		}

		System.out.println("Total Geral de Vendas: " + formataMonetario.format(totalVendas));

	}

}
