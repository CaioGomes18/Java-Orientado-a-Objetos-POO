package edu.caio.POO.ExE13.PPolimorfismo.DEvDojo.teste;

import edu.caio.POO.ExE13.PPolimorfismo.DEvDojo.dominio.Computador;
import edu.caio.POO.ExE13.PPolimorfismo.DEvDojo.dominio.Produto;
import edu.caio.POO.ExE13.PPolimorfismo.DEvDojo.dominio.Tomate;
import edu.caio.POO.ExE13.PPolimorfismo.DEvDojo.servico.CalculadoraImposto;


public class ProdutoTeste03 {
	
	
	public static void main(String[] args) {
		Produto produto = new Computador("Ryzen", 8000);
		
		Tomate tomate = new Tomate("Italiano", 5);
		tomate.setDataDeValidade("25/09/2024");
		
		CalculadoraImposto.calculaImpostoGeral(tomate);
	}
}
