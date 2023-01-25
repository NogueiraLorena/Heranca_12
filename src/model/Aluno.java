package model;

public class Aluno extends Pessoa{

private String curso;
private String matricula;


    public Aluno() {
	    super();
 }


    public Aluno(String nome, String cpf, String telefone, String rg, String email, String curso, String matricula) {
	    super(nome, cpf, telefone, rg, email);
	    this.curso = curso;
	    this.matricula = matricula;
 }


    public String getCurso() {
		return curso;
	}


	public void setCurso(String curso) {
		this.curso = curso;
	}


	public String getMatricula() {
		return matricula;
	}


	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}










































}
