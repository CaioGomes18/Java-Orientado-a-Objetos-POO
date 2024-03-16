package edu.caio.POO.Ex9;
//Esse arquivo diz respeito ao encapsulamento em POO Java

public class TesteMensagem {
	public static void main(String [] args) {
		MSNMessenger sms = new MSNMessenger();
		
		sms.enviarMensagem();
		
		sms.receberMensagem();
				
	}
}
