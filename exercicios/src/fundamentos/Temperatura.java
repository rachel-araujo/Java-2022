package fundamentos;

public class Temperatura {

	public static void main(String[] args) {
		// (°F - 32) x 5/9 = °C
		
		final double X = 32;
		final double Y = 5/9.0;
		
		double fahrenheit = 70;
		double celsius = (fahrenheit - X) * Y;
		System.out.println(" A temperatura em °C é: " + celsius + "°C");
		
		fahrenheit = 150;
		celsius=celsius = (fahrenheit - X) * Y;
		System.out.println(" A temperatura em °C é: " + celsius + "°C");

	}

}
