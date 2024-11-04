package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double fab,perc_d,vlr_i, vlr_d,p_final,perc_i;
		System.out.println("valor do preço de fabrica: ");
		fab = sc.nextDouble();
		System.out.println("percentual das destribuidora: ");
		perc_d= sc.nextDouble();
		System.out.println("o percentoal de impostos: ");
		perc_i = sc.nextDouble();
	
		vlr_d = fab * perc_d/100;
		vlr_i = fab * perc_d/ 100;
		p_final = fab + vlr_d + vlr_i;
		

		System.out.println("os lucros da distribuidora: "+ vlr_d);
		System.out.println("o valor dos impostos: " + vlr_i);
		System.out.println("o valor total do carro é: "+ p_final);
		
	}

}
