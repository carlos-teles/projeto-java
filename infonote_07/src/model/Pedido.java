package model;

public class Pedido {
	private String numeroPedido;
	private String dataEmissao;
	private String formaDePagamento;
	private double valorTotal;
	private String situacao;

	private Endereco enderecoEntrega;
	private ItemDePedido itens[] = new ItemDePedido[10];

	/**
	 * @return the dataEmissao
	 */
	public String getDataEmissao() {
		return dataEmissao;
	}

	/**
	 * @param dataEmissao the dataEmissao to set
	 */
	public void setDataEmissao(String dataEmissao) {
		this.dataEmissao = dataEmissao;
	}

	/**
	 * @return the formaDePagamento
	 */
	public String getFormaDePagamento() {
		return formaDePagamento;
	}

	/**
	 * @param formaDePagamento the formaDePagamento to set
	 */
	public void setFormaDePagamento(String formaDePagamento) {
		this.formaDePagamento = formaDePagamento;
	}

	/**
	 * @return the valorTotal
	 */
	public double getValorTotal() {
		return valorTotal;
	}

	/**
	 * @param valorTotal the valorTotal to set
	 */
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	/**
	 * @return the situacao
	 */
	public String getSituacao() {
		return situacao;
	}

	/**
	 * @param situacao the situacao to set
	 */
	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	@Override
	public String toString() {
		final String ENTER = "\n";
		String retValue = "";
		retValue = "Informações sobre Pedido:" + ENTER + "Número do Pedido: " + numeroPedido + ENTER
				+ "Data de Emissão: " + dataEmissao + ENTER + "Forma de pagamento: " + formaDePagamento + ENTER
				+ "Valor Total: " + valorTotal + ENTER + "Situação: " + situacao + ENTER + "Endereço de Entrega: "
				+ ENTER + "Itens: ";
		for (int i = 0; i < itens.length; i++) {
			retValue += itens[i] + ENTER;
		}
		return retValue;
	}

	public Pedido(String numeroPedido, String dataEmissao, String formaDePagamento, double valorTotal,
			String situacao) {
		super();
		this.numeroPedido = numeroPedido;
		this.dataEmissao = dataEmissao;
		this.formaDePagamento = formaDePagamento;
		this.valorTotal = valorTotal;
		this.situacao = situacao;
	}

	public Pedido(String numeroPedido, String dataEmissao, String formaDePagamento, double valorTotal, String situacao,
			Endereco enderecoEntrega) {
		super();
		this.numeroPedido = numeroPedido;
		this.dataEmissao = dataEmissao;
		this.formaDePagamento = formaDePagamento;
		this.valorTotal = valorTotal;
		this.situacao = situacao;
		this.enderecoEntrega = enderecoEntrega;
	}

	public Pedido() {
		super();
		// TODO Auto-generated constructor stub
	}

	public boolean inserirItem(ItemDePedido item) {
		for (int i = 0; i < itens.length; i++) {
			if (itens[i] == null) {
				itens[i] = item;
				return true;
			}
		}
		return false;
	}

	public void mostrar() {
		System.out.println("\n\nPedido:\n");
		System.out.println("numero: " + this.numeroPedido);
		System.out.println("dataEmissao: " + this.dataEmissao);
		System.out.println("formaDePagamento: " + this.formaDePagamento);
		System.out.println("valorTotal: " + this.valorTotal);
		System.out.println("Situacao: " + this.situacao);
		System.out.println("\n\nItens do Pedido:\n");
		for (int i = 0; i < itens.length; i++) {
			if (itens[i] != null) {
				itens[i].mostrar();
			}
		}
	}

	/**
	 * @return the enderecoEntrega
	 */
	public Endereco getEnderecoEntrega() {
		return enderecoEntrega;
	}

	/**
	 * @param enderecoEntrega the enderecoEntrega to set
	 */
	public void setEnderecoEntrega(Endereco enderecoEntrega) {
		this.enderecoEntrega = enderecoEntrega;
	}

	/**
	 * @return the itens
	 */
	public ItemDePedido[] getItens() {
		return itens;
	}

	/**
	 * @param itens the itens to set
	 * 
	 *              public void setItens(ItemDePedido[] itens) { this.itens = itens;
	 *              }
	 */

	/**
	 * @return the numeroPedido
	 */
	public String getNumeroPedido() {
		return numeroPedido;
	}

	/**
	 * @param numeroPedido the numeroPedido to set
	 */
	public void setNumeroPedido(String numeroPedido) {
		this.numeroPedido = numeroPedido;
	}

}
