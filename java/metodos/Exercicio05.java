package metodos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio05 {

	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		
		DecimalFormat formtaInteiro = new DecimalFormat("0");

		double[] numeros = numerosCarregar();
		numeros = ordenaNúmeros(numeros); // parâmetro real
		
		//EXIBIR NÚMEROS CRESCENTE
		System.out.println("\n---NÚMEROS ORDENADOS - ORDEM CRESCENTE---");
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(formtaInteiro.format(numeros[i]) + ((i != 4) ?  ", " : ""));			
		}
	}

	public static double[] numerosCarregar() {

		double[] numeros = new double[5];

		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Informe o " + (i + 1) + "° número: ");
			numeros[i] = entrada.nextDouble();
		}

		return numeros;
	}

	// método com retorno e parâmetro -> FUNÇÃO
	public static double[] ordenaNúmeros(double[] numeros) {// parâmetro formal

		double aux = 0;

		// tamanho do vetor a ser analisado
		for (int i = 0; i < numeros.length; i++) {
			// quantidade de comparações necessárias
			
			// É possível mover um vetor com nomes tmb o 
			// if irá utilizar sempre o vetor com o números
			for (int j = 0; j < 4; j++) {
				if (numeros[j] > numeros[(j + 1)]) {
					aux = numeros[j];
					numeros[j] = numeros[j + 1];
					numeros[j + 1] = aux;
				}
			}
		}

		return numeros;

	}

}
