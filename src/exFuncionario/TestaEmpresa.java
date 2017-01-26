package exFuncionario;

public class TestaEmpresa {

	public static void main(String[] args) {

		Empresa empresa = new Empresa();
		empresa.empregados = new Funcionario[10];

		Funcionario f1 = new Funcionario();
		f1.estaNaEmpresa = true;
		empresa.adiciona(f1);

		for (int i = 0; i < 9; i++) {
			Funcionario f = new Funcionario();
			f.salario = 1000 + i * 100;
			empresa.adiciona(f);
		}

		empresa.mostraEmpregados();
		
		int[] arrayTeste = new int[1];
		arrayTeste[0] = 3;

	}

}
