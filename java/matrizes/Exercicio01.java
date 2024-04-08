package matrizes;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String args[]) {

		Scanner entrada = new Scanner(System.in);

		// [codCliente] [qtdMilhagem] [categoria] [bonus] [milhagemAtual]
		int[][] cliente = new int[4][5];
		int milhagemAtual = 0;
		int categoria = 0;

		for (int i = 0; i < cliente.length; i++) {

			System.out.println("Cliente " + (i + 1));

			System.out.print("Digite o código: ");
			cliente[i][0] = entrada.nextInt();
			System.out.print("Digite a Quantidade de Milhagem: ");
			cliente[i][1] = entrada.nextInt();

			System.out.print("Digite o Categoria: ");
			cliente[i][2] = entrada.nextInt();
			while (cliente[i][2] != 1 && cliente[i][2] != 2 && cliente[i][2] != 3) {
				System.out.print("Digite o Categoria corretamente (1-Diamante, 2-Ouro e 3-Prata): ");
				cliente[i][2] = entrada.nextInt();
			}
			System.out.println("");

			milhagemAtual = cliente[i][1];
			categoria = cliente[i][2];

			// acrescentando milhas
			if (categoria == 1) {
				// bônus
				cliente[i][3] = 10000;
				// milhagem atual
				cliente[i][4] = milhagemAtual + 10000;
			} else if (categoria == 2) {
				// bônus
				cliente[i][3] = milhagemAtual + 5000;
				// milhagem atual
				cliente[i][4] = 5000;
			} else {
				// bônus
				cliente[i][3] = 0;
				// milhagem atual
				cliente[i][4] = milhagemAtual;
			}

		}
		
		for (int i = 0; i < cliente.length; i++) {
			System.out.print("Código do Cliente: " + cliente[i][0]);
			System.out.print("\t Quant. Milhagem: " + cliente[i][1]);
			System.out.print("\t Categoria: " + cliente[i][2]);
			System.out.print("\t Bônus: " + cliente[i][3]);
			System.out.print("\t Milhagem Atual: " + cliente[i][4]);
			
			System.out.println("");
		}

		entrada.close();
	}

}
