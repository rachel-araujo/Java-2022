package fundamentos.operadores;

public class DesafioLogicos {
	public static void main(String[] args) {
		//Trabalho na ter�a (V ou F)
		//Trabalho na quinta (V ou F)
		
		boolean trabalho1 = true;
		boolean trabalho2 = true;
		
		boolean comprouTV50 = trabalho1 && trabalho2;
		boolean comprouTV32 = trabalho1 ^ trabalho2;
		boolean comprouSorvete = trabalho1 || trabalho2;
		//Operador Un�rio
		boolean maisSaudavel = !comprouSorvete;
		
		System.out.println("Comprou Tv 50\"? " + comprouTV50);
		System.out.println("Comprou Tv 32\"? " + comprouTV32);
		System.out.println("Comprou Tv 32\"Sorvete? " + comprouSorvete);
		
		System.out.println("Mais saud�vel? " + maisSaudavel);
		
		
	}

}
