package controle;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// 1. Criar um programa que receba um número e verifique se ele está entre 0 e
		// 10 e é par;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Informe um número:");
		int numero = scanner.nextInt();

		if (numero >= 0 && numero <= 10) {
			if (numero % 2 == 0) {
				System.out.println("O número " + numero + " está entre 0 e 10 e É par.");
			} else {
				System.out.println("O número " + numero + " está entre 0 e 10 e NÃO é par.");
			}
		} else {
			System.out.println("O numero " + numero + " não está entre 0 e 10.");

		}
		scanner.close();

	}

}
