package vetores;

import java.util.Scanner;

public class Exemplo2 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		String[] atletas = new String[3];
		int[] idades = new int[3];
		int c = 0;

		for (int i = 0; i < 3; i++) {
			System.out.print("Digite o nome do atleta:");
			atletas[i] = entrada.next();
			System.out.print("Digite a idade do atleta:");
			idades[i] = entrada.nextInt();
		}

		System.out.println("");
		System.out.println("Os atletas maiores que 21 anos são:");

		while (c < idades.length) {
			if (idades[c] > 21) {
				System.out.print("- Nome: " + atletas[c] + " Idade: " + idades[c]);
			}
			c++;
		}

		entrada.close();
	}

}
