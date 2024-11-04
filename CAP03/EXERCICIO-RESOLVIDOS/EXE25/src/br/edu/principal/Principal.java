package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double custo, convite, qtd;
		System.out.print("qual é o custo: ");
		custo = sc.nextDouble();
		System.out.print("qual o valor do convite: ");
		convite = sc.nextDouble();
		qtd = custo/ convite;
		System.out.print("a quantidae de convites precisa de "+qtd);
		System.out.print(" convites");
	
	}

}
