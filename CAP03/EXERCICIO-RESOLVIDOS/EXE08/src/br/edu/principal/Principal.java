package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double dep, taxa, rend;

		System.out.println("digite seu deposito: ");
		dep = sc.nextDouble();
		System.out.println("digite a taxa: ");
		taxa = sc.nextDouble();
		
		rend = dep + (dep *taxa );
		System.out.println("qual é o salario: "+ rend);

	}

}
