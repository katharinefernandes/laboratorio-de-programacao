package metodos;

import java.util.Scanner;

public class Exemplo04 {

	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		double media = 0;
		String analise = "";
		media = calcularMedia();

		analise = analiseMedia(media);
		
		System.out.println("\nMédia - " + media + " | Análise - " + analise);
	}

	public static double calcularMedia() {

		double media = 0, gs1 = 0, gs2 = 0;

		System.out.print("Informe a nota da Global Solutions 1: ");
		gs1 = entrada.nextDouble();
		System.out.print("Informe a nota da Global Solutions 2: ");
		gs2 = entrada.nextDouble();

		media = (gs1 + gs2) / 2;
		return media;
	}

	public static String analiseMedia(double media) {

		String analise = "";

		if (media >= 8) {
			analise = "Excelente";
		} else if (media >= 6) {
			analise = "Bom";
		} else {
			analise = "Estudar";
		}

		return analise;

	}

}
