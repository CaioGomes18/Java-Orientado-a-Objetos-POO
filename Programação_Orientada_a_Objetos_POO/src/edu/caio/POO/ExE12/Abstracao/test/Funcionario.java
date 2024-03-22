package edu.caio.POO.ExE12.Abstracao.test;

//Esse arquivo serve para testar as funções de override

public abstract class Funcionario {
	protected String nome;
	protected double salario;
	
	
	public Funcionario(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
		calculaBonus();
	}
	
	public void calculaBonus() {
		this.salario = this.salario + this.salario * 0.1;
	}
	
	
}
