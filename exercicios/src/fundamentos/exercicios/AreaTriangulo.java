package fundamentos.exercicios;

import java.util.Scanner;

public class AreaTriangulo {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o valor da base: ");
		double base = entrada.nextDouble();
		
		System.out.println("\nInforme o valor da altura: ");
		double altura = entrada.nextDouble();
		
		double area = (base * altura)/2;
		
		System.out.println("\nA área do triângulo é: " + area);
		
		entrada.close();
		
		
		
	}

}
