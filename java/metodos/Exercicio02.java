package metodos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio02 {

	static Scanner entrada = new Scanner(System.in);
	static DecimalFormat decf = new DecimalFormat("R$ #0.00");

	public static void main(String[] args) {

		int codCaminhao = 0;
		double cargaCaminhao = 0;

		System.out.print("Informe o código do caminhão: ");
		codCaminhao = entrada.nextInt();
		System.out.print("Informe a carga do caminhão em tonelada: ");
		cargaCaminhao = entrada.nextDouble();

		double precoCarga = calculaPrecoCarga(cargaCaminhao);
		double valorImposto = calculaImposto(precoCarga);

		System.out.println("\nCaminhão - " + codCaminhao);
		System.out.println("Valor total trasnportado: " + (decf.format(precoCarga)));
		System.out.println("Preço da carga mais imposto: " + decf.format((precoCarga + valorImposto)));

	}

	public static double calculaPrecoCarga(double cargaCaminhao) {
		cargaCaminhao = cargaCaminhao*1000;
		int codCarga = 0;

		System.out.print("Informe o código da carga: ");
		codCarga = entrada.nextInt();
		while (codCarga < 1 || codCarga > 30) {
			System.out.print("Informe um código de carga válido (de 1 a 30): ");
			codCarga = entrada.nextInt();
		}

		if (codCarga > 21) {
			return 120*cargaCaminhao;
		} else if (codCarga > 11) {
			return 200*cargaCaminhao;
		} else {
			return 280*cargaCaminhao;
		}
	}

	public static double calculaImposto(double precoCarga) {

		int codEstado = 0;

		System.out.print("Informe o código do estado: ");
		codEstado = entrada.nextInt();

		while (codEstado < 1 || codEstado > 4) {
			System.out.print("Informe um código de estado válido (1 | 2 | 3 | 4): ");
			codEstado = entrada.nextInt();
		}

		switch (codEstado) {
		case 1: {
			return precoCarga * 0.25;
		}
		case 2: {
			return precoCarga * 0.20;
		}
		case 3: {
			return precoCarga * 0.15;
		}
		default:
			return precoCarga;
		}
	}

}
