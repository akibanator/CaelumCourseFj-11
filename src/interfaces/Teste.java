package interfaces;

public class Teste {

	public static void main(String[] args) {
		AreaCalculavel retangulo = new Retangulo(3, 2);
		System.out.println(retangulo.calculaArea());
		
		AreaCalculavel quadrado = new Quadrado(2);
		System.out.println(quadrado.calculaArea());
		
		AreaCalculavel circulo = new Circulo(3);
		System.out.println(circulo.calculaArea());

	}

}
