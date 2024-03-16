package edu.caio.POO.ExE11.Hheranca.test;


import edu.caio.POO.ExE11.Hheranca.dominio.*;
public class HerencaTest {
	
	public static void main(String[]args) {
		Endereco endereco =new Endereco();
		Pessoa p = new Pessoa();
		
		endereco.setRua("Rua 3");
		endereco.setCep("22429-023");
		
		p.setNome("tun do");
		p.setCpf("256.036.485.75");
		p.setEndereco(endereco);
		
		p.imprime();
		
		
		Funcionario func =new Funcionario();
		
		func.setNome("aneyo haseio");
		func.setCpf("785.4523.787.89");
		func.setEndereco(endereco);
		func.setSalario(2.500);
		
		func.imprime();
	}
}
