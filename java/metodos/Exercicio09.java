package metodos;

import java.text.DecimalFormat;
import java.util.Scanner;

/*  -------------------- TESTES --------------------
	DIEGO | S  | 1  | 420.4 (2,2,2,2) | 14 (1,1,1,1)
	EDSON | D  | 2  | 210.2 (1,1,1,1) | 28 (2,2,2,2) 
	LUCAS | SL | 2  | 420.4 (2,2,2,2) | 42 (3,3,3,3)
	CAROL | SP | 3  | 630.6 (3,3,3,3) | 28 (2,2,2,2)
	MAURO | SL | 4  | 840.8 (4,4,4,4) | 14 (1,1,1,1)
*/

public class Exercicio09 {

	static Scanner sc = new Scanner(System.in);
	static DecimalFormat dc = new DecimalFormat("R$ #00.00");
	
	static String[][] arrayHDados = new String[5][2];
	static int[][] arrayHNumero = new int[5][2];
	

	public static void main(String[] args) {

		String[] arrayNomeProduto = new String[] { "Refrigerante Lata", "Água sem gás", "Água com gás",
				"Suco de Laranja", "Barra de Chocolate" };
		double[] arrayPrecoProduto = new double[] { 2.8, 1.9, 2.1, 2.3, 4.9 };
		String[] arrayNomeServico = new String[] { "Lavanderia", "Sauna", "Almoço", "Café da Manhã", "Jantar" };
		double[] arrayPrecoServico = new double[] { 10.5, 60.8, 42.9, 35.6, 60.4 };

		System.out.println("Controle de Hospedagem Hotel Boa Viagem");
		for (int l = 0; l < arrayHDados.length; l++) {
			// dados cliente
			System.out.print("Nome do Cliente: ");
			arrayHDados[l][0] = sc.next();

			System.out
					.print("Tipo da Acomodação S (Single) - D (Double) - SL (Suite Luxo) - SP (Suite Presidencial): ");
			arrayHDados[l][1] = sc.next();
			while (!arrayHDados[l][1].equalsIgnoreCase("S") && !arrayHDados[l][1].equalsIgnoreCase("D")
					&& !arrayHDados[l][1].equalsIgnoreCase("SL") && !arrayHDados[l][1].equalsIgnoreCase("SP")) {
				System.out.println("Tipo de Acomodação inválido!");
				System.out.print("Informe o valor corretamente: ");
				arrayHDados[l][1] = sc.next();
			}

			// números hospedagem
			arrayHNumero[l][0] = l + 1;
			System.out.println("Número do Quarto: " + arrayHNumero[l][0]);
			System.out.print("Quantidade de Diárias: ");
			arrayHNumero[l][1] = sc.nextInt();

			System.out.println("--------------------------------------------");
		}

		int[][] consumosProdutos = carregaConsumoProdutos(arrayNomeProduto);
		int[][] consumoServicos = carregaConsumoServicos(arrayNomeServico);

		gerarRelatorioGerencial(consumosProdutos, consumoServicos, arrayPrecoProduto, arrayPrecoServico);
	}

	public static int[][] carregaConsumoProdutos(String[] arrayNomeProduto) {

		int[][] consumos = new int[5][5];

		// hospedagem
		for (int l = 0; l < consumos.length; l++) {
			System.out.println("----- HOSPEDAGEM " + (l + 1));
			// consumo
			for (int c = 0; c < consumos[0].length; c++) {
				System.out.print("Informe a quantidade consumida do Produto (" + arrayNomeProduto[c] + "): ");
				consumos[l][c] = sc.nextInt();
			}
		}

		return consumos;
	}

	public static int[][] carregaConsumoServicos(String[] arrayNomeServico) {

		int[][] consumos = new int[5][5];

		// hospedagem
		for (int l = 0; l < consumos.length; l++) {
			System.out.println("----- HOSPEDAGEM " + (l + 1));
			// consumo
			for (int c = 0; c < consumos[0].length; c++) {
				System.out.print("Informe a quantidade consumida do Serviço (" + arrayNomeServico[c] + "): ");
				consumos[l][c] = sc.nextInt();
			}
		}
		return consumos;
	}

	public static double calcValorEstadia(String tipoEstadia, int qtdDiarias) {

		switch (tipoEstadia) {
		case "S":
			return qtdDiarias * 245;
		case "D":
			return qtdDiarias * 280;
		case "SL":
			return qtdDiarias * 310;
		default:
			return qtdDiarias * 400;
		}
	}

	public static void gerarRelatorioGerencial(int[][] consumosProdutos, int[][] consumoServicos,
			double[] arrayPrecoProduto, double[] arrayPrecoServico) {

		double[] totProduto = new double[5];
		double[] totServico = new double[5];

		System.out.println("\n-----------------------------------------------------");
		System.out.println("Relatório Gerencial Hotal Boa Viagem");
		System.out.println("-----------------------------------------------------");

		// hospedagem
		for (int l = 0; l < consumosProdutos.length; l++) {
			// consumo prod
			for (int c = 0; c < consumosProdutos[0].length; c++) {
				totProduto[l] += consumosProdutos[l][c] * arrayPrecoProduto[c];
				totServico[l] += consumoServicos[l][c] * arrayPrecoServico[c];
			}
		}

		for (int l = 0; l < arrayHDados.length; l++) {
			double totEstadia = calcValorEstadia(arrayHDados[l][1], arrayHNumero[l][1]);
			double totGeral = totEstadia + totProduto[l] + totServico[l];

			System.out.println("Número do Quarto: " + arrayHNumero[l][0]);
			System.out.println("Nome do Cliente: " + arrayHDados[l][0]);
			System.out.println("Tipo de Acomodação: " + arrayHDados[l][1]);
			System.out.println("Quantidade de Diárias: " + arrayHNumero[l][1]);
			System.out.println("Valor Total das Diárias: " + dc.format(totEstadia));
			System.out.println("Total Serviço: " + dc.format(totServico[l]));
			System.out.println("Total Produto: " + dc.format(totProduto[l]));
			System.out.println("Total Geral: " + dc.format(totGeral));
			System.out.println("-----------------------------------------------------");			
			
		}

	}

}
