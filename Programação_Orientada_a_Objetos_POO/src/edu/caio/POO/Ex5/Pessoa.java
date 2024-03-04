package edu.caio.POO.Ex5;

public class Pessoa {
	private String nome;
	private String cpf;
	private String endereco;
	
	//No caso temos o contrutor nele podemos colocar varias infomações de uma vez,
	/*porém seja não muito apropriado, apenas alguns atributos precisam de contrutores*/
	//Não abusar dos construtores
	public Pessoa(String cpf, String nome) {
		this.cpf = cpf;
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
}
