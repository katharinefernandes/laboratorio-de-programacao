package fiap;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int codCliente = 0, codDvd = 0, qtdDvds = 0, cont = 1;
		char tipoDvd;
		double valorLocacao = 0, valorTotal = 0;
		String novaLocacao = "SIM", novoDvd = "SIM";

		while (!novaLocacao.equalsIgnoreCase("SIM") || !novaLocacao.equalsIgnoreCase("S")) {

			System.out.println(cont + "° Locação");
			System.out.println("Informe o código do cliente:");
			codCliente = entrada.nextInt();

			while (!novoDvd.equalsIgnoreCase("SIM") || !novoDvd.equalsIgnoreCase("S")) {

				System.out.println("Informe o código do DVD:");
				codDvd = entrada.nextInt();
				while (codDvd < 1 && codDvd > 20) {
					System.out.println("Informe o código do DVD corretamente");
					codDvd = entrada.nextInt();
				}

				System.out.println("Informe o tipo do DVD:");
				tipoDvd = Character.toUpperCase(entrada.next().charAt(0));
				while (tipoDvd != 'A' && tipoDvd != 'C' && tipoDvd != 'D') {
					System.out.println("Informe o tipo do DVD corretamente");
				}

				if (codDvd <= 10) {
					if (tipoDvd == 'A') {
						valorLocacao = 8;
					} else if (tipoDvd == 'C') {
						valorLocacao = 12;
					} else {
						valorLocacao = 10;
					}
				} else {
					if (tipoDvd == 'A') {
						valorLocacao = 5;
					} else if (tipoDvd == 'C') {
						valorLocacao = 7;
					} else {
						valorLocacao = 9;
					}
				}

				valorTotal += valorLocacao;

				System.out.println("Deseja alugar outro DVD?");
				novoDvd = entrada.next();
			}
		}

		System.out.println("Número de Locações realizadas:" + cont);
		System.out.println("Valor total das locações:" + valorTotal);

	}

}
