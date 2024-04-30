package edu.caio.POO.ExE13.PPolimorfismo.DEvDojo.teste;

import edu.caio.POO.ExE13.PPolimorfismo.DEvDojo.dominio.Computador;
import edu.caio.POO.ExE13.PPolimorfismo.DEvDojo.dominio.Produto;

public class ProdutoTeste02 {
	public static void main(String[] args) {
		Produto produto = new Computador("Ryzen 9", 3000);
		System.out.println(produto.getNome());
		System.out.println(produto.getValor());
		System.out.println(produto.calcularImposto());
	}
}
