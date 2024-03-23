package edu.caio.POO.ExE13.PPolimorfismo.DIO;

public class CelularPedrinho {
	
	public static void main(String[] args) {
		ServicoDeMensagens smi = null;
		
		String appEscolhido ="whats";
		
		if(appEscolhido.equals("whats")) {
			smi = new Whatsapp();
		}
		if(appEscolhido.equals("tlg")) {
			smi = new Telegram();
		}
		
		smi.enviarMensagens();
		smi.receberMensagens();
	}
}
