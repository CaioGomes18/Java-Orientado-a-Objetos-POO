package edu.caio.POO.Ex4;
/*Esse pacote Ex4 se refere a getters e setters*/

public class Escola {
	
	public static void main(String []args) {
		Aluno aluno = new Aluno();
		
		aluno.setNome("Caio");
		aluno.setIdade(20);
		
		System.out.println("O aluno " + aluno.getNome() + " Tem " + aluno.getIdade() + " anos ");
	}
	
	
}
