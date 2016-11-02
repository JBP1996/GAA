package dia02112016;

import java.util.Scanner;

public class Ciclos {

	public Ciclos() {
		// TODO Auto-generated constructor stub
		enquanto();
		boolean continua = false;
		do{
			continua = false;
			System.out.println("Qual Ciclo deseja?\n 1- While\n 2- Do While\n 3- For");
			int ciclo = (new Scanner(System.in).nextInt());
			switch(ciclo){
			case 1: 
				enquanto(); 
				break;
			case 2:
				fazerEnquanto();
				break;
			case 3:
				de_para();
				break;
			default:
				System.out.println("Não existe nenhum Ciclo com esse numero!");
				continua = true;
				break;
			}
		} while(continua == true);
	}
	
	public void enquanto(){
		int i =0;
		String msg = "All you need is love";
		
		while(i<4){
			System.out.println(msg);
			i++;
		}
	}
	
	public void fazerEnquanto(){
		int i =5;
		String msg = "All you need is love";
		
		do{
			System.out.println(msg);
			i++;
		}while(i<4);
	}

	public void de_para(){
		String msg = "All you need is love";
		
		/*
		 * for
		 * int i=0; -> Inicializa a variavel de controlo
		 * i < 4;	-> Testa a variavel de controlo
		 * i++;		-> Executa a ação
		 */
		
		for(int i=0;i<4;i++){
			System.out.println(msg);
		}
	}
	
}
