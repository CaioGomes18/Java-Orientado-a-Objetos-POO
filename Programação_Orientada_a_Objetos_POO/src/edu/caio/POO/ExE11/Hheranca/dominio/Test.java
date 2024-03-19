package edu.caio.POO.ExE11.Hheranca.dominio;

import  java.util.Arrays;

public class Test {
	public static void main(String[] args) 
	{
		String []letras = {"A", "C", "V", "B", "M", "F"};
		
		Arrays.sort(letras);
		int n = letras.length;
		
		for(int i = 0; i<n; i++) {
			System.out.println(letras[i]);
		}
	}
}
