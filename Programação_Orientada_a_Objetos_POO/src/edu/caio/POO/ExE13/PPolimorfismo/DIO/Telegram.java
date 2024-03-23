package edu.caio.POO.ExE13.PPolimorfismo.DIO;

public class Telegram extends ServicoDeMensagens{

	@Override
	public void enviarMensagens() {
		validarInternet();
		System.out.println("Enviando Mensagens do Telegram");
		
	}

	@Override
	public void receberMensagens() {
		System.out.println("Enviando Mensagens do Telegram");
	}

}
