package metodos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio10 {

	static Scanner sc = new Scanner(System.in);
	static String[] nomesPilotos = new String[] { "Daniel", "Kimi", "Lewis", "Nico", "Sebastian" };
	static DecimalFormat dp = new DecimalFormat("#%");

	public static void main(String[] args) {

		String[] paises = new String[] { "Bélgica", "Itália", "Cingapura", "Malásia", "Japão" };
		int[] metas = new int[] { 70, 75, 100, 85, 87 };

		relatorioGerencial(paises, metas);
	}

	public static void relatorioGerencial(String[] paises, int[] metas) {

		int[][] pontuacao = carregaPontuacao(paises);
		int[] totalPontuacao = verificaTotalPontuacao(pontuacao);
		String[] analiseMeta = analisaMeta(totalPontuacao, metas);

		System.out.println("\n------ PONTUAÇÃO PILOTOS ------");
		for (int i = 0; i < nomesPilotos.length; i++) {
			System.out.println("Piloto - " + nomesPilotos[i]);
			for (int j = 0; j < paises.length; j++) {
				System.out.println("GP - " + paises[j] + " " + pontuacao[i][j] + " pontos");
			}
			System.out.println("------ TOTAL PONTUAÇÃO ------");

			System.out.println("TOTAL - " + totalPontuacao[i] + " | META - " + metas[i] + " - " + analiseMeta[i]);
			System.out.println("");
		}

		exibeMelhorPontuacacao(pontuacao, paises);
		rankingPilotos(totalPontuacao);
	}

	public static int[][] carregaPontuacao(String[] paises) {

		int[][] pontuacao = new int[5][5];

		// piloto
		for (int l = 0; l < pontuacao.length; l++) {
			System.out.println("Piloto " + nomesPilotos[l]);
			// paises
			for (int c = 0; c < pontuacao[0].length; c++) {
				System.out.print("Pontuação GP " + paises[c] + ": ");
				pontuacao[l][c] = sc.nextInt();
			}
		}

		return pontuacao;

	}

	public static int[] verificaTotalPontuacao(int[][] pontuacao) {

		int[] totalPontuacao = new int[5];
		int totalPontuacaoGeral = 0;

		for (int l = 0; l < pontuacao.length; l++) {
			for (int c = 0; c < pontuacao[0].length; c++) {
				totalPontuacao[l] += pontuacao[l][c];
				totalPontuacaoGeral += pontuacao[l][c];
			}
		}

		System.out.println("\n------ DESEMPENHO PILOTOS ------");
		for (int i = 0; i < 5; i++) {
			System.out.println("Piloto - " + nomesPilotos[i] + " Porcentagem de desempenho - "
					+ dp.format((double) totalPontuacao[i] / totalPontuacaoGeral));
		}

		return totalPontuacao;
	}

	public static String[] analisaMeta(int[] totalPontuacao, int[] metas) {

		String[] analiseMeta = new String[5];

		for (int i = 0; i < totalPontuacao.length; i++) {
			if (totalPontuacao[i] >= metas[i]) {
				analiseMeta[i] = "Atingiu a Meta!";
			} else {
				analiseMeta[i] = "Não Atingiu a Meta!";
			}
		}

		return analiseMeta;

	}

	public static void rankingPilotos(int[] totalPontuacao) {

		System.out.println("\n------ RANKING ------");

		for (int i = 0; i < totalPontuacao.length; i++) {
			for (int o = 0; o < (totalPontuacao.length - 1); o++) {
				if (totalPontuacao[o] < totalPontuacao[o + 1]) {
					int aux = totalPontuacao[o];
					totalPontuacao[o] = totalPontuacao[o + 1];
					totalPontuacao[o + 1] = aux;

					String aux2 = nomesPilotos[o];
					nomesPilotos[o] = nomesPilotos[o + 1];
					nomesPilotos[o + 1] = aux2;
				}
			}
		}

		for (int i = 0; i < totalPontuacao.length; i++) {
			System.out.println((i + 1) + "° Piloto " + nomesPilotos[i] + " | Pontuação Total: " + totalPontuacao[i]);
		}

	}
	
	public static void exibeMelhorPontuacacao(int[][] pontuacao, String[] paises) {
		
		int maiorPontuacao = 0, indicePiloto = 0, indicePais = 0;
		
		// piloto
		for (int l = 0; l < paises.length; l++) {
			// pais
			for (int c = 0; c < paises.length; c++) {
				if(pontuacao[l][c] > maiorPontuacao) {
					maiorPontuacao = pontuacao[l][c];
					indicePiloto = l;
					indicePais = c;
				}
			}
		}
		
		System.out.println("\n---- MELHOR PONTUAÇÃO ------");
		System.out.println("Pontuação - "+maiorPontuacao);
		System.out.println("País      - "+ paises[indicePais]);
		System.out.println("Piloto    - "+ nomesPilotos[indicePiloto]);
	}

}
