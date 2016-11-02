package dia02112016;

import java.util.Scanner;

public class Condicionais {

	public Condicionais() {
		// TODO Auto-generated constructor stub
		boolean continua = false;
		do{
			continua = false;
			System.out.println("Qual Comparador deseja?\n 1- Comparador Simples\n 2- Comparador Multivariavel\n");
			int comparador = (new Scanner(System.in).nextInt());
			switch(comparador){
			case 1: 
				comparadorSimples(); 
				break;
			case 2:
				comparadorMultiVariavel();
				break;
			default:
				System.out.println("N�o existe nenhum comparador com esse numero!");
				continua = true;
				break;
			}
		} while(continua == true);
	}
	
	public void comparadorSimples(){
		int num1 = 3;
		int num2 = 4;
		
		/*
		 *  = 	-> Atribui��o
		 *  == 	-> Compara��o (true || false)
		 *  < 	-> Compara��o
		 *  > 	-> Compara��o
		 *  != 	-> Compara��o
		 */
		
		if (num1 == num2){
			System.out.println("Os numeros s�o iguais");
		}
		else if(num1 < num2){
			System.out.println("O num1 � menor que o num2");
		}else{
			System.out.println("O num1 � maior que o num2");
		}
	}
	
	public void comparadorMultiVariavel(){
		int num1 = 9;
		int num2 = 7;
		int num3 = 3;
		int num4 = 8;
		
		// Se o num1 maior que num2 e num3, mostra que � o maior
		/*
		 * & 	-> Concatenador
		 * && 	-> Comparador (e)
		 * || 	-> Comparador (ou)
		 */
		
		if(num1 > num2 && num1 > num3 && num1> num4){
			System.out.println("O num1 � maior de todos");
		}
		
		/*
		 * ! 	-> Comutador de sinal/nega��o (verdadeiro para)
		 * () 	->Agrupam condi��es de verdade
		 */
		
		if(num2> num3 || num1> num4){
			System.out.println("Ganha a Equipa1");
		}else{
			System.out.println("Ganha a Equipa2");
		}
	}

}
