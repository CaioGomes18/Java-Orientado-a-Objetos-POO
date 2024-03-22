package edu.caio.POO.ExE12.Abstracao.DevDojo.ex1.dominio;

public class Desenvolvedor extends Funcionario{

	public Desenvolvedor(String nome, double salario) {
		super(nome, salario);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Desenvolvedor [nome=" + nome + ", salario=" + salario + "]";
	}

	@Override
	public void calculaBonus() {
		this.salario = this.salario + this.salario * 0.2;
		
	}
	
	
}
