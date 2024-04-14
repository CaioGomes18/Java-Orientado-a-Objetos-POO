package edu.caio.POO.ExE14.Interfaces.Dominio;

public interface DataLoader {
	
	public static final int MAX_DATA_SIZE = 10;
	
	void load();
	
	default void validate() {
		System.out.println("Fazendo validação");
	}
	
	public static void retrieveMaxDataSize() {
		System.out.println("Dentro do retrievDataSize da interface");
	}
}
