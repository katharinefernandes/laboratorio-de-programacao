package fiap;

import java.util.Scanner;

public class ExercicioExtra {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		String[] times = carregaTimes();
		int[][] gols = carregaGols(times);

		// c
		int[][] relatorio = relatorioDesempenho(times, gols);
		// e
		ordenarPorPontos(relatorio, times);
	}

	public static String[] carregaTimes() {

		System.out.println("----- NOMES TIMES -----");

		String[] times = new String[10];

		for (int i = 0; i < times.length; i++) {
			System.out.print("Informe o nome do " + (i + 1) + "° time: ");
			times[i] = sc.next();
		}

		return times;
	}

	public static int[][] carregaGols(String[] times) {

		System.out.println("------ QUANTIDADE DE GOLS -----");

		int[][] gols = new int[10][10];

		// time 1
		for (int i = 0; i < gols.length; i++) {
			// time 2
			for (int j = 0; j < gols[0].length; j++) {
				if (i != j) {
					System.out.print(
							"RESULTADO DO JOGO ENTRE TIME (<" + times[i] + ">) E O TIME (<" + times[j] + ">) = ");
					gols[i][j] = sc.nextInt();
				}
			}
		}

		return gols;
	}

	public static int calcularVitorias(int[][] gols, int timeIndex) {
		int vitorias = 0;
		for (int j = 0; j < gols[0].length; j++) {
			if(j != timeIndex) {
				if (gols[timeIndex][j] > gols[j][timeIndex]) {
					vitorias++;
				}				
			}
		}
		return vitorias;
	}

	public static int calcularDerrotas(int[][] gols, int timeIndex) {
		int derrotas = 0;
		for (int j = 0; j < gols.length; j++) {
			if(j != timeIndex) {
				if (gols[timeIndex][j] < gols[j][timeIndex]) {
					derrotas++;
				}				
			}
		}
		return derrotas;
	}

	public static int calcularEmpates(int[][] gols, int timeIndex) {
		int empates = 0;
		for (int j = 0; j < gols.length; j++) {
			if(j != timeIndex) {
				if (gols[timeIndex][j] == gols[j][timeIndex]) {
					empates++;
				}				
			}
		}
		return empates;
	}

	public static int calcularPontosGanhos(int vitorias, int empates) {
		return (vitorias * 3) + (empates * 1);
	}

	public static int calcularSaldoGols(int[][] gols, int timeIndex) {
		int saldo = 0;
		for (int j = 0; j < gols.length; j++) {
			if(j != timeIndex) {
				saldo += gols[timeIndex][j];				
			}
		}
		return saldo;
	}

	public static double calcularMediaGols(int saldoGols) {
		return saldoGols / 9;
	}

	public static int[][] relatorioDesempenho(String[] times, int[][] gols) {
		int[][] relatorio = new int[10][2];
		
		System.out.println("------ RELATORIO DE DESEMPENHO ------");
		System.out.println("NOME DA EQUIPE | VITÓRIAS | DERROTAS | EMPATES | PONTOS GANHOS | SALDO DE GOLS");

		for (int i = 0; i < times.length; i++) {
			int vitorias = calcularVitorias(gols, i);
			int empates = calcularEmpates(gols, i);
			int derrotas = calcularDerrotas(gols, i);
			int pontos = calcularPontosGanhos(vitorias, empates);
			int saldoGols = calcularSaldoGols(gols, i);
			relatorio[i][0] = pontos;
			relatorio[i][1] = saldoGols;
			
			System.out.printf("%-15s | %-8d | %-8d | %-7d | %-13d | %-13d\n", times[i], vitorias, derrotas, empates,
					relatorio[i][0], relatorio[i][1]);
		}
		return relatorio;
	}

	public static void ordenarPorPontos(int[][] relatorio, String[] times) {
		for (int i = 0; i < relatorio.length; i++) {
			for (int j = 0; j < (relatorio.length - 1); j++) {
				if (relatorio[j][0] < relatorio[j + 1][0]) {
					int pontos = relatorio[j][0];
					relatorio[j][0] = relatorio[j + 1][0];
					relatorio[j + 1][0] = pontos;

					if (relatorio[j][1] < relatorio[j + 1][1]) {
						int saldo = relatorio[j][1];
						relatorio[j][1] = relatorio[j + 1][1];
						relatorio[j + 1][1] = saldo;
					}

					String time = times[j];
					times[j] = times[j + 1];
					times[j + 1] = time;
				}
			}
		}

		System.out.println("------ CLASSIFICAÇÃO TIMES ------");
		System.out.println("RANKING | NOME DA EQUIPE | PONTOS GANHOS | SALDO DE GOLS | MÉDIA GOLS");
		for (int i = 0; i < times.length; i++) {
			double mediaGols = calcularMediaGols(relatorio[i][1]);
			System.out.printf("%-4d| %-15s | %-13d | %-13d | %.2f\n", i + 1, times[i], relatorio[i][0], relatorio[i][1],
					mediaGols);
		}
	}

}