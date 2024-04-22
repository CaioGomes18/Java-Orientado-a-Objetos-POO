package edu.caio.POO.ExE13.PPolimorfismo.DEvDojo.servico;

import edu.caio.POO.ExE13.PPolimorfismo.DEvDojo.dominio.Computador;
import edu.caio.POO.ExE13.PPolimorfismo.DEvDojo.dominio.Tomate;

public class CalculadoraImposto 
{
	public static void calculaImpostoComputador(Computador computador)
	{
		System.out.println("Relatório de imposto do computador");
		double imposto = computador.calcularImposto();
		System.out.println("Imposto do computador " + computador.getNome());
		System.out.println("Valor " + computador.getValor());
		System.out.println("IMposto a ser pago" + imposto);
	}
		
	public static void calculaImpostoTomate(Tomate tomate)
	{
		System.out.println("Relatório de imposto do computador");
		double imposto = tomate.calcularImposto();
		System.out.println("Imposto do computador " + tomate.getNome());
		System.out.println("Valor " + tomate.getValor());
		System.out.println("IMposto a ser pago" + imposto);
	}
}
