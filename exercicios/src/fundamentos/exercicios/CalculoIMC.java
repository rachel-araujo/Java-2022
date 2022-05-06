package fundamentos.exercicios;

import java.util.Scanner;

public class CalculoIMC {
	public static void main(String[] args) {
		//IMC = peso / (altura * altura)
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe seu peso: ");
		double peso = entrada.nextDouble();
		
		System.out.println("\nInforme sua altura: ");
		double altura = entrada.nextDouble();
		
		double imc = peso / Math.pow(altura, 2);
		
		System.out.println("Seu IMC é: " + imc);
		
		entrada.close();
	}

}
