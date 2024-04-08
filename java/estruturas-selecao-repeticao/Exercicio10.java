package fiap;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("R$ ###0.00");

		double vlrTotal = 0, vlrDivida = 0, vlrParcela = 0, jurosDivida = 0;
		int qtdParcelas = 0;

		System.out.println("Informe o valor da dívida:");
		vlrDivida = entrada.nextDouble();

		vlrTotal = vlrDivida;
		vlrParcela = vlrDivida;
		qtdParcelas = 1;

		System.out.println("Total: " + vlrTotal + " Juros: " + jurosDivida + " Número de parcelas " + qtdParcelas
				+ " Valor da Parcela " + formatador.format(vlrParcela));

		qtdParcelas += 2;
		jurosDivida += 10;

		for (int i = 0; i < 4; i++) {

			vlrDivida = (double) (vlrTotal * jurosDivida) / 100;
			vlrDivida = vlrTotal + vlrDivida;
			vlrParcela = (double) vlrDivida / qtdParcelas;

			System.out.println("Total: " + vlrDivida + " Juros: " + jurosDivida + " Número de parcelas " + qtdParcelas
					+ " Valor da Parcela " + formatador.format(vlrParcela));

			qtdParcelas += 3;
			jurosDivida += 5;

		}

	}

}
