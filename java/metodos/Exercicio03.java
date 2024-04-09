package metodos;

import java.util.Scanner;

public class Exercicio03 {

	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		String[] nomesFuncionarios = new String[4];
		double[] salarios = new double[4];
		int[] tempoServicos = new int[4];

		for (int i = 0; i < nomesFuncionarios.length; i++) {
			System.out.println((i + 1) + "° Funcionário");
			System.out.print("Informe o nome: ");
			nomesFuncionarios[i] = entrada.next();
			System.out.print("Informe o salário: ");
			salarios[i] = entrada.nextDouble();
			System.out.print("Informe o tempo de serviço em anos: ");
			tempoServicos[i] = entrada.nextInt();
		}

		String[] aumentos = verificaAumento(salarios, tempoServicos);
		System.out.println("");
		relatorioFuncionarios(nomesFuncionarios, aumentos);
	}

	public static String[] verificaAumento(double[] salarios, int[] tempoServicos) {
		String[] aumentos = new String[4];

		for (int i = 0; i < aumentos.length; i++) {
			if (tempoServicos[i] > 3 || salarios[i] < 700) {
				aumentos[i] = "Possui direito ao aumento salárial";
			} else {
				aumentos[i] = "Não possui direito ao aumento salárial";
			}
		}

		return aumentos;

	}

	public static void relatorioFuncionarios(String[] nomesFuncionarios, String[] aumentos) {

		System.out.println("--- Relatório Funcionários ---");
		for (int i = 0; i < aumentos.length; i++) {
			System.out.println(nomesFuncionarios[i] + " - " + aumentos[i]);
		}
	}

}
