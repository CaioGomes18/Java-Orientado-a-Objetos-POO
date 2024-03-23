package edu.caio.POO.ExE13.PPolimorfismo.DIO;

public class Whatsapp extends ServicoDeMensagens{

	
	public void enviarMensagens() {
		validarInternet();
		System.out.println("Enviando Mensagens do Whatsapp");
		
	}

	
	public void receberMensagens() {
		System.out.println("Enviando Mensagens do Whatsapp");
	}
	
}
