package fundamentos;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {
		System.out.println("A seguir informe seus 3 últimos salários: ");
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Primeiro Salário: ");
		String salario1 = entrada.next().replace(",", ".");
		
		System.out.print("Segundo Salário: ");
		String salario2 = entrada.next().replace(",", ".");
		
		System.out.print("Terceiro Salário: ");
		String salario3 = entrada.next().replace(",", ".");
		
		
		
		 double s1 = Double.parseDouble(salario1); 
		 double s2 = Double.parseDouble(salario2);
		 double s3 = Double.parseDouble(salario3);
		 
		 double media = (s1+s2+s3)/3;
		 
		 System.out.println("Sua média salarial é: "+ media);
		
		
		entrada.close();

	}

}
