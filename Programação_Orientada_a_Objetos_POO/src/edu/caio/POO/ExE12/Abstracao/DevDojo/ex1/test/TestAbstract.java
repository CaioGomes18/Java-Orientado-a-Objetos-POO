package edu.caio.POO.ExE12.Abstracao.DevDojo.ex1.test;

import edu.caio.POO.ExE12.Abstracao.DevDojo.ex1.dominio.Gerente;
import edu.caio.POO.ExE12.Abstracao.DevDojo.ex1.dominio.Desenvolvedor;

public class TestAbstract {
	public static void main(String[] args) {
		
		Gerente gerente = new Gerente("Evellyn", 8000);
		Desenvolvedor dev = new Desenvolvedor("Caio", 12000);
		//System.out.println(func);
		System.out.println(gerente);
		System.out.println(dev);	
		
	}
}
