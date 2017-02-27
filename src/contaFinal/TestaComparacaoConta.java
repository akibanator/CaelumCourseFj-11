package contaFinal;

import java.math.BigDecimal;

public class TestaComparacaoConta {

	public static void main(String[] args) {
		
		Conta conta = new ContaCorrente();
		Conta conta2 = new ContaCorrente();
		
		conta.setNumero(1);
		conta2.setNumero(1);
		
		System.out.println(conta.equal(conta2));
		
		BigDecimal bd = new BigDecimal("0.1");
		BigDecimal bd2 = new BigDecimal("0.3");
		
		System.out.println(bd.add(bd2));

	}

}
