package ContaInterface;

interface Conta {
	double getSaldo();
	void desposita(double valor);
	void saca(double valor);
	void atualiza(double taxaSelic);
}
