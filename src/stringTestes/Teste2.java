package stringTestes;

public class Teste2 {

	public static void main(String[] args) {
		
		String s = "Socorram-me, subi no ônibus em Marrocos";
		
		String[] testeString = s.split(" ");

		for(int i = testeString.length; i > 0; i--) {
			System.out.print(testeString[i-1] + " ");
		}
		

	}

}
