package contaFinal;

public class TestaGuardador {

	public static void main(String[] args) {
		
		GuardadorDeObjetos guardadorDeObjetos = new GuardadorDeObjetos();
		ContaCorrente cc = new ContaCorrente();
		guardadorDeObjetos.adicionaObjeto(cc);
		
		//ContaPoupanca cp = (ContaPoupanca) guardadorDeObjetos.pegaObjeto(0);
		
		Integer x = 5;
		int x2 = 2;
		guardadorDeObjetos.adicionaObjeto(x2);
		
		System.out.println(guardadorDeObjetos.pegaObjeto(1));

	}

}
