package fundamentos;

public class TipoString {

	public static void main(String[] args) {
		System.out.println("Olá pessoal".charAt(2));
		
		String s ="Boa tarde";
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		
		System.out.println(s.startsWith("Boa"));//inicia com
		System.out.println(s.toLowerCase().startsWith("boa"));//inicia com
		System.out.println(s.toUpperCase().endsWith("tarde"));//termina com
		
		System.out.println(s.length());//retorna o tamanho
		
		System.out.println(s.equals("boa tarde")); //compara se é igual
		System.out.println(s.toLowerCase().equals("boa tarde"));
		System.out.println(s.equalsIgnoreCase("boa tarde")); //compara igualdade sem considerar maiúsculas e minúsculas
		
		var nome ="Pedro";
		var sobrenome = "Santos";
		var idade = 33;
		var salario = 12345.987;
		
		String maisUmaFrase = "Nome: " + nome + "\nSobrenome: " 
				+ sobrenome + " \nIdade: " + idade + " \nSalario: " + salario + "\n\n";
		System.out.println(maisUmaFrase);
		
		
		System.out.println("Nome: " + nome + "\nSobrenome: " + sobrenome + " \nIdade: " + idade + " \nSalario: " + salario);
		
		System.out.printf("O senhor %s %s tem %d anos e ganha R$%.2f.",
				nome, sobrenome, idade, salario);
		
		
		String frase = String.format("\nO senhor %s %s tem %d anos e ganha R$%.2f.",
				nome, sobrenome, idade, salario);
		System.out.println(frase);
		
		
		System.out.println("Frase qualquer".contains("qual"));
		System.out.println("Frase qualquer".indexOf("qual"));
		System.out.println("Frase qualquer".substring(6, 10));
		

	}

}
