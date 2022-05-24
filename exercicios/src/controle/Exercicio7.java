package controle;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		// Criar um programa que enquanto estiver recebendo n�meros positivos, 
		//imprime no console a soma dos n�meros inseridos, caso receba um n�mero negativo, 
		//encerre o programa. Tente utilizar a estrutura do while.
		Scanner scanner = new Scanner(System.in);
		
		int somadorDeNumeros = 0;
		int numero = 0;
		
		while (numero >= 0) {
			System.out.println("Digite um numero inteiro (zero ou negativo para sair):");
			numero = scanner.nextInt();
			if (numero >= 0) {
				somadorDeNumeros += numero;
				System.out.printf("\nSoma at� o momento: %d\n", somadorDeNumeros);
			} else {
				System.out.println("Fim do programa. Voc� n�o digitou um n�mero positivo!");
			}
		}
		scanner.close();
	}

}
