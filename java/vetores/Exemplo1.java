package vetores;

import java.util.Scanner;

public class Exemplo1 {

	// times de futebol
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		// CRIA VETOR
		String[] times = new String[5];
		int c = 0;
		
		// CARREGAR VETOR
		for (int i = 0; i < times.length; i++) {
			System.out.print("Digite um time no vetor [" + i + "]: ");
			times[i] = entrada.next();
		}
		
		System.out.println("");

		while(c<times.length) {
			System.out.println((c + 1) + "° time: " + times[c]);			
			c++;
		}

		entrada.close();
	}
}
