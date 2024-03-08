package edu.caio.POO.Ex7;

import java.util.Scanner;
public class EmpregadoTeste {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Empregado emp_1 = new Empregado("João", "Gomes", 1420);
		Empregado emp_2 = new Empregado("Marcos", "Salomão", 1750);
		int opc = 0;
		double valorAumento = 0.1;
		double aumento = 0;
		
		System.out.println("Bem vindo a zona de aumentos");
		
		
		do {
			System.out.println("Você deseja dar o aumento para os funcionarios?\n\t1 - sim \n\t0 - não");
			opc = input.nextInt();
			
			if(opc == 1) {
				aumento = emp_1.getSalarioMensal() + (emp_1.getSalarioMensal() * valorAumento);
				System.out.println(emp_1.getNome() + " " + emp_1.getSobrenome() + " Seu novo salario é de : " + aumento);
				aumento = emp_2.getSalarioMensal() + (emp_2.getSalarioMensal() * valorAumento);
				System.out.println(emp_2.getNome() + " " + emp_2.getSobrenome() + " Seu novo salario é de : " + aumento);
			}	
				
				
				
			
		}while(opc != 0);
		
		System.out.println("programa encerrado");
	}
}
