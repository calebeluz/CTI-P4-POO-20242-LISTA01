package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double p_saco, r_gato1,r_gato2, total;
		System.out.println("peso do saco de ração");
		p_saco= sc.nextDouble();
		System.out.println("quandidade de ração para o primeiro gato: ");
		r_gato1 = sc.nextDouble();
		System.out.println("quandidade de ração para o segundo gato: ");
		r_gato2= sc.nextDouble();
		r_gato1 = r_gato1/1000;
		r_gato2 = r_gato2/1000;
		total = p_saco - 5 * (r_gato1 + r_gato2);
		System.out.println("o restante de ração é: "+ total);
	


	}

}
