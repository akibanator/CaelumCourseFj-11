package conta;

public class ContaCorrente extends Conta {
	public void atualiza(double taxa) {
		super.atualiza(taxa * 2);
	}
	
	public void deposita(double valor) {
		this.saldo += valor - 0.10;
	}
}
