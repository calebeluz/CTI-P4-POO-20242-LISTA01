package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double pe,jarda, milha,polegadas;
		System.out.println("digite o número: ");
		pe = sc.nextDouble();
		jarda = pe/3;
		polegadas = pe*12;
		milha = jarda/1760; 
		System.out.println("jardas: "+ jarda);
		System.out.println("polegadas: "+ polegadas);
		System.out.println("milhas: "+ milha);
		

	}

}
