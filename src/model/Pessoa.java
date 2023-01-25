package model;

public class Pessoa extends Object{

	private String nome;
	private String cpf;
	private String telefone;
	private String rg;
	private String email;
	
	
    public Pessoa() {	
      super();
   }


    public Pessoa(String nome, String cpf, String telefone, String rg, String email) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.rg = rg;
		this.email = email;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public String getTelefone() {
		return telefone;
	}


	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}


	public String getRg() {
		return rg;
	}


	public void setRg(String rg) {
		this.rg = rg;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}




















}


	


