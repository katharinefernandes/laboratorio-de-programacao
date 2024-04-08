package fiap;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#%");

		int id = 0, qtdPessoas = 0, totIdades = 0;
		int totOpcaoA = 0, totOpcaoB = 0, totOpcaoC = 0, totOpcaoD = 0, totOpcaoE = 0;
		double mediaIdades = 0, pctA = 0, pctB = 0, pctC = 0, pctD = 0, pctE = 0;
		char op = 0;

		System.out.println("Informe a idade:");
		id = entrada.nextInt();

		while (id != 0) {

			totIdades += id;
			qtdPessoas++;

			System.out.println("A - Ótimo");
			System.out.println("B - Bom");
			System.out.println("C - Regular");
			System.out.println("D - Ruim");
			System.out.println("E - Péssimo");
			System.out.println("Informe a opinião:");
			op = Character.toUpperCase(entrada.next().charAt(0));

			while (op != 'A' && op != 'B' && op != 'C' && op != 'D' && op != 'E') {
				System.out.println("Informe a opinião corretamente:");
				op = Character.toUpperCase(entrada.next().charAt(0));
			}

			if (op == 'A') {
				totOpcaoA++;
			} else if (op == 'B') {
				totOpcaoB++;
			} else if (op == 'C') {
				totOpcaoC++;
			} else if (op == 'D') {
				totOpcaoD++;
			} else {
				totOpcaoC++;
			}

			System.out.println("Informe a idade:");
			id = entrada.nextInt();
		}

		mediaIdades = (double) totIdades / qtdPessoas;
		pctA = (double) totOpcaoA / qtdPessoas;
		pctB = (double) totOpcaoB / qtdPessoas;
		pctC = (double) totOpcaoC / qtdPessoas;
		pctD = (double) totOpcaoD / qtdPessoas;
		pctE = (double) totOpcaoE / qtdPessoas;

		System.out.println("Quantidade de pessoas que responderam a pesquisa: " + qtdPessoas);
		System.out.println("Média de idade:" + mediaIdades);
		System.out.println("Porcentagem de respostas A:" + formatador.format(pctA));
		System.out.println("Porcentagem de respostas B:" + formatador.format(pctB));
		System.out.println("Porcentagem de respostas C:" + formatador.format(pctC));
		System.out.println("Porcentagem de respostas D:" + formatador.format(pctD));
		System.out.println("Porcentagem de respostas E:" + formatador.format(pctE));

	}

}
