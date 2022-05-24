package controle;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// Criar um programa que receba um número e diga se ele é um número primo.
		Scanner scanner = new Scanner(System.in);
		System.out.println("\nDigite um número para verificar se é primo: ");
		
		int numero = scanner.nextInt();
		int contadorDeDivisores = 0;
		
		
		for (int i = 1; i <= numero; i++) {
			if (numero % i == 0) {
				contadorDeDivisores++;
			}
		}
		
		if (contadorDeDivisores == 2) {
			System.out.println("\nO numero " + numero + " é primo.");
		}else {
			System.out.println("\nO numero " + numero +  " não é primo.");
		}
		
		scanner.close();

	}

}
