package edu.caio.POO.ExE12.Abstracao.test;

public class Bancario extends Funcionario{

	public Bancario(String nome, double salario) {
		super(nome, salario);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void calculaBonus() {
		this.salario = this.salario + this.salario * 0.3;
	}

	@Override
	public String toString() {
		return "Bancario [nome=" + nome + ", salario=" + salario + "]";
	}
	
}
