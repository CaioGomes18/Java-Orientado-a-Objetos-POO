package edu.caio.POO.Ex6;

public class SistemaIBGE {
	public static void main(String[] args) {
		for(EstadosBrasileiros e: EstadosBrasileiros.values()) {
			System.out.println("Sigla : "+ e.getSigla() + ", Nome do estado : " + e.getNome());
		}
		
		EstadosBrasileiros eb = EstadosBrasileiros.RIO_JANEIRO;
		
		System.out.println(eb.getNome());
		System.out.println(eb.getSigla());
		System.out.println(eb.getNomeMaiusculo());
		System.out.println(eb.getIndiceIBGE());
	}
	
}
