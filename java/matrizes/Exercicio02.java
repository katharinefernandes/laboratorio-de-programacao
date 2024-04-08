package matrizes;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String args[]) {

		Scanner entrada = new Scanner(System.in);

		int[][] numeros = new int[2][2];
		int maiorNumero = 0;
		int resultado = 0;

		for (int i = 0; i < numeros.length; i++) {
			for (int c = 0; c < numeros[0].length; c++) {

				System.out.print("Informe um número [" + (i + 1) + "," + (c + 1) + "]=");
				numeros[i][c] = entrada.nextInt();

				if (numeros[i][c] > maiorNumero) {
					maiorNumero = numeros[i][c];
				}
			}
		}
		
		System.out.println("");

		for (int i = 0; i < numeros.length; i++) {
			for (int c = 0; c < numeros[0].length; c++) {
				resultado = 0;

				resultado = numeros[i][c] *= maiorNumero;
				System.out.print("Resultado - Matriz R[" + (i + 1) + "," + (c + 1) + "]=" + resultado);
				System.out.println("");
			}
		}

		entrada.close();
	}

}
