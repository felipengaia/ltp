package gui;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		// declaração de variáveis
		// sempre no início - Boa prática!
		// inicializar as variáveis - Boa prática!
		char a = 97; // a
		int x = 0;
		double z = 0.00;
		
		// entrada de dados
		Scanner in = new Scanner(System.in);
		a = in.next().charAt(0);
		x = in.nextInt();
		z = in.nextDouble();

		// Processamento
		if (x == 10) {
			// verdadeiro
			System.out.print("O valor é 10!");
		}

		
		// saída de dados
		System.out.println("Olá Mundo! char: " + a);
		System.out.println("Olá Mundo! int: " + x);
		System.out.println("Olá Mundo! double: " + z);
	}
}
