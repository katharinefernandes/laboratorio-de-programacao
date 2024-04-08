package metodos;

import java.util.Scanner;

public class Exemplo03 {

	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		int operacao = 0;
		int num1 = 0, num2 = 0;
		
		while(operacao != 5) {
			
			System.out.println("----- MENU -----");
			System.out.println("1 - Adição");
			System.out.println("2 - Subtração"); 
			System.out.println("3 - Multiplicação");
			System.out.println("4 - Divisão");
			System.out.println("5 - Fim do Programa");
			
			System.out.print("Informe a operação desejada: ");
			operacao = entrada.nextInt();
			
			if(operacao > 0 && operacao < 5) {
				System.out.print("Informe o primeiro número: ");
				num1 = entrada.nextInt();
				System.out.print("Informe o segundo número: ");
				num2 = entrada.nextInt();				
			}

			switch (operacao) {
			case 1:
				adicao(num1, num2);
				break;
			case 2:
				subtracao(num1, num2);
				break;
			case 3:
				multiplicacao(num1, num2);
				break;
			case 4:
				divisao(num1, num2);
				break;
			case 5:
				System.out.println("Finalizando Programa...");
				System.exit(0);
				break;
			default:
				System.out.println("Opção inválida");
			}			
		}
		

	}

	public static void adicao(int num1, int num2) {
		System.out.println("\n----- ADIÇÃO -----");
		System.out.println("Resultado: " + num1 + " + " + num2 + " = " + (num1 + num2) + "\n");

	}

	public static void subtracao(int num1, int num2) {
		System.out.println("\n----- SUBTRAÇÃO -----");
		System.out.println("Resultado: " + num1 + " - " + num2 + " = " + (num1 - num2) + "\n");

	}

	public static void multiplicacao(int num1, int num2) {
		System.out.println("\n----- MULTIPLICAÇÃO -----");
		System.out.println("Resultado: " + num1 + " x " + num2 + " = " + (num1*num2) + "\n");

	}

	public static void divisao(int num1, int num2) {
		System.out.println("\n----- DIVISÃO -----");
		System.out.println("Resultado: " + num1 + " / " + num2 + " = " + (num1/num2) + "\n");

	}

}
