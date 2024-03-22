package edu.caio.POO.ExE12.Abstracao.DioExercises;

public class Telegram extends ServicoPai{

	@Override
	public void enviarMensagens() {
		System.out.println("Enviando mensagem pelo Telegram");
		
	}

	@Override
	public void receberMensagens() {
		System.out.println("Recebendo mensagem pelo Telegram");
		
	}

}
