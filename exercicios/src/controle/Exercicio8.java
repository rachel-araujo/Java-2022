package controle;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		// Criar um programa que receba uma palavra e 
		//imprime no console letra por letra
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite uma palavra: ");
		String palavra = scanner.nextLine();
		
		char letras[] = palavra.toCharArray();
		
		for (int i = 0; i < letras.length; i++) {
			System.out.println(letras[i]);
			
		}
		
		scanner.close();
	}

}
