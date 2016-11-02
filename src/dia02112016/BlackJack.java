package dia02112016;

import java.util.Random;
import java.util.Scanner;

public class BlackJack {

	public BlackJack() {
		// TODO Auto-generated constructor stub
	}
	
	public void jogar(){
		String desejaNumero;
		int jogador1, jogador2;
		
		
		System.out.println("Deseja um numero?\n Se Sim escreva 's' se nao escreva 'n'\n");
		desejaNumero = (new Scanner(System.in).next());
		
		Random r = new Random();
		r.nextInt(11+1);
		
		
	}
	

}
