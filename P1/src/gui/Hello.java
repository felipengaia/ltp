package gui;

public class Hello {

	public static void main(String[] args) {
		Carro celta = new Carro();
		// este trecho de código não funciona!
		// celta.ano = 2000;
		celta.alteraCor("Prata");
		celta.alteraAno(2014);
		celta.alteraModelo(2015);
	}
}
