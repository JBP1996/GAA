import java.util.Scanner;

public class Principal {

	public Principal() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcao;
		boolean continua = false;
		
		do{
			continua = false;
			System.out.println("Qual deseja iniciar:\n 1- Exercicio Balanco Simples\n 2- InputBasico\n 3- Calculadora Simples\n 4- Balanco com insercao de valores\n");
			opcao = (new Scanner(System.in).nextInt());
				
			switch(opcao){
				case 1: 
					new ExercicioBalancoSimples();
					break;
				case 2: 
					new dia28102016.InputOutputBasico();
					break;
				case 3:
					new dia28102016.CalculadoraSimples();
					break;
				case 4:
					new dia28102016.ExercicioBalanco();
					break;
				default:
					System.out.println("Não existe nenhuma opcao com esse numero!");
					continua = true;
					break;
			}
		} while(continua == true);
		
	}

}
