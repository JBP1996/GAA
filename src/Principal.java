
public class Principal {

	public Principal() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Ola Turma!");
		
		int 	quotas = 300,
				recBaile = 200,
				recBar = 250;
		int totalReceitas = quotas + recBaile + recBar;
		int 	agua = 80,
				luz = 60,
				telefone = 70;
		int despesas = agua + luz + telefone;
		System.out.println("Receitas: "+totalReceitas+"€");
		System.out.println("Despesas: "+despesas+"€");
		System.out.println("Balanço: "+(totalReceitas - despesas)+"€");
	}

}
