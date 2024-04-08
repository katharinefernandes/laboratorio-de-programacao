package fiap;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("R$ ###0.00");

		String resp = "sim";
		double pe = 0, total = 0, valorFinal = 0;
		int contVendas = 0, cp = 0;

		while (resp.equalsIgnoreCase("sim")) {

			contVendas++;
			System.out.println(contVendas + "° Venda");
			total = 0;

			// itens da venda - preço da etiqueta
			System.out.print("Digite o preço da etiqueta: ");
			pe = entrada.nextDouble();

			while (pe != 0) {
				total += pe;

				System.out.print("Digite o preço da etiqueta: ");
				pe = entrada.nextDouble();
			}
			System.out.println("Valor total: " + total);

			// método de pagamento
			System.out.println("FORMA DE PAGAMENTO");
			System.out.println("1 - A vista, com 10% de desconto");
			System.out.println("2 - A vista cartão, com 5% de desconto");
			System.out.println("3 - 2 x preço normal sem juros");
			System.out.println("4 - 3 x preço normal com juros de 10%");
			System.out.print("Digite a forma de pagamento: ");
			cp = entrada.nextInt();

			while (cp < 1 || cp > 4) {
				System.out.println("Digite a forma de pagamento correta: ");
				cp = entrada.nextInt();
			}

			if (cp == 1) {
				valorFinal = total * 0.9;
				System.out.println("Valor final: " + formatador.format(valorFinal));
			} else if (cp == 2) {
				valorFinal = total * 0.95;
				System.out.println("Valor final: " + formatador.format(valorFinal));
			} else if (cp == 3) {
				valorFinal = total / 2;
				System.out.println("Valor final: 2x" + formatador.format(valorFinal));
			} else {
				valorFinal = (total * 1.1) / 3;
				System.out.println("Valor final: 3x" + formatador.format(valorFinal));
			}

			System.out.print("Deseja cadastrar uma nova venda? ");
			resp = entrada.next();
		}
	}

}
