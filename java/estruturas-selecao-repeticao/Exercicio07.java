package fiap;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#%");

		int numCriancas = 0, contFeminino = 0, contMasculino = 0, cont24Meses = 0;
		char sexo;
		double tempoVida = 0, pctFeminino = 0, pctMasculino = 0, pct24Meses = 0;

		System.out.println("Informe o número de crianças: ");
		numCriancas = entrada.nextInt();

		for (int i = 0; i < numCriancas; i++) {

			System.out.println("Informe o sexo da criança:");
			sexo = Character.toUpperCase(entrada.next().charAt(0));

			while (sexo != 'M' && sexo != 'F') {
				System.out.println("Informe o sexo corretamente:");
				sexo = Character.toUpperCase(entrada.next().charAt(0));
			}

			if (sexo == 'F') {
				contFeminino++;
			} else {
				contMasculino++;
			}

			System.out.println("Informe o tempo de vida em meses:");
			tempoVida = entrada.nextDouble();

			while (tempoVida < 0) {
				System.out.println("Informe o tempo de vida corretamente:");
				tempoVida = entrada.nextDouble();
			}

			if (tempoVida <= 24) {
				cont24Meses++;
			}
		}

		pctFeminino = (double) contFeminino / numCriancas;
		pctMasculino = (double) contMasculino / numCriancas;
		pct24Meses = (double) cont24Meses / numCriancas;

		System.out.println("Porcentagem de crianças do sexo feminino mortas: " + formatador.format(pctFeminino));
		System.out.println("Porcentagem de crianças do sexo masculino mortas: " + formatador.format(pctMasculino));
		System.out.println("Porcentagem de crianças que viveram 24 meses ou menos: " + formatador.format(pct24Meses));

	}

}
