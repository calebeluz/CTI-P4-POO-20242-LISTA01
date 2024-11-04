package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double base, altura, área;

		System.out.println("digite a  altura: ");
		altura= sc.nextDouble();
		System.out.println("digite a a base: ");
		base= sc.nextDouble();
		
		área =(base*altura)/2;
		System.out.println("A área é: "+ área);
		
		
	}

}