package edu.caio.POO.ExE12.Abstracao.test;

public class Zelador extends Funcionario{

	public Zelador(String nome, double salario) {
		super(nome, salario);
		// TODO Auto-generated constructor stub
	}


	@Override
	public void calculaBonus() {
		this.salario = this.salario + this.salario * 0.05;
	}
	
	@Override
	public String toString() {
		return "Zelador [nome=" + nome + ", salario=" + salario + "]";
	}
	
	
}
