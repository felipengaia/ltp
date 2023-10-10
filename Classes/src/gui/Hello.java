package gui;

import java.util.Scanner;

// Classe representa um conjunto de objetos similares
public class Hello {
	
	// TODO: comentar em qual(is) classes é possível acessar 
	// cada atributo/método?
	
	// Atributos =
	// Variáveis que pertencem a uma classe
	// Pode ser acessado por qualquer método da classe
	private int r;
	protected int idadeInt;

	// # FIM DOS ATRIBUTOS
	
	// Métodos =
	// Funções que pertencem a uma classe
	public void leTipos() {
		// declaração de variáveis
		// sempre no início - Boa prática!
		// inicializar as variáveis - Boa prática!
		char a = 97; // a
		int x = 0;
		double z = 0.00;
		
		// entrada de dados
		this.idadeInt = 0;
		Scanner in = new Scanner(System.in);
		// a = in.next().charAt(0);
		// x = in.nextInt();
		// z = in.nextDouble();
		
		// novo: lê um atributo
		// this = acessar a classe
		this.idadeInt = in.nextInt();
		
		// Processamento
		if (x == 10) {
			// verdadeiro
			System.out.print("O valor é 10!");
		}
		
		// saída de dados
		// System.out.println("Olá Mundo! char: " + a);
		// System.out.println("Olá Mundo! int: " + x);
		// System.out.println("Olá Mundo! double: " + z);
		System.out.println("Olá Mundo! int: " + this.idadeInt);
	}
	
	public void verificaInteiro() {
		// declarar um inteiro
		int i = this.idadeInt;
		
		
		// le um inteiro do teclado
		//Scanner in = new Scanner(System.in);
		//i = in.nextInt();

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
		double idade = this.idadeInt;
		
		// le a idade
		Scanner in = new Scanner(System.in);
		//idade = in.nextDouble();
		
		// se idade maior ou igual a 18
		if(idade >= 18.0) {
			System.out.println("maior de idade");
		}
		// else
		else {
			System.out.println("menor de idade");
		}
	}

	// # FIM DOS METODOS
	
	// método estático permite ser chamado sem a necessidade de criar um objeto 
	public static void main(String[] args) {
		float r = 3; // variável (não pertence a uma classe)
		
		// Objeto é uma instância (elemento) de uma classe (conjunto)
		Hello h = new Hello(); // objeto
		h.maiorIdade(); // método do objeto h
		// h.r= 1;	 // atributo do objeto h
		
		// nova instancia com seus atributos e métodos
		Hello t = new Hello();
		// t.r
		
		// nova instancia com seus atributos e metodos
		Hello x = new Hello();
		
		/*
		Hello v[10];
		v[0] = new Hello();
		v[1] = new 
		*/
		
		// chamada dos métodos
		h.leTipos();
		h.verificaInteiro();
		h.maiorIdade();
		
		t.leTipos();
		
		// Associação entre classes
		Pessoa joao = new Pessoa();
		joao.andar();
		joao.dormir();
		joao.peso = 10;
	}
}
