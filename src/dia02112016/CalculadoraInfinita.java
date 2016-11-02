package dia02112016;

import java.util.Scanner;

public class CalculadoraInfinita {

	public CalculadoraInfinita() {
		// TODO Auto-generated constructor stub
		/*
		 * A calculadora deve:
		 * 1) Pedir primeiro numero;
		 * 2) Pedir segundo numero;
		 * 3) Pedir a operação;
		 * 4) Apresentar o resultado no ecrã ou sair se o segundo numero for igual 0
		 */
		//calcular();
		calcular2();
	}
	
	public void calcular(){
		int resultado=0;
		int num1=0;
		int num2=0;
		boolean primeira=true;
		
		System.out.println("Qual a operação que deseja efetuar?\n 1- Soma\n 2- Subtracao\n 3- Multiplicacao\n 4- Divisão\n");
		int operacao = (new Scanner(System.in).nextInt());
		
		System.out.println("Digite o primeiro");
		num1 = (new Scanner(System.in).nextInt());
		
		do{
			System.out.println("Digite o segundo numero\n NOTA: Se for igual a 0 - Sair\n");
			num2 = (new Scanner(System.in).nextInt());
			if(primeira == true){
				switch(operacao){
					case 1: 
						resultado=num1 + num2;
						break;
					case 2:
						resultado = num1 - num2;
						break;
					case 3:
						resultado = num1 * num2;
						break;
					case 4:
						resultado = num1 / num2;
						break;
					default:
						System.out.println("Não existe esta operação");
				}
				primeira = false;
			}
			else{
				switch(operacao){
					case 1: 
						resultado=resultado + num2;
						break;
					case 2:
						resultado = resultado - num2;
						break;
					case 3:
						resultado = resultado * num2;
						break;
					case 4:
						resultado = resultado / num2;
						break;
					default:
						System.out.println("Não existe esta operação");
				}
			}
		System.out.println("O resultado é:"+resultado);
		}while(num2 != 0 || primeira == true);
	}
	
	public void calcular2(){
		int resultado=0;
		int num1=0;
		int num2=0;
		boolean primeira=true;
		
		System.out.println("Digite o primeiro");
		num1 = (new Scanner(System.in).nextInt());
		
		do{
			System.out.println("Qual a operação que deseja efetuar?\n 1- Soma\n 2- Subtracao\n 3- Multiplicacao\n 4- Divisão\n");
			int operacao = (new Scanner(System.in).nextInt());
			
			System.out.println("Digite o segundo numero\n NOTA: Se for igual a 0 - Sair\n");
			num2 = (new Scanner(System.in).nextInt());
			
			if(primeira == true){
				
				switch(operacao){
					case 1: 
						resultado=num1 + num2;
						break;
					case 2:
						resultado = num1 - num2;
						break;
					case 3:
						resultado = num1 * num2;
						break;
					case 4:
						resultado = num1 / num2;
						break;
					default:
						System.out.println("Não existe esta operação");
				}
				
				primeira = false;	
			}
			
			else{
				
				switch(operacao){
					case 1: 
						resultado=resultado + num2;
						break;
					case 2:
						resultado = resultado - num2;
						break;
					case 3:
						resultado = resultado * num2;
						break;
					case 4:
						resultado = resultado / num2;
						break;
					default:
						System.out.println("Não existe esta operação");
				}
				
			}
			
		System.out.println("O resultado é:"+resultado);
		
		}while(num2 != 0 || primeira == true);
	}

}
