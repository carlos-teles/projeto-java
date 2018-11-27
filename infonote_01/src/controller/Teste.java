package controller;

import model.*;

public class Teste {
	public static void main(String[] args) {
		
		Usuario user = new Usuario();
		user.setEmail("cteles@emb.com.br");
		user.setLogin("cteles");
		user.setMatricula(000001);
		user.setNome("Carlos Teles");
		user.setSenha("1234");
		user.setTelefone("2121-2121");
		System.out.println(user.toString());
		
		Endereco end = new Endereco();
		end.setBairro("Centro");
		end.setCep("21211-000");
		end.setCidade("Rio de Janeiro");
		end.setComplemento("Casa");
		end.setEstado("RJ");		
		end.setLogradouro("Rua XXXXX");
		end.setNumero("26");
		System.out.println(end.toString());
		
		Notebook note1 = new Notebook();
		note1.setDataCadastro("01/06/2018");
		note1.setDescricao("Notebook com 16 GB de RAM e 2TB de espaço");
		note1.setEstoque(5);
		note1.setFigura("note01.jpg");
		note1.setModelo("Vaio");
		note1.setNumeroLote(1234);
		note1.setPrecoUnitario(5000.99);
		System.out.println(note1.toString());
		
		Notebook note2 = new Notebook();
		note2.setDataCadastro("01/06/2018");
		note2.setDescricao("Notebook com 16 GB de RAM e 2TB de espaço");
		note2.setEstoque(5);
		note2.setFigura("note01.jpg");
		note2.setModelo("Vaio");
		note2.setNumeroLote(1234);
		note2.setPrecoUnitario(5000.99);
		System.out.println(note2.toString());
		
		Notebook note3 = new Notebook();
		note3.setDataCadastro("01/06/2018");
		note3.setDescricao("Notebook com 16 GB de RAM e 2TB de espaço");
		note3.setEstoque(5);
		note3.setFigura("note01.jpg");
		note3.setModelo("Vaio");
		note3.setNumeroLote(1234);
		note3.setPrecoUnitario(5000.99);		
		System.out.println(note3.toString());
		
		Pedido pd1 = new Pedido();
		pd1.setDataEmissao("01/01/2018");
		pd1.setFormaDePagamento("dinheiro");
		pd1.setNumero(123);
		pd1.setSituacao("pedido");
		pd1.setValorTotal(22.66);
		System.out.println(pd1.toString());		

		
		ItemDePedido Idp1 = new ItemDePedido();
		Idp1.setQtde(2);
		Idp1.setSubtotal(22.98);
		System.out.println(Idp1.toString());

		ItemDePedido Idp2 = new ItemDePedido();
		Idp2.setQtde(1);
		Idp2.setSubtotal(98.75);
		System.out.println(Idp2.toString());
		
	}
}
