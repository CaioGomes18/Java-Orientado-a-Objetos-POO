package edu.caio.POO.ExE13.PPolimorfismo.DEvDojo.teste;

import edu.caio.POO.ExE13.PPolimorfismo.DEvDojo.dominio.Computador;
import edu.caio.POO.ExE13.PPolimorfismo.DEvDojo.dominio.Tomate;
import edu.caio.POO.ExE13.PPolimorfismo.DEvDojo.servico.CalculadoraImposto;

public class ProdutoTeste01 {
	public static void main(String[] args) {
		Tomate tomate = new Tomate("Italiano", 10);
		Computador computador =  new Computador("NUC1087", 11000);
		
		CalculadoraImposto.calculaImpostoComputador(computador);
		System.out.println("--------------------------------");
		CalculadoraImposto.calculaImpostoTomate(tomate);
	}
	
	
}
