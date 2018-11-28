package model;

public class Usuario {
	int matricula;
	String login;
	String senha;
	String nome;
	String email;
	String telefone;

	/**
	 * @return the matricula
	 */
	public int getMatricula() {
		return matricula;
	}

	/**
	 * @param matricula the matricula to set
	 */
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	/**
	 * @return the login
	 */
	public String getLogin() {
		return login;
	}

	/**
	 * @param login the login to set
	 */
	public void setLogin(String login) {
		this.login = login;
	}

	/**
	 * @return the senha
	 */
	public String getSenha() {
		return senha;
	}

	/**
	 * @param senha the senha to set
	 */
	public void setSenha(String senha) {
		this.senha = senha;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the telefone
	 */
	public String getTelefone() {
		return telefone;
	}

	/**
	 * @param telefone the telefone to set
	 */
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Usuario [matricula=" + matricula + ", login=" + login + ", senha=" + senha + ", nome=" + nome
				+ ", email=" + email + ", telefone=" + telefone + "]";
	}

	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Usuario(int matricula, String login, String senha, String nome, String email, String telefone) {
		super();
		this.matricula = matricula;
		this.login = login;
		this.senha = senha;
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
	}

	public void mostrar() {
		// Mostrar usuário
		System.out.println("\n\nUsuário:\n");
		System.out.println("Matrícula: " + this.matricula);
		System.out.println("Login: " + this.login);
		System.out.println("Senha: " + this.senha);
		System.out.println("Nome: " + this.nome);
		System.out.println("E-mail: " + this.email);
		System.out.println("Telefone: " + this.telefone);
	}

}
