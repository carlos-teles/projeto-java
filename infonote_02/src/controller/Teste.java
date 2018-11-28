package controller;

import model.*;

public class Teste {
	public static void main(String[] args) {

		Usuario user = new Usuario(1, "joseph", "climber", "Joseph Climber", "josephclimber@gmail.com", "2222-3344");
		user.mostrar();

		Endereco end = new Endereco("Centro", "21211-000", "Rio de Janeiro", "Casa", "RJ", "Rua XXXXX", "26");
		end.mostrar();

		Notebook note1 = new Notebook(1234, "Vaio", "Notebook com 16 GB de RAM e 2TB de espaço", 5, 5000.99,
				"note01.jpg", "01/06/2018");
		note1.mostrar();

		Notebook note2 = new Notebook(1234, "Vaio", "Notebook com 16 GB de RAM e 2TB de espaço", 4, 5000.99,
				"note01.jpg", "10/06/2018");
		note2.mostrar();

		Notebook note3 = new Notebook(1234, "Vaio", "Notebook com 16 GB de RAM e 2TB de espaço", 3, 5000.99,
				"note01.jpg", "14/06/2018");
		note3.mostrar();

		Pedido pd1 = new Pedido(123, "01/01/2018", "dinehiro", 22.06, "pedido");
		pd1.mostrar();

		ItemDePedido Idp1 = new ItemDePedido(2, 22.98);
		Idp1.mostrar();

		ItemDePedido Idp2 = new ItemDePedido(1, 12547.98);
		Idp2.mostrar();

	}
}
