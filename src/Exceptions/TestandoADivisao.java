package Exceptions;

public class TestandoADivisao {
	
	public static void main (String[] args) {
		int i = 5572;
		try {
		i = i / 0;
		} catch (ArithmeticException e) {
			System.out.println("erro: " + e);
		}
		System.out.println("O resultado " + i);
	}

}
