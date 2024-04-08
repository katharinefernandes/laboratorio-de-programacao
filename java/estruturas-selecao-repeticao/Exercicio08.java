package fiap;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("R$ ###0,00");

		double valorCarro = 0, valorParcela = 0, precoFinal = 0;
		int parcela = 6;
		double pctAcrescimo = 0.03;

		System.out.println("Digite o preço do carro:");
		valorCarro = entrada.nextDouble();

		precoFinal = valorCarro * 0.8;
		System.out.println("O preço final à vista com desconto de 20% é:" + formatador.format(precoFinal));

		for (int i = 0; i < 10; i++) {
			valorParcela = 0;
			precoFinal = 0;

			System.out.println("Acrescimo:" + pctAcrescimo);

			valorParcela = (double) (valorCarro * (1 + pctAcrescimo)) / parcela;
			precoFinal = valorCarro * (1 + pctAcrescimo);

			System.out.println("O preço final parcelado em " + parcela + " x é de " + formatador.format(precoFinal)
					+ " com parcelas de " + formatador.format(valorParcela));

			parcela += 6;
			pctAcrescimo += 0.03;
		}

	}

}
