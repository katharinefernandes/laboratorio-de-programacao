package metodos;

import java.util.Scanner;

public class Exemplo05 {

	static Scanner entrada = new Scanner(System.in);
	// variável global/pública
	static int somaIdade = 0;

	public static void main(String[] args) {

		// VETORES LOCAIS
		String[] nomesAtletas = new String[4];
		int[] idadesAtletas = new int[4];

		// carregando os vetores
		for (int i = 0; i < nomesAtletas.length; i++) {
			System.out.print("Informe o nome do " + (i + 1) + "° " + "Atleta: ");
			nomesAtletas[i] = entrada.next();
			System.out.print("Informe a idade do " + (i + 1) + "° " + "Atleta: ");
			idadesAtletas[i] = entrada.nextInt();
			somaIdade += idadesAtletas[i];
		}

		// CHAMADA DA FUNÇÃO
		String[] competir = verifica(idadesAtletas);
		System.out.println("");
		// CHAMADA PROCEDIMENTO
		relatorio(nomesAtletas, idadesAtletas, competir);
	}

	public static String[] verifica(int[] idadesAtletas) {

		String[] competir = new String[4];

		for (int i = 0; i < competir.length; i++) {
			if (idadesAtletas[i] >= 18) {
				competir[i] = "Irá competir";
			} else {
				competir[i] = "Não irá competir";
			}
		}

		return competir;
	}

	public static void relatorio(String[] nomesAtletas, int[] idadesAtletas, String[] competir) {

		System.out.println("-- Relatório Atletas ---");
		for (int i = 0; i < competir.length; i++) {
			System.out.println(nomesAtletas[i] + " - " + idadesAtletas[i] + " - " + competir[i]);
		}
		System.out.println("Média das idades: " + (somaIdade/idadesAtletas.length));

	}

}
