package edu.caio.POO.ExE13.PPolimorfismo.DIO;

public abstract class ServicoDeMensagens {
	public abstract void enviarMensagens();
	public abstract void receberMensagens();
	
	
	protected void validarInternet() {
		System.out.println("Você está concetado a internet!");
	}
}
