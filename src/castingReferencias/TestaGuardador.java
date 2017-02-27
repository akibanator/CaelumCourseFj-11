package castingReferencias;

public class TestaGuardador {

	public static void main(String[] args) {
		GuardadorDeObjetos guardador = new GuardadorDeObjetos();
		Conta conta = new Conta();
		guardador.adicionaObjeto(conta);
		
		Object object = guardador.pegaObjeto(0);
		//object.getSaldo();
		
		Conta contaResgatada = (Conta) object;
		//contaResgatada.getSaldo();
		System.out.println(contaResgatada.getSaldo());
		
	}
}
