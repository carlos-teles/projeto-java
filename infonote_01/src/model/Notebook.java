package model;

public class Notebook {
	int numeroLote;
	String modelo;
	String descricao;
	int estoque;
	double precoUnitario;
	String figura;
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
	String dataCadastro;
}
