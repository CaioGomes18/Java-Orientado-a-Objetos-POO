package edu.caio.POO.Ex8.main;

import edu.caio.POO.Ex8.util.LeitoraDeDados;

public class Principal {
	
	static LeitoraDeDados ler = new LeitoraDeDados();
	public static void main(String []args) {
		Carro c1 = new Carro();

		System.out.println("Digite o nome da fabricante : ");
		c1.setNomeDaFabricante(ler.lerDados());
		
		System.out.println("Digite o modelo : ");
		c1.setModelo(ler.lerDados());
		
		System.out.println("Digite o ano : ");
		c1.setAno(ler.lerDados());
		
		
		System.out.println(c1.getNome());
		System.out.println(c1.getModelo());
		System.out.println(c1.getAno());
		
	}

	
}
