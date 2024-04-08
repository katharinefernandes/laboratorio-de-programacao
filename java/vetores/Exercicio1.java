package vetores;

import java.util.Scanner;

public class Exercicio1 {

	// EXERCÍCIO 1 - LISTA 1 - TEMPERATURAS
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		// CRIAR VETOR
		String[] meses = new String[] { "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto",
				"Setembro", "Outubro", "Novembro", "Dezembro" };
		double[] temperaturas = new double[12];
		
		double maiorTemp = 0;
		double menorTemp = 0;
		int indiceMaior = 0;
		int indiceMenor = 0;

		// CARREGAR TEMPERATURAS
		for (int i = 0; i < temperaturas.length; i++) {
			System.out.print("Digite a temperatura do mês de " + meses[i] + ": ");
			temperaturas[i] = entrada.nextDouble();
			
			if(temperaturas[i] > maiorTemp) {
				maiorTemp = temperaturas[i];
				indiceMaior = i;
			}
			
			if(i == 0) {
				menorTemp = temperaturas[i];
				indiceMenor = i;
			} else {
				if(temperaturas[i] < menorTemp) {
					menorTemp = temperaturas[i];
					indiceMenor = i;
				}
			}
		}
		
		System.out.println("Maior temperatura " + maiorTemp + "°C ocorrida em " + meses[indiceMaior]);
		System.out.println("Menor temperatura " + menorTemp + "°C ocorrida em " + meses[indiceMenor]);
		
		entrada.close();
	}

}
