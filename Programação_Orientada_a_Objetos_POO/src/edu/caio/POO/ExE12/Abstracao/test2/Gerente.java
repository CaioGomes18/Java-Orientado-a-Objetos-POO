package edu.caio.POO.ExE12.Abstracao.test2;

public class Gerente extends Funcionario{

	public Gerente(String nome, double salario) {
		super(nome, salario);
	}

	@Override
	public void calculaBonus() {
		this.salario = this.salario + this.salario * 0.3;
	}


	@Override
	public String toString() {
		return "Gerente [nome=" + nome + ", salario=" + salario + "]";
	}
}
