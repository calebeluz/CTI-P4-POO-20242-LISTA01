package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double h, m ,hora,conversao ;
		System.out.print("digite a hora que deseja converter: ");
		hora = sc.nextDouble();
		h = Math.floor(hora);
		m = hora - h;
		conversao = (h *60) + (m*100);
		conversao = Math.floor(conversao);
		
		
		System.out.print("são respectivamente "+conversao);
		System.out.print(" minutos");
	
		
		
		
		
	}

}
