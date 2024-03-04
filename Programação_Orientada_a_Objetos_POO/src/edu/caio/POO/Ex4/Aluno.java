package edu.caio.POO.Ex4;
/*Esse pacote Ex4 se refere a getters e setters*/
public class Aluno {
	
	//De acordo com a norma java beans todos os atributos da classe deve ser private
	
	private String nome;
	private int idade;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
}
