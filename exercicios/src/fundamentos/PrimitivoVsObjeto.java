package fundamentos;

//Tudo em java � objeto, menos os 8 tipos primitivos
public class PrimitivoVsObjeto {

	public static void main(String[] args) {
		String s = new String("texto");
		s.toUpperCase();
		
		//Wrappers s�o a vers�o objeto dos tipos primitivos!
		int a = 123;
		System.out.println(a);

	}

}
