package edu.caio.POO.Ex6;

public enum EstadosBrasileiros {
	
	SAO_PAULO ("SP", "São Paulo", 10),
	RIO_JANEIRO ("RJ", "Rio de Janeiro", 11),
	PIAUI ("PI", "Piaui", 15),
	MARANHAO ("MA", "Maranhão", 25),
	CEARA ("CE" , "Ceará", 12);
	
	private String nome;
	private String sigla;
	private int indiceIBGE;
	
	private EstadosBrasileiros(String nome, String sigla, int indiceIBGE) {
		this.nome = nome;
		this.sigla = sigla;
		this.indiceIBGE = indiceIBGE;
	}

	public String getSigla() {
		return sigla;
	}
	public String getNome() {
		return nome;
	}
	public String getNomeMaiusculo() {
		return nome.toUpperCase();
	}
	public int getIndiceIBGE() {
		return indiceIBGE;
	}
		
}
