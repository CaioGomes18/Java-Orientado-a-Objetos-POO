package edu.caio.POO.Ex7;

public class Empregado {
	private String nome;
	private String sobrenome;
	private double salarioMensal;
	
	
	public Empregado(String nome, String sobrenome, double salarioMensal) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.salarioMensal = salarioMensal;
	}
	
	public String getNome() 
	{
		return nome;
	}
	
	public String getSobrenome() 
	{
		return sobrenome;
	}
	
	public double getSalarioMensal() 
	{
		return salarioMensal;
	}
	
	
}
