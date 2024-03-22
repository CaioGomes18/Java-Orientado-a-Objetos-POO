package edu.caio.POO.ExE12.Abstracao.DevDojo.ex1.dominio;

public abstract class Funcionario {
	protected String nome;
	protected double salario;
	
	
	public Funcionario(String nome, double salario) {
	
		this.nome = nome;
		this.salario = salario;
	}

	public abstract void calculaBonus();
	
	
}
