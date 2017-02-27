package stringTestes;

public class Test {

	public static void main(String[] args) {
		
		String s = "String para testar charAt e lenght";
		
		for (int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i));
		}
		
		String s1 = "Socorram-me, subi no ônibus em Marrocos";
		String s2 = "anotaram a data da maratona";
		
		for (int i = s2.length(); i > 1; i--) {
			System.out.println(s2.charAt(i-1));
		}

	}

}
