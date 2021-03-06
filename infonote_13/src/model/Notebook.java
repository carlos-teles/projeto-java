package model;

import java.text.NumberFormat;
import java.util.Locale;

public class Notebook {
	private int numeroNote;
	private String serialNote;
	private String modelo;
	private String descricao;
	private int estoque;
	private double precoUnitario;
	private String figura;
	private String dataCadastro;
	private int id_notebook;

	/**
	 * @return the id_notebook
	 */
	public int getId_notebook() {
		return id_notebook;
	}

	/**
	 * @return the numeroNote
	 */
	public int getnumeroNote() {
		return numeroNote;
	}

	/**
	 * @param numeroNote the numeroNote to set
	 */
	public void setnumeroNote(int numeroNote) {
		this.numeroNote = numeroNote;
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

	public Notebook(int numeroNote, String modelo, String descricao, int estoque, double precoUnitario, String figura,
			String dataCadastro) {
		super();
		this.numeroNote = numeroNote;
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
		System.out.println("numeroNote: " + this.numeroNote);
		System.out.println("modelo: " + this.modelo);
		System.out.println("descricao: " + this.descricao);
		System.out.println("estoque: " + this.estoque);
		System.out.println("precoUnitario: " + this.precoUnitario);
		System.out.println("figura: " + this.figura);
		System.out.println("dataCadastro: " + this.dataCadastro);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		final String ENTER = "\n";
		String retValue = "";
		Locale local = new Locale("pt", "BR");
		retValue = "Informa��es sobre Notebook:" + ENTER + "N�mero de S�rie do Notebook: " + numeroNote + ENTER
				+ "Modelo: " + modelo + ENTER + "Descricao: " + descricao + ENTER + "Estoque: " + estoque + ENTER
				+ "Pre�o Unitario: " + NumberFormat.getCurrencyInstance(local).format(this.precoUnitario) + ENTER
				+ "Figura: " + figura + ENTER + "Data de cadastro: " + dataCadastro;
		return retValue;
	}

	public Notebook(int numeroNote, String serialNote, String modelo, String descricao, int estoque, double precoUnitario, String figura,
			String dataCadastro) {
		super();
		this.numeroNote = numeroNote;
		this.serialNote = serialNote;
		this.modelo = modelo;
		this.descricao = descricao;
		this.estoque = estoque;
		this.precoUnitario = precoUnitario;
		this.figura = figura;
		this.dataCadastro = dataCadastro;
	}	
	
	public Notebook( String serialNote, String modelo, String descricao, int estoque, double precoUnitario, String figura,
			String dataCadastro) {
		super();
		this.numeroNote = numeroNote;
		this.serialNote = serialNote;
		this.modelo = modelo;
		this.descricao = descricao;
		this.estoque = estoque;
		this.precoUnitario = precoUnitario;
		this.figura = figura;
		this.dataCadastro = dataCadastro;
	}

	/**
	 * @return the serialNote
	 */
	public String getSerialNote() {
		return serialNote;
	}

	/**
	 * @param serialNote the serialNote to set
	 */
	public void setSerialNote(String serialNote) {
		this.serialNote = serialNote;
	}		
}
