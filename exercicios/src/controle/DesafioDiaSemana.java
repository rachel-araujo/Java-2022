package controle;

import java.util.Scanner;

public class DesafioDiaSemana {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe um dia da semana: " + "Domingo, Segunda, Ter�a, Quarta, Quinta ou Sexta: ");

		String dia = entrada.next();

		if ("Domingo".equalsIgnoreCase(dia)) {
			System.out.println("Dia 1");
		} else if (dia.equalsIgnoreCase("Segunda") ) {
			System.out.println("Dia 2");
		} else if ("Ter�a".equalsIgnoreCase(dia)) {
			System.out.println("Dia 3");
		} else if ("Quarta".equalsIgnoreCase(dia)) {
			System.out.println("Dia 4");
		} else if ("Quinta".equalsIgnoreCase(dia)) {
			System.out.println("Dia 5");
		}else if ("Sexta".equalsIgnoreCase(dia)) {
			System.out.println("Dia 6");
		}else if ("S�bado".equalsIgnoreCase(dia)) {
			System.out.println("Dia 7");
		} else {
			System.out.println("Alternativa n�o encontrada!!!");
		}

			entrada.close();

	}

}
