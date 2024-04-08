package metodos;

import java.util.Scanner;

public class DesafioSena {

	public static void main(String[] args) {

		Scanner e = new Scanner(System.in);

		int[] apostados = new int[60];
		int[] sorteados = new int[60];
		int numAcertos = 0;
		String resultado = "";

		System.out.println("------ NÚMEROS SORTEADOS ------\n");

		for (int i = 0; i < 6; i++) {
			System.out.print("Informe o " + (i + 1) + "° número sorteado: ");
			sorteados[(e.nextInt() - 1)] = 1;
		}
		
		System.out.println("\n------------------------------------\n");
		
		for (int i = 0; i < 60; i++) {
			
			if(i < 9) {
				System.out.print(sorteados[i] == 1 ? "X  " : "0" + (sorteados[i] + (i+1)) + " ");				
			} else {
				System.out.print(sorteados[i] == 1 ? "X  " : (sorteados[i] + (i+1)) + " ");								
			}
			
			if((i+1) % 10 == 0 && i != 0) {
				System.out.println("");
			}
		}

		System.out.println("\n\n------ NÚMEROS APOSTADOS ------\n");
		

		for (int i = 0; i < 6; i++) {
			System.out.print("Informe o " + (i + 1) + "° número apostado: ");
			apostados[(e.nextInt() - 1)] = 1;
		}
		
		System.out.println("\n------------------------------------\n");

		for (int i = 0; i < 60; i++) {
			
			if(i < 9) {
				System.out.print(apostados[i] == 1 ? "X  " : "0" + (apostados[i] + (i+1)) + " ");				
			} else {
				System.out.print(apostados[i] == 1 ? "X  " : (apostados[i] + (i+1)) + " ");								
			}
			
			if((i+1) % 10 == 0 && i != 0) {
				System.out.println("");
			}
		}

		for (int i = 0; i < 60; i++) {
			if (sorteados[i] == 1 && apostados[i] == 1) {
				numAcertos++;
			}
		}

		if (numAcertos <= 3) {
			resultado = "Usuário não ganhou nada";
		} else if (numAcertos == 4) {
			resultado = "Usuário fez a quadra";
		} else if (numAcertos == 5) {
			resultado = "Usuário fez a quina";
		} else {
			resultado = "Usuário fez a sena";
		}

		System.out.println("\nResultado: Acertos= " + numAcertos + " - " + resultado);

		e.close();

	}

}
