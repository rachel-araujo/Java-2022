package controle;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		// Crie um programa que recebe 10 valores e ao final imprima o maior número.
		
		Scanner scanner = new Scanner(System.in);
		
		int maiorValor = 0;
		int contador = 0;
		
		do {
			System.out.println("\nDigite um número: ");;
			int valor = scanner.nextInt();
			
			if (valor > maiorValor) {
				maiorValor = valor;
				
			}
			contador++;
		} while(contador != 10);
		
		System.out.printf("O maior valor foi: " + maiorValor);
		scanner.close();

	}

}
