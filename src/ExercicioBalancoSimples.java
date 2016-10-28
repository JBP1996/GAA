
public class ExercicioBalancoSimples {

	public ExercicioBalancoSimples() {
		// TODO Auto-generated constructor stub
		System.out.println("Ola Turma!");	
		System.out.println("Receitas: "+calcularReceitas()+"€");
		System.out.println("Despesas: "+calcularDespesas()+"€");
		System.out.println("Balanço: "+calcularBalanco()+"€");
	}

	public int calcularReceitas(){
		// TODO Auto-generated method stub
		int 	quotas = 300,
				recBaile = 200,
				recBar = 250;
		int receitas = quotas + recBaile + recBar;
		return receitas;
	}
	
	public int calcularDespesas() {
		// TODO Auto-generated method stub
		int 	agua = 80,
				luz = 60,
				telefone = 70;
		int despesas = agua + luz + telefone;
		return despesas;
	}
	
	public int calcularBalanco(){
		// TODO Auto-generated method stub
		int balanco = calcularReceitas() - calcularDespesas();
		return balanco;
	}

}
