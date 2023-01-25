package model;

public class Professor extends Pessoa{

private String matricula;
private String segmento;


    public Professor() {
	     super();
   }


	public Professor(String nome, String cpf, String telefone, String rg, String email, String matricula,
			String segmento) {
		super(nome, cpf, telefone, rg, email);
		this.matricula = matricula;
		this.segmento = segmento;
	}


	
	
	
	
	
	
	public String getMatricula() {
		return matricula;
	}


	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}


	public String getSegmento() {
		return segmento;
	}


	public void setSegmento(String segmento) {
		this.segmento = segmento;
	}


	


     
    























































}
