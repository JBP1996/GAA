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
				System.out.println("Não existe nenhum comparador com esse numero!");
				continua = true;
				break;
			}
		} while(continua == true);
	}
	
	public void comparadorSimples(){
		int num1 = 3;
		int num2 = 4;
		
		/*
		 *  = 	-> Atribuição
		 *  == 	-> Comparação (true || false)
		 *  < 	-> Comparação
		 *  > 	-> Comparação
		 *  != 	-> Comparação
		 */
		
		if (num1 == num2){
			System.out.println("Os numeros são iguais");
		}
		else if(num1 < num2){
			System.out.println("O num1 é menor que o num2");
		}else{
			System.out.println("O num1 é maior que o num2");
		}
	}
	
	public void comparadorMultiVariavel(){
		int num1 = 9;
		int num2 = 7;
		int num3 = 3;
		int num4 = 8;
		
		// Se o num1 maior que num2 e num3, mostra que é o maior
		/*
		 * & 	-> Concatenador
		 * && 	-> Comparador (e)
		 * || 	-> Comparador (ou)
		 */
		
		if(num1 > num2 && num1 > num3 && num1> num4){
			System.out.println("O num1 é maior de todos");
		}
		
		/*
		 * ! 	-> Comutador de sinal/negação (verdadeiro para)
		 * () 	->Agrupam condições de verdade
		 */
		
		if(num2> num3 || num1> num4){
			System.out.println("Ganha a Equipa1");
		}else{
			System.out.println("Ganha a Equipa2");
		}
	}

}
