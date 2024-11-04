package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double deg, a_user,qtd_deg;
		System.out.println("Qual é altura do degrau: ");
		deg= sc.nextDouble();
		System.out.println("A qual altura deja subir: ");
		a_user= sc.nextDouble();
		qtd_deg = a_user / deg;
		System.out.println("voce subiu o total de: "+ qtd_deg);
	
	

	}

}
