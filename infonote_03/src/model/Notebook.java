package model;

public class Notebook {
	private int numeroLote;
	private String modelo;
	private String descricao;
	private int estoque;
	private double precoUnitario;
	private String figura;
	private String dataCadastro;
	/**
	 * @return the numeroLote
	 */
	public int getNumeroLote() {
		return numeroLote;
	}

	/**
	 * @param numeroLote the numeroLote to set
	 */
	public void setNumeroLote(int numeroLote) {
		this.numeroLote = numeroLote;
	}

	/**
	 * @return the modelo
	 */
	public String getModelo() {
		return modelo;
	}

	/**
	 * @param modelo the modelo to set
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	/**
	 * @return the descricao
	 */
	public String getDescricao() {
		return descricao;
	}

	/**
	 * @param descricao the descricao to set
	 */
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	/**
	 * @return the estoque
	 */
	public int getEstoque() {
		return estoque;
	}

	/**
	 * @param estoque the estoque to set
	 */
	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}

	/**
	 * @return the precoUnitario
	 */
	public double getPrecoUnitario() {
		return precoUnitario;
	}

	/**
	 * @param precoUnitario the precoUnitario to set
	 */
	public void setPrecoUnitario(double precoUnitario) {
		this.precoUnitario = precoUnitario;
	}

	/**
	 * @return the figura
	 */
	public String getFigura() {
		return figura;
	}

	/**
	 * @param figura the figura to set
	 */
	public void setFigura(String figura) {
		this.figura = figura;
	}

	/**
	 * @return the dataCadastro
	 */
	public String getDataCadastro() {
		return dataCadastro;
	}

	/**
	 * @param dataCadastro the dataCadastro to set
	 */
	public void setDataCadastro(String dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public Notebook(int numeroLote, String modelo, String descricao, int estoque, double precoUnitario, String figura,
			String dataCadastro) {
		super();
		this.numeroLote = numeroLote;
		this.modelo = modelo;
		this.descricao = descricao;
		this.estoque = estoque;
		this.precoUnitario = precoUnitario;
		this.figura = figura;
		this.dataCadastro = dataCadastro;
	}
	public Notebook() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void mostrar() {
		System.out.println("\n\nNotebook:\n");
		System.out.println("numeroLote: " + this.numeroLote);
		System.out.println("modelo: " + this.modelo);
		System.out.println("descricao: " + this.descricao);
		System.out.println("estoque: " + this.estoque);
		System.out.println("precoUnitario: " + this.precoUnitario);
		System.out.println("figura: " + this.figura);
		System.out.println("dataCadastro: " + this.dataCadastro);
	}		
}
