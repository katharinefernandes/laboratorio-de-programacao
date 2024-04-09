package metodos;

import java.util.Scanner;

public class Exercicio01 {

	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		
		String nomeHospede = "";
		int tipoAcomodacao = 0;
		int qtdDiarias = 0;
		
		System.out.print("Informe o nome do hóspede: ");
		nomeHospede = entrada.next();
		System.out.print("Informe o tipo de acomodação: ");
		tipoAcomodacao = entrada.nextInt();
		while(tipoAcomodacao > 3 || tipoAcomodacao < 1) {
			System.out.print("Informe um tipo de acomodação válido (1 - Standard | 2 - Luxo | 3 - Super Luxo): ");
			tipoAcomodacao = entrada.nextInt();
		}
		System.out.print("Informe a quantidade de diárias: ");
		qtdDiarias = entrada.nextInt();
		
		
		double valorEstadia = calculaEstadia(tipoAcomodacao, qtdDiarias);
		pagamento(valorEstadia);
	}

	public static double calculaEstadia(int tipoAcomodacao, int qtdDiarias) {

		switch (tipoAcomodacao) {
		case 1:
			return 380 * qtdDiarias;
		case 2:
			return 450 * qtdDiarias;
		default:
			return 560 * qtdDiarias;
		}
	}

	public static void pagamento(double valorEstadia) {
		String formaPagamento = "";
		double valorFinalEstadia = 0;

		System.out.print("Informe o tipo de pagamento: ");
		formaPagamento = entrada.next();
		
		while(!formaPagamento.equalsIgnoreCase("V") && !formaPagamento.equalsIgnoreCase("P")) {
			System.out.print("Informe um tipo de pagamento válido (V - à vista | P - a prazo): ");
			formaPagamento = entrada.next();
			
		}
		
		if (formaPagamento.equalsIgnoreCase("V")) {
			valorFinalEstadia = valorEstadia * 0.9;
		} else {
			valorFinalEstadia = valorEstadia;			
		}

		System.out.println("Valor final da estadia: " + valorFinalEstadia);
	}

}
