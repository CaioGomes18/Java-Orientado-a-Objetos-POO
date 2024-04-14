package edu.caio.POO.ExE14.Interfaces.Dominio;

public interface DataLoader {
	
	void load();
	
	default void validate() {
		System.out.println("Fazendo validação");
	}
}
