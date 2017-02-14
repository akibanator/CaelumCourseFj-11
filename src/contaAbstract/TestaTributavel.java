package contaAbstract;

public class TestaTributavel {

	public static void main(String[] args) {

		ContaCorrente cc = new ContaCorrente();
		cc.deposita(100);
		System.out.println(cc.calculoTributos());
		
		//testando polimorfismo
		Tributavel t = cc;
		System.out.println(t.calculoTributos());
		
		Tributavel tt = new ContaCorrente();
		System.out.println(tt.calculoTributos());
		
	}

}
