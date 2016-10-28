package dia28102016;

import java.util.Scanner;

public class InputOutputBasico {

	public InputOutputBasico() {
		// Instrumento de escrita em consola
		
		System.out.println("Bom dia! \n Como se chama?");
		
		// Cria variável para armazenar nome
		
		String nome;
		nome= (new Scanner(System.in)).nextLine();
		
		System.out.println("Como tem passado " + nome + "?");
	}

}
