package matrizes;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String args[]) {

		Scanner entrada = new Scanner(System.in);

		String[] cidades = new String[] { "CAMPINAS", "BAURU", "SOROCABA", "ATIBAIA", "SANTOS" };
		double[][] distancias = new double[5][5];
		double consumoPercurso = 0;

		for (int l = 0; l < distancias.length; l++) {
			for (int c = 0; c < distancias[0].length; c++) {
				if (l != c) {
					System.out.print("Informe a distância entre a cidade (" + cidades[l] + ") e a cidade (" + cidades[c]
							+ "): ");
					distancias[l][c] = entrada.nextDouble();
				} else {
					distancias[l][c] = 0;
				}
			}
		}

		System.out.println("");
		System.out.println("---------- PERCURSOS INFERIORES A 250KM ----------");
		for (int l = 0; l < distancias.length; l++) {
			for (int c = 0; c < distancias[0].length; c++) {
				if (l != c && distancias[l][c] < 250) {
					System.out.println("-- Distância: " + distancias[l][c] + "\t km - entre a cidade (" + cidades[l]
							+ ") e (" + cidades[c] + ")");
				}
			}
		}

		System.out.println("");
		System.out.println("---------- CONSUMOS POR PERCURSOS ----------");
		for (int l = 0; l < distancias.length; l++) {
			for (int c = 0; c < distancias[0].length; c++) {

				if (l != c) {
					consumoPercurso = distancias[l][c] / 20;
					System.out.println("Consumo entre a cidade (" + cidades[l] + ") e (" + cidades[c] + "): \t"
							+ consumoPercurso + " Litros");
				}
			}
		}

		System.out.println(" ");
		System.out.println("---------- MATRIZ PREENCHIDA -----------");
		for (int l = 0; l < distancias.length; l++) {
			for (int c = 0; c < distancias[0].length; c++) {
				System.out.print(distancias[l][c] + "\t");
			}
			System.out.println("");
		}
		entrada.close();
	}

}
