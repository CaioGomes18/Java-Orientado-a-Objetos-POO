package edu.caio.POO.ExE12.Abstracao.test2;

public class Dev extends Funcionario{

	public Dev(String nome, double salario) {
		super(nome, salario);
	}

	@Override
	public void calculaBonus() {
		this.salario = this.salario + this.salario * 0.2;		
	}

	@Override
	public String toString() {
		return "Dev [nome=" + nome + ", salario=" + salario + "]";
	}
	
}
