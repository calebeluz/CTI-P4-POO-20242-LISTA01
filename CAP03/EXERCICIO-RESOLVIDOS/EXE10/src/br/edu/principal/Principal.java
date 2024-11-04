package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double area, raio ;

		System.out.println("digite o raio da circuferência: ");
		raio = sc.nextDouble();
		
		area = raio*raio*3.14;
		System.out.println("a area do circulo é: "+ area);
	}

}