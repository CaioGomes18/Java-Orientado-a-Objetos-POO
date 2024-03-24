package edu.caio.POO.ExE12.Abstracao.test2;

public abstract class Funcionario extends Pessoa{
	protected String nome;
	protected double salario;
	
	public Funcionario(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
		calculaBonus();
	}
	@Override
	public void imprime() {
		System.out.println("imprimindo...");
		
	}
	
	public abstract void calculaBonus();
}
