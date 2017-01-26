package exCasa;

public class TestaCasa {

	public static void main(String[] args) {
		
		Casa casaNova = new Casa();
		casaNova.portas = new Porta[10];
		casaNova.pinta("Azul");
		
		for (int i = 0; i < 6; i++) {
			Porta p = new Porta();
			p.x = 0.8;
			p.y = 2.2;
			p.z = 0.1;
			p.aberta = false;
			casaNova.adicionaPorta(p);
		}
		
		casaNova.portas[1].aberta = true;
		
		System.out.println("Portas abertas: " + casaNova.quantasPortasEstaoAbertas());
		
		System.out.println("Total de portas: " + casaNova.totalDePortas());

	}

}
