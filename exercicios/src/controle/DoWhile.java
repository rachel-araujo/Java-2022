package controle;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		//if (...) senten�a; ou {}
		//while(...) sentenca; ou {}
		//for(...; ...; ...) sentenca; ou {}
		
		//do {} while(...); // ser� executada pelo menos 1 vez
		Scanner entrada = new Scanner(System.in);
		
		String texto = "";
		do {
			System.out.println("Voc� precisa falar "
					+ "\nas palavras m�gicas...");
			System.out.print("Quer sair? ");
			texto = entrada.nextLine();
		}while(!texto.equalsIgnoreCase("por favor"));
		
		
		System.out.println("Obrigada!");
		entrada.close();

	}

}
