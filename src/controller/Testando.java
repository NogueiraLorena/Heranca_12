package controller;

import model.Aluno;
import model.Pessoa;
import model.Professor;

public class Testando {

	public static void main(String[] args) {
		//estude!

	
Pessoa pessoa = new Pessoa("Joana", "444.440.777-10", "990000000", "95578847", "jo@na.com"); 
	
Professor professor = new Professor("Miguel","335.444.211-55","454545445","55545455",
		"Mi@.com","111111", "Programação");  
	
Aluno aluno = new Aluno("Mauro","235.004.299-15","66645405","22225455",
		"Mar@.com","Programação", "245610");	
	

	
System.out.println("Nome de Pessoa:" +pessoa.getNome());

System.out.println("Nome de Professor:" +professor.getNome());

System.out.println("Nome de Aluno:" +aluno.getNome());

	
System.out.println("\n CPF de Pessoa:" +pessoa.getCpf());

System.out.println("CPF de Professor:" +professor.getCpf());

System.out.println("CPF de Aluno:" +aluno.getCpf());

	
System.out.println("\n Telefone de Pessoa:" +pessoa.getTelefone());

System.out.println("Telefone de Professor:" +professor.getTelefone());

System.out.println("Telefone de Aluno:" +aluno.getTelefone());
	
	
System.out.println("\n RG de Pessoa:" +pessoa.getRg());

System.out.println("RG de Professor:" +professor.getRg());

System.out.println("RG de Aluno:" +aluno.getRg());

	
	
	
	
	}

}

