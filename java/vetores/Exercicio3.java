package vetores;

import java.util.Scanner;

public class Exercicio3 {

	// EXERCÍCIO 3 - LISTA 1 - NOMES 10 PESSOAS
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		String[] nomes = new String[10];
		String nomeBusca = "";
		int n = 0;

		for (int i = 0; i < nomes.length; i++) {
			System.out.print("Digite o " + (i + 1) + "° nome:");
			nomes[i] = entrada.next();
		}

		System.out.println("");
		System.out.print("Digite o nome para procurar no vetor:");
		nomeBusca = entrada.next();
		System.out.println("");

		while (n < nomes.length) {
			if (nomes[n].equalsIgnoreCase(nomeBusca)) {
				System.out.println("Achei");
			}
			n++;
		}

		entrada.close();

	}

}
