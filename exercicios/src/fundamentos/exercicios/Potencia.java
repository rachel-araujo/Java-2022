package fundamentos.exercicios;

import java.util.Scanner;

public class Potencia {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe um valor: ");
		double valor = entrada.nextDouble();

		double quadrado = Math.pow(valor, 2);

		double cubo = Math.pow(valor, 3);

		System.out.println("O valor  digitado ao quadrado �: " + quadrado + "\nO valor digitado ao cubo �: " + cubo);
		
		entrada.close();
	}

}
