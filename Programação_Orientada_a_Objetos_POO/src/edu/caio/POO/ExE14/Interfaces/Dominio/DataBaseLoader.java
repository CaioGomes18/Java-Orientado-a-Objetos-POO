package edu.caio.POO.ExE14.Interfaces.Dominio;

public class DataBaseLoader implements DataLoader, DataRemover{
	
	public void load() {
		System.out.println("Carregando dados do banco de dados.");
	}
	public void remove() {
		System.out.println("Removendo da base dados");
	}
	
	public void validate() {
		System.out.println("Validando banco de dados");
	}
	
	public static void retrieveMaxDataSize() {
		System.out.println("Dentro do retrievDataSize da DataDaseLoader");
	}
}
