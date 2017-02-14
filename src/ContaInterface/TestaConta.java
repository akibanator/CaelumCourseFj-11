package ContaInterface;

public class TestaConta {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente();
		cc.desposita(100);
		System.out.println(cc.getSaldo());
		
		Conta c = cc;
		c.desposita(50);
		System.out.println(c.getSaldo());

	}

}
