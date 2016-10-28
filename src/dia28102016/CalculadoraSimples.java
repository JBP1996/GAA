package dia28102016;

import java.util.Scanner;

public class CalculadoraSimples {

	public CalculadoraSimples() {
		// TODO Auto-generated constructor stub
		
		System.out.println("Digite 2 valores:\n");
		int num1 = (new Scanner(System.in)).nextInt();
		int num2 = (new Scanner(System.in)).nextInt();
		System.out.println("Resultado:" +(num1+num2));
	}

}
