package model;

public class ItemDePedido {	
	
	private int qtde;
	private double subtotal;
	private Notebook notebook;
	
	/**
	 * @return the qtde
	 */
	public int getQtde() {
		return qtde;
	}
	/**
	 * @param qtde the qtde to set
	 */
	public void setQtde(int qtde) {
		this.qtde = qtde;
	}
	/**
	 * @return the subtotal
	 */
	public double getSubtotal() {
		return subtotal;
	}
	/**
	 * @param subtotal the subtotal to set
	 */
	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ItemDePedido [qtde=" + qtde + ", subtotal=" + subtotal + ", getQtde()=" + getQtde() + ", getSubtotal()="
				+ getSubtotal() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	public ItemDePedido(int qtde, double subtotal) {
		super();
		this.qtde = qtde;
		this.subtotal = subtotal;
	}
	public ItemDePedido() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void mostrar() {
		System.out.println("\n\nItem de Pedido:\n");
		System.out.println("qtde: " + this.qtde);
		System.out.println("subtotal: " + this.subtotal);

	}
	/**
	 * @return the notebook
	 */
	public Notebook getNotebook() {
		return notebook;
	}
	/**
	 * @param notebook the notebook to set
	 
	public void setNotebook(Notebook notebook) {
		this.notebook = notebook;
	}
	*/
	public ItemDePedido(int qtde, double subtotal, Notebook notebook) {
		super();
		this.qtde = qtde;
		this.subtotal = subtotal;
		this.notebook = notebook;
	}
	
	
}
