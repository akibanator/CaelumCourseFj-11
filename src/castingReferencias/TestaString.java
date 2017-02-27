package castingReferencias;

public class TestaString {

	public static void main(String[] args) {

		String s = "fj11";
		s = s.replaceAll("1", "2");
		System.out.println(s);

		String s1 = "1234567890";
		String s2 = "456";

		if (s1.indexOf(s2) >= 0) {
			System.out.println("s2 contém em s1");
		} else {
			System.out.println("s2 não contém em s2");
		}
		
		String s3 = "1 2 3 4 5 6 7 8 9 0";
		s3 = s3.replaceAll(" ", "");
		System.out.println("s3: " + s3);
		
		String s4 = "";
		if (s4.isEmpty()) {
			System.out.println("s4 está vazia");
		} else {
			System.out.println("s4 não está vazia");
		} 
		
		System.out.println(s3.length());
	}

}
