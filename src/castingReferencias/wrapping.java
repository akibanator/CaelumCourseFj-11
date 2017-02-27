package castingReferencias;

public class wrapping {
	public static void main(String[] args) {

		int i = 5;
		Integer x = new Integer(5);

		int numeroVolta = x.intValue();
		System.out.println(numeroVolta);

		Object o = 5;

		String palavra = "fj11";
		String outra = palavra.toUpperCase();
		System.out.println(outra);
		
		String palavra2 = "fj11";
		palavra2 = palavra2.toUpperCase();
		palavra2 = palavra2.replace("1", "2");
		System.out.println(palavra2);
		
		String qtdString = "abcdefghijkl";
		System.out.println(qtdString.length());
		int indice = qtdString.indexOf("c");
		System.out.println(indice);
		
		String s2 = "sadhausdudfj11dhauadsh";
		String s = "fj11";
		s = s.replace("1", "2");
		System.out.println(s);
		
		System.out.println(s.indexOf(s));
		if (s2.contains(s)) {
			System.out.println("verdade");
		} else {
			System.out.println("mentira");
		}
		
		int[] arrayQtd = new int[10];
		
		for (int j = 0; j > 10; j++) {
			arrayQtd[j] = j;
			System.out.println(arrayQtd[j]);
		}

	}

}
