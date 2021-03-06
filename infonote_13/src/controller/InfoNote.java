package controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import model.*;
import model.DAO.ClienteDAO;
import model.DAO.EnderecoDAO;
import model.DAO.FuncionarioDAO;
import model.DAO.NotebookDAO;
import model.DAO.UsuarioDAO;
import util.Ajuda;
import util.Configurador;
import util.GerarSenha;
import util.Teclado;
import util.Utilitarios;

public class InfoNote {
	Usuario user; // n�o esquecer de dar o import neste objeto
	Notebook notebooks[] = new Notebook[10];
	Pedido pedido;
	Cliente cliente;
	Funcionario funcionario;

	boolean logado = false; // Indica se o usu�rio est� logado.
	Configurador config;
	Ajuda ajuda;

	private static final int OPCAOInvalida = -1;
	private static final int LOGIN = 1;
	private static final int CADASTRAR_USUARIO = 2;
	private static final int BUSCAR_NOTEBOOK = 3;
	private static final int INSERIR_NOTEBOOK = 4;
	private static final int REMOVER_NOTEBOOK = 5;
	private static final int VER_CARRINHO = 6;
	private static final int EFETUAR_COMPRA = 7;
	private static final int AJUDA = 8;
	private static final int AREA_ADMINISTRATIVA = 9;
	private static final int SAIR = 10;

	public InfoNote() {
		// Cria objeto de configura��es
		config = new Configurador();
		Locale.setDefault(new Locale(config.getIdioma(), config.getRegiao()));
		// Cria o objeto Ajuda
		ajuda = new Ajuda(config.getArquivoAjuda());

		notebooks[0] = new Notebook(1, "Negativo N22BR", "CPU Intel Core 2 Duo, Mem�ria 2 GB, HD 250 GB", 6, 1200.00,
				"img\\n22br.jpg", "19/05/2011");
		notebooks[1] = new Notebook(2, "Bell B55BR", "CPU Intel I3, Mem�ria 4 GB, HD 500 GB", 3, 1800.00,
				"img\\b55br.jpg", "20/05/2011");
		notebooks[2] = new Notebook(3, "Pompaq P41BR", "CPU Intel I3, Mem�ria 3 GB, HD 320 GB", 1, 1600.00,
				"img\\p41br.jpg", "21/05/2011");
		notebooks[3] = new Notebook(4, "CCF CR71CH", "CPU Intel Dual Core, Mem�ria 2 GB, HD 160 GB", 5, 1100.00,
				"img\\cr71ch.jpg", "10/06/2011");
		notebooks[4] = new Notebook(5, "BradescoTech BD22BR", "CPU AMD Phenon II, Mem�ria 4 GB, HD 500 GB", 2, 1900.00,
				"img\\bd22br.jpg", "10/06/2011");
	}

	public static void main(String[] args) {
		InfoNote info = new InfoNote();
		int opcao = SAIR;
		String opcaoStr;
		do {
			info.mostrarMenu();
			opcaoStr = Teclado.lerTexto("Digite sua op��o: ");
			if (Utilitarios.checkMe(opcaoStr)) {
				opcao = Integer.parseInt(opcaoStr);
			} else {
				opcao = OPCAOInvalida;
			}
			switch (opcao) {
			case LOGIN:
				info.efetuarLogin();
				break;
			case CADASTRAR_USUARIO:
				info.cadastrarUsuario();
				break;
			case BUSCAR_NOTEBOOK:
				//info.buscarNotebook();
				info.mostrarNotebooks();
				break;
			case INSERIR_NOTEBOOK:
				info.manterCarrinho();
				break;
			case REMOVER_NOTEBOOK:
				info.manterCarrinho();
				break;
			case VER_CARRINHO:
				info.manterCarrinho();
				break;
			case EFETUAR_COMPRA:
				if (!info.logado) {
					System.out.println("Efetue login para efetuar compra.");
					break;
				} else {
					info.efetuarCompra();
					break;
				}
			case AJUDA:
				info.ajuda();
				break;
			case OPCAOInvalida:
				System.out.println("Op��o Inv�lida.");
				break;
			case AREA_ADMINISTRATIVA:
				info.areaAdministrativa();
				break;
			case SAIR:
				System.out.println("Sa�da do Sistema");
				break;
			default:
				System.out.println("Op��o inv�lida!");
			}
			Teclado.lerTexto("Pressione uma tecla para continuar...");
		} while (opcao != SAIR);
	}

	public void mostrarMenu() {
		System.out.println("=================================================");
		System.out.println("InfoNote - Se n�o � Info n�o vendemos."
				+ DateFormat.getDateInstance(DateFormat.SHORT).format(new Date()) + " "
				+ DateFormat.getTimeInstance().format(new Date()));
		if (logado == true) {
			System.out.println("Seja bem vindo, " + cliente.getNomeInvertido());
		}
		System.out.println("=================================================");
		System.out.println("1 - Login");
		System.out.println("2 - Cadastrar Cliente");
		System.out.println("3 - Buscar notebook");
		System.out.println("4 - Inserir Notebook no carrinho");
		System.out.println("5 - Remover Notebook no carrinho");
		System.out.println("6 - ver Carrinho");
		System.out.println("7 - Efetuar Compra");
		System.out.println("8 - Ajuda");
		System.out.println("9 - �rea Administrativa");
		System.out.println("10 - Sair");
	}

	public void efetuarLogin() {
		String login, senha;
		login = Teclado.lerTexto("Digite o login: ");
		senha = Teclado.lerTexto("Digite a senha: ");
		cliente = ClienteDAO.buscarPorLoginSenha(login, senha);
		if (cliente != null) {
			logado = cliente.validarLogin(login, senha);
		} else {
			if (logado) {
				System.out.println("Login efetuado com sucesso!");
			} else {
				System.out.println("Usu�rio ou senha inv�lido.");
				int opcao2 = 3;
				do {
					System.out.println("Digite:");
					System.out.println("1 - Para efetuar Login");
					System.out.println("2 - Para cadastrar-se");
					System.out.println("3 - Para sair do sistema");
					opcao2 = Teclado.lerInt("");
					switch (opcao2) {
					case 1:
						efetuarLogin();
						break;
					case 2:
						cadastrarUsuario();
						break;
					case 3:
						System.out.println("Obrigado e volte sempre!");
						System.exit(0);
						break;
					default:
						System.out.println("Op��o inv�lida");
					}
				} while (!logado);
			}
		}
	}

	public void cadastrarUsuario() {
		Usuario usuario;
		Cliente cliente;

		System.out.println("=================================================");
		System.out.println(" InfoNote - Cadastro de Usu�rios. ");
		System.out.println("=================================================");

		String login = Teclado.lerTexto("Login: ");
		String senha = Teclado.lerTexto("Senha: ");
		if (senha.equals("") || senha == null) {
			senha = GerarSenha.gerarSenha();
			System.out.println("Senha gerada: " + senha);
		}
		int tipo = 0;
		String codigoCliente = Teclado.lerTexto("Codigo Cliente: ");
		String nome = Teclado.lerTexto("Nome: ");
		String email = Teclado.lerTexto("E-mail: ");
		String telefone = Teclado.lerTexto("Telefone: ");

		String logradouro = Teclado.lerTexto("Logradouro: ");
		String numero = Teclado.lerTexto("Numero: ");
		String complemento = Teclado.lerTexto("Complemento: ");
		String bairro = Teclado.lerTexto("Bairro: ");
		String cidade = Teclado.lerTexto("Cidade: ");
		String estado = Teclado.lerTexto("Estado: ");
		String cep = Teclado.lerTexto("Cep: ");

		// Endereco endereco = new Endereco(logradouro, numero, complemento, bairro,
		// cidade, estado, cep);

		// Cliente cliente = new Cliente(login, senha, tipo, codigoCliente, nome, email,
		// telefone, endereco);
		// clienteGlobal = cliente;

		usuario = UsuarioDAO.inserir(login, senha, tipo);
		cliente = ClienteDAO.inserir(login, senha, tipo, codigoCliente, nome, email, telefone);
		Endereco endereco = EnderecoDAO.inserir(logradouro, numero, complemento, bairro, cidade, estado, cep,
				codigoCliente);
		System.out.println("=================================================");
		System.out.println(" Usu�rio Cadastrado Com Sucesso. ");
		System.out.println("=================================================");
		System.out.println(cliente);
		System.out.println(endereco);

	}

	public void buscarNotebook() {
		for (int i = 0; i < notebooks.length; i++) {
			if (notebooks[i] != null) {
				System.out.println(notebooks[i].getnumeroNote() + "-----" + notebooks[i].getModelo());
			}
		}
	}

	public void manterCarrinho() {
		System.out.println("manterCarrinho - Em Constru��o");
	}

	@SuppressWarnings("unlikely-arg-type")
	public void inserirNotebook() {
		// L� o notebook escolhido do teclado
		String numeroNote = Teclado.lerTexto("Informe o n�mero do notebook" + " para compra: ");
		// Cria pedido
		if (pedido == null) {
			pedido = new Pedido();
		}
		// Busca notebook selecionado
		Notebook aux = null;
		for (int i = 0; i < notebooks.length; i++) {
			if (notebooks[i] != null && numeroNote.equals(notebooks[i].getnumeroNote())) {
				aux = notebooks[i];
			}
		}
		// Se n�o existir, interrompe
		if (aux == null) {
			return;
		}
		// Cria item
		ItemDePedido item = new ItemDePedido(1, aux.getPrecoUnitario(), aux);
		// Insere item no pedido
		pedido.inserirItem(item);
	}

	public void efetuarCompra() {
		System.out.println("efetuarCompra - Em Constru��o");
	}

	public void ajuda() {
		System.out.println(ajuda.getTexto());
	}

	public void efetuarLoginAdm() {
		String login, senha;
		login = Teclado.lerTexto("Digite o login: ");
		senha = Teclado.lerTexto("Digite a senha: ");
		Funcionario funcionario = FuncionarioDAO.buscarPorLoginSenha(login, senha);
		if (funcionario != null) {
			logado = funcionario.validarLogin(login, senha);
		} else {
			if (logado) {
				System.out.println("Login efetuado com sucesso!");
			} else {
				System.out.println("Usu�rio ou senha inv�lido.");
				System.exit(0);
			}
		}
	}

	public void areaAdministrativa() {
		InfoNote info = new InfoNote();
		efetuarLoginAdm();
		System.out.println("Op��es Administrativas\n");
		System.out.println("1 - Cadastrar Notebook");
		System.out.println("2 - Mostrar Notebooks");
		System.out.println("3 - Editar Notebook");
		System.out.println("4 - Excluir Notebook");
		System.out.println("5 - Sair");
		int opcao = 5;
		do {
			opcao = Teclado.lerInt("Digite sua op��o: ");
			switch (opcao) {
			case 1:
				info.cadastrarNotebook();
				break;
			case 2:
				info.mostrarNotebooks();
				break;
			case 3:
				info.editarNotebook();
				break;
			case 4:
				info.excluirNotebook();
				break;
			case 5:
				System.out.println("Sa�da do Sistema");
				System.exit(0);
				break;
			default:
				System.out.println("Op��o inv�lida!");
			}
			Teclado.lerTexto("Pressione uma tecla para continuar...");
		} while (opcao != 5);
	}

	private void excluirNotebook() {
		// TODO Auto-generated method stub
		
		
			System.out.println("====================================");
			System.out.println(" Excluir de Notebook ");
			System.out.println("====================================");
			String serialNote = Teclado.lerTexto("Informe o SeriaNote do Notebook a ser excluido: ");
			
			Notebook notebook = NotebookDAO.excluir(serialNote);
			//System.out.println(notebook);	
		
	}

	private void editarNotebook() {
		// TODO Auto-generated method stub
		System.out.println("====================================");
		System.out.println(" Editar Notebook ");
		System.out.println("====================================");
		String serialNote = Teclado.lerTexto("Informe o SeriaNote do Notebook a ser atualizado: ");
		String descricao = Teclado.lerTexto("Descricao: ");
		int estoque = Teclado.lerInt("Estoque: ");
		double precoUnitario = Teclado.lerDouble("Pre�o Unit�rio: ");
		String figura = Teclado.lerTexto("Figura: ");
		String dataCadastro = Teclado.lerTexto("Data de Cadastro: ");
		
		
		Notebook notebook = NotebookDAO.atualizar(serialNote, descricao, estoque, precoUnitario, figura, dataCadastro);
		System.out.println("Notebook atualizado com sucesso");
		
	}

	private void mostrarNotebooks() {
		Notebook[] notebook = NotebookDAO.buscarTodos();
		for (int i = 0; i < notebook.length; i++) {
			if (notebook[i] != null) {
				System.out.println(notebook[i].getSerialNote() + "-----"
						+ notebook[i].getModelo() + "-----" + notebook[i].getDescricao() + "-----"
						+ notebook[i].getFigura() + "-----" + notebook[i].getDataCadastro() + "-----"
						+ notebook[i].getEstoque() + "-----" + notebook[i].getPrecoUnitario()	);
				
			}
		}
	}	

	private void cadastrarNotebook() {
		// TODO Auto-generated method stub
		
	
		System.out.println("====================================");
		System.out.println(" Cadastro de Notebook ");
		System.out.println("====================================");
		String serialNote = Teclado.lerTexto("SeriaNote: ");
		String modelo = Teclado.lerTexto("Modelo: ");
		String descricao = Teclado.lerTexto("Descricao: ");
		int estoque = Teclado.lerInt("Estoque: ");
		double precoUnitario = Teclado.lerDouble("Pre�o Unit�rio: ");
		String figura = Teclado.lerTexto("Figura: ");
		String dataCadastro = Teclado.lerTexto("Data de Cadastro: ");
		
		Notebook notebook = NotebookDAO.inserir(serialNote, modelo, descricao,
				estoque, precoUnitario, figura,
				dataCadastro);
		System.out.println(notebook);	
	}
}
