package edu.caio.POO.ExE12.Abstracao.test2;


//Esse arquivo serve pra testar as funcionalidades pai avó e filho
public class TestClass {
	public static void main(String[] args) {
		Gerente gerente = new Gerente("Joana", 2000);
		Dev dev = new Dev("Caio", 12000);
		
		System.out.println(gerente);
		System.out.println(dev);
		gerente.imprime();
		dev.imprime();
	}
}	
