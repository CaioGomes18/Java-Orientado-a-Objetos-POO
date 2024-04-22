package edu.caio.POO.ExE13.PPolimorfismo.DEvDojo.dominio;

public class Computador extends Produto{
	public static final double IMPOSTO_POR_CENTO = 0.21;
	
	public Computador(String nome, double valor) {
		super(nome, valor);
	}
	
	public double calcularImposto() {
		System.out.println("Calulando o imposto do computador");
		return this.valor * IMPOSTO_POR_CENTO;
	}
	
	
}
