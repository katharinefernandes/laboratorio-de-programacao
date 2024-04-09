package metodos;

import java.util.Scanner;

public class Exercicio04 {

	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		
		
		
	
	}
	
	public static char recebeSexo() {
		char sexo = 0;
		System.out.println("Informe o sexo:");
		sexo = Character.toUpperCase(entrada.next().charAt(0));
		
		return sexo;
	}
	
	
	public static char recebeCorOlhos() {
		char corOlhos = 0;
		
		System.out.println("Informe a cor dos olhos: ");
		corOlhos = Character.toUpperCase(entrada.next().charAt(0));
		
		while(corOlhos != 'L' && corOlhos != 'P' && corOlhos != 'C') {
			System.out.println("Informe");
		}
		
		return 0;
	}
	
	public static char recebeCorCabelo() {
		
		return 0;
	}
	

}
