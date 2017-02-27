package contaFinal;

public class ValorInvalidoException extends RuntimeException {

	public ValorInvalidoException(String msg) {
		super(msg);
	}

	public ValorInvalidoException(double valor) {
		super("Valor inválido: " + valor);
	}

}
