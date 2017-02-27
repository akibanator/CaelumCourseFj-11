package castingReferencias;

import java.io.PrintStream;

public class TestaInteger {

	public static void main(String[] args) {
		Integer x1 = new Integer(10);
		Integer x2 = new Integer(10);

		if (x1.equals(x2)) {
			System.out.println("igual");
		} else {
			System.out.println("diferente");
		}
		System.out.println("x1: " + x1);
		System.out.println("x2: " + x2);

		String s1 = "232134";
		int n1 = Integer.parseInt(s1);
		System.out.println(n1);
		String s2 = "asdasdsfs";
		try {
			int n2 = Integer.parseInt(s2);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		
		PrintStream saida = System.out;
		saida.println("ola");
		
	}

}
