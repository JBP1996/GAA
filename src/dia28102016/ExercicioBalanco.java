package dia28102016;

import java.util.Scanner;

public class ExercicioBalanco {

	public ExercicioBalanco() {
		// TODO Auto-generated constructor stub
		System.out.println("Balanço: "+calcularBalanco()+"€");
	}

	public int receitas(){
		// TODO Auto-generated method stub
		
		System.out.println("Qual foi o total angariado com as quotas?\n");		
		int quotas = (new Scanner(System.in)).nextInt();
		
		System.out.println("Qual foi o total angariado com as receitas do Baile?\n");	
		int recBaile = (new Scanner(System.in)).nextInt();
		
		System.out.println("Qual foi o total angariado com as receitas do Bar?\n");	
		int recBar = (new Scanner(System.in)).nextInt();
		int receitas = quotas + recBaile + recBar;
		return receitas;
	}
	
	public int despesas() {
		// TODO Auto-generated method stub
		
		System.out.println("Qual foi o total despendido com as despesas da Agua?");
		int agua = (new Scanner(System.in)).nextInt();
		System.out.println("Qual foi o total despendido com as despesas da Luz?");
		int	luz = (new Scanner(System.in)).nextInt();
		System.out.println("Qual foi o total despendido com as despesas da Telefone?");
		int telefone = (new Scanner(System.in)).nextInt();
		int despesas = agua + luz + telefone;
		return despesas;
	}
	
	public int calcularBalanco(){
		// TODO Auto-generated method stub
		int balanco = receitas() - despesas();
		return balanco;
	}

}
