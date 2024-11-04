package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double ano,atual,idade ,futura;
		System.out.println("diga o ano de seu nacimento ");
		ano = sc.nextDouble();
		System.out.println("digite o ano atual: ");
		atual = sc.nextDouble();
		
		idade = atual - ano;
		System.out.println(idade);
		futura = 2050 - ano;
		System.out.println(""+futura);
	
		
		

	}

}
