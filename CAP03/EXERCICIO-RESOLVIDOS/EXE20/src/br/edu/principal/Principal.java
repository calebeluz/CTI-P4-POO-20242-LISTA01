package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double ang,alt,escada, rad ;
		System.out.println("Qual é o ângulo da escada: ");
		ang= sc.nextDouble();
		System.out.println("Qual é a altura da escada: ");
		alt= sc.nextDouble();
		
		rad = ang *3.14 / 180;
		escada = alt/ Math.sin(rad);
		System.out.println(escada);
		
	}

}
