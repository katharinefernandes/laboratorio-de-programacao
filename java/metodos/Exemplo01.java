package metodos;

import java.util.Scanner;

public class Exemplo01 {

	public static void main(String[] args) {
		// chamada do procedimento
		verifica();
	}

	// MÉTODOS
	// PROCEDIMENTO NÃO TEM RETORNO
	public static void verifica() {

		Scanner entrada = new Scanner(System.in);

		int num = 0;
		
		System.out.print("Informe um número: ");
		num = entrada.nextInt();
		
		if (num % 2 == 1) {
			System.out.println("Ímpar");
		} else {
			System.out.println("Par");
		}
		
		entrada.close();

	}

}
