package edu.caio.POO.ExE12.Abstracao.test;


/*Nesse caso do estudo de overrides nós estamos fazendo o override do calcula bonus
 * Nós temos um método calcula bonus no funcionario, ele deveria executar o clacula bouns
 * da classe funcionario, porém quem executa o código não é a classe e sim o objeto
 * e nesse caso não temos um objeto funcionario, e nem poderia pois é uma classe abstrata,
 * o que faz com que ela seja apenas um template para as subclasses então quem está executando é 
 * os objetos gerente, bancario e zelador e neles temos um override do método calculaBonus, 
 * ou seja ele sobrescreve o método da classe funcionario, e como diferentes objetos com diferente 
 * bonus fazemos o verride do método, provando mais uma vez, quem executa é o objeto e não a classe*/
public class TestOverride {
	
	public static void main(String[] args) {
		Gerente gerente = new Gerente("Caio", 5000);
		Zelador zelador = new Zelador("Marcos", 1420);
		Bancario bancario = new Bancario("Nami", 3200);
		
		System.out.println(gerente);
		System.out.println(zelador);
		System.out.println(bancario);
		
		
	}
}
