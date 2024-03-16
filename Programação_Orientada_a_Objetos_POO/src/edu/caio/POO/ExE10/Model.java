package edu.caio.POO.ExE10;

public class Model {
	
	public static void main(String []args) {
		MSN msn = new MSN();
		System.out.println("MSN");
		msn.enviarMensagem();
		msn.receberMensagem();
		
		Telegram tlg = new Telegram();
		System.out.println("Telegram");
		
		tlg.enviarMensagem();
		tlg.receberMensagem();
		
		Facebook fcb = new Facebook();
		System.out.println("Facebook");
		fcb.enviarMensagem();
		fcb.receberMensagem();
		
	}
}
