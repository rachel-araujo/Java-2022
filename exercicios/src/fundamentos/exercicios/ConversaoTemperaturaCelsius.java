package fundamentos.exercicios;

import java.util.Scanner;

public class ConversaoTemperaturaCelsius {
	// (°F - 32) x 5/9 = °C
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		double x = 32;
		double y = 5/9.0;
			
		System.out.println("Informe a temperatura em °F: ");
		double temperatura = entrada.nextDouble();
		
		double conversao = (temperatura - x) * y;
		/* System.out.printf("%.2f ", conversao); */
		System.out.printf("A temperatura em °C é: "+ conversao +"°C");
		entrada.close();
	}

}
