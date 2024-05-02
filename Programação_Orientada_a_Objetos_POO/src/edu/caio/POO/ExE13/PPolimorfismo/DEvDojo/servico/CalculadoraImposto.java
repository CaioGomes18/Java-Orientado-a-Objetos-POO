package edu.caio.POO.ExE13.PPolimorfismo.DEvDojo.servico;

import edu.caio.POO.ExE13.PPolimorfismo.DEvDojo.dominio.Produto;
import edu.caio.POO.ExE13.PPolimorfismo.DEvDojo.dominio.Tomate;

public class CalculadoraImposto 
{
	public static void calculaImpostoGeral(Produto produto)
	{
		System.out.println("Relatório de imposto do computador");
		double imposto = produto.calcularImposto();
		System.out.println("Imposto do computador " + produto.getNome());
		System.out.println("Valor " + produto.getValor());
		System.out.println("IMposto a ser pago" + imposto);
		
		if(produto instanceof Tomate) {
			Tomate tomate = (Tomate)produto;
			System.out.println(tomate.getDataDeValidade());
		}
		
		
		
		
		/*Abaixo temos duas formas de fazer o casting uma em uma linha e outra de maneira semelhante a primeira*/
		if(produto instanceof Tomate) {
			System.out.println(((Tomate)produto).getDataDeValidade());
		}
		
		if(produto instanceof Tomate) {
			String data = ((Tomate)produto).getDataDeValidade();
			System.out.println(data);
		}
		
	}
}
