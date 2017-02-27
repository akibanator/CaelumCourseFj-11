package contaFinal;

public abstract class Conta {
	private int numero;
	protected double saldo;

	public boolean equal(Object object) {
		Conta outraConta = (Conta) object;
		return this.numero == outraConta.numero;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void deposita(double valor) throws ValorInvalidoException {
		if (valor < 0) {
			throw new ValorInvalidoException(valor);
		} else {
			this.saldo += valor;
		}
	}

	public void saca(double valor) {
		this.saldo -= valor;
	}

	public abstract void atualiza(double taxa);

	public void chamaTeste() {
		double taxa = 0;
		this.atualiza(taxa);
	}
}
