package gui;

import java.util.Scanner;

public class Hello {
	
	public void leTipos() {
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
	
	public void verificaInteiro() {
		// declarar um inteiro
		int i = 0;
		
		// le um inteiro do teclado
		Scanner in = new Scanner(System.in);
		i = in.nextInt();

		// verifica se é par
		if(i % 2 == 0) {
			System.out.print("par ");
		}
		// senao
		else {
			System.out.print("impar ");			
		}
		
		// verifica se é positivo
		if(i > 0) {
			System.out.println("positivo");			
		}
		// verifica se é negativo
		if (i < 0) {
			System.out.println("negativo");
		}
	}
	
	public void maiorIdade() {
		// declarar a variavel e inicializa
		double idade = 0.0;
		
		// le a idade
		Scanner in = new Scanner(System.in);
		idade = in.nextDouble();
		
		// se idade maior ou igual a 18
		if(idade >= 18.0) {
			System.out.println("maior de idade");
		}
		// else
		else {
			System.out.println("menor de idade");
		}
	}

	public static void main(String[] args) {
		Hello h = new Hello();
		h.maiorIdade();	
	}
}
