package contaAbstract;

public class TestaBancos {

	public static void main(String[] args) {
		
		Banco b = new Banco(3);
		
		Conta cc1 = new ContaCorrente();
		cc1.deposita(1000);
		b.adiciona(cc1);
		
		Conta cp2 = new ContaPoupanca();
		cp2.deposita(1000);
		b.adiciona(cp2);
		
		Conta c1 = new ContaCorrente();
		c1.deposita(1000);
		b.adiciona(c1);
		
		System.out.println("Total de contas: " + b.pegaTotalDeContas());
		
		for (int i = 0; i < b.pegaTotalDeContas(); i ++) {
			AtualizadorDeContas adc = new AtualizadorDeContas(0.01);
			adc.roda(b.pegaConta(i));
		}

	}

}
