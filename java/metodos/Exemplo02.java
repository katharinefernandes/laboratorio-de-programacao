package metodos;

import java.util.Scanner;

public class Exemplo02 {

	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		int operacao = 0;
		
		while(operacao != 5) {
			
			System.out.println("----- MENU -----");
			System.out.println("1 - Adição");
			System.out.println("2 - Subtração"); 
			System.out.println("3 - Multiplicação");
			System.out.println("4 - Divisão");
			System.out.println("5 - Fim do Programa");
			
			System.out.print("Informe a operação desejada: ");
			operacao = entrada.nextInt();
			
			switch (operacao) {
			case 1:
				adicao();
				break;
			case 2:
				subtracao();
				break;
			case 3:
				multiplicacao();
				break;
			case 4:
				divisao();
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

	public static void adicao() {
		int num1 = 0, num2 = 0;

		System.out.println("----- ADIÇÃO -----");
		System.out.print("Informe o primeiro número: ");
		num1 = entrada.nextInt();
		System.out.print("Informe o segundo número: ");
		num2 = entrada.nextInt();

		System.out.println("\nResultado: " + num1 + " + " + num2 + " = " + (num1 + num2) + "\n");

	}

	public static void subtracao() {
		int num1 = 0, num2 = 0;

		System.out.println("----- SUBTRAÇÃO -----");
		System.out.print("Informe o primeiro número: ");
		num1 = entrada.nextInt();
		System.out.print("Informe o segundo número: ");
		num2 = entrada.nextInt();

		System.out.println("\nResultado: " + num1 + " - " + num2 + " = " + (num1 - num2) + "\n");

	}

	public static void multiplicacao() {
		int num1 = 0, num2 = 0;

		System.out.println("----- MULTIPLICAÇÃO -----");
		System.out.print("Informe o primeiro número: ");
		num1 = entrada.nextInt();
		System.out.print("Informe o segundo número: ");
		num2 = entrada.nextInt();

		System.out.println("\nResultado: " + num1 + " x " + num2 + " = " + (num1*num2) + "\n");

	}

	public static void divisao() {
		int num1 = 0, num2 = 0;

		System.out.println("----- DIVISÃO -----");
		System.out.print("Informe o primeiro número: ");
		num1 = entrada.nextInt();
		System.out.print("Informe o segundo número: ");
		num2 = entrada.nextInt();

		System.out.println("\nResultado: " + num1 + " / " + num2 + " = " + (num1/num2) + "\n");

	}

}
