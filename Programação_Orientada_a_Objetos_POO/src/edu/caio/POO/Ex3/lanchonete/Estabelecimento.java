package edu.caio.POO.Ex3.lanchonete;

import edu.caio.POO.Ex3.lanchonete.area.cliente.Cliente;
import edu.caio.POO.Ex3.lanchonete.atendimento.Atendente;
import edu.caio.POO.Ex3.lanchonete.atendimento.cozinha.Almoxarife;
import edu.caio.POO.Ex3.lanchonete.atendimento.cozinha.Cozinheiro;

public class Estabelecimento {
	public static void main(String[] args) {
		Cozinheiro cozinheiro = new Cozinheiro();
		//ações que não precisam estarem disponíveis para toda a aplicação
		//já foram  deletadas
		
		//ações que estabelecimento precisa ter ciência
		cozinheiro.adicionarSucoNoBalcao();;
		cozinheiro.adicionarLancheNoBalcao();
		cozinheiro.adicionarComboNoBalcao();

		//ações que não precisam estarem disponíveis para toda a aplicação
		
		Atendente atendente = new Atendente();
		atendente.pegarLancheCozinha();
		atendente.receberPagamento();
		atendente.servindoMesa();

		
		Cliente cliente = new Cliente();
		cliente.escolherLanche();
		cliente.fazerPedido();
		cliente.pagarConta();
		
		//não deveria, mas o estabelecimento
		//ainda não definiu normas de atendimento

		
		//esta ação é muito sigilosa, qua tal ser privada ?
		
		
		//já pensou os clientes ouvindo que o gás acabou ?
		
	}
}
