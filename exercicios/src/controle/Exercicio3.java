package controle;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		//Criar um programa que receba duas notas parciais, calcular a média final. 
		//Se a nota do aluno for maior ou igual a 7.0 imprime no console "Aprovado", 
		//se a nota for menor que 7.0 e maior do que 4.0 imprime no console "Recuperação", 
		//caso contrário imprime no console "Reprovado".

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Cálculo de média final: ");
		System.out.println("Informe a primeira nota: " );
		double nota1 = scanner.nextDouble();
		
		System.out.println("Informe a segunda nota: " );
		double nota2 = scanner.nextDouble();
		
		double media = (nota1 + nota2)/2;
		
		if(media >=7) {
			System.out.println("Sua média final é "+ media + "- APROVADO");
		}else if(media >= 4){
			System.out.println("Sua média final é " + media + "- RECUPERAÇÃO");
			
		}else {
			System.out.println("Sua média final é "+ media + "- REPROVADO");
		}
		
		scanner.close();
	}

}
