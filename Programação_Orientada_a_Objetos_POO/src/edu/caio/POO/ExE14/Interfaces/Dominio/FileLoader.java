package edu.caio.POO.ExE14.Interfaces.Dominio;

public class FileLoader implements DataLoader, DataRemover{

	@Override
	public void load() {
		System.out.println("Carregando dados de um arquivo.");		
	}
	
	public void remove() {
		System.out.println("Removendo arquivo");
	}
	
	public void validate() {
		System.out.println("Validando arquivo");
	}
}
