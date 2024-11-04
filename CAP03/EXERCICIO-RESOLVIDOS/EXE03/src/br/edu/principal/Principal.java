package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		double n1, n2, n3, p1, p2, p3, res;
		
		System.out.print("digite a primeira nota: ");
		n1 = sc.nextDouble();
		System.out.print("digite a segunda nota: ");
		n2 = sc.nextDouble();
		System.out.print("digite a terceira nota: ");
		n3 = sc.nextDouble();
		System.out.print("digite o primeiro peso: ");
		p1 = sc.nextDouble();
		System.out.print("digite o segundo peso: ");
		p2 = sc.nextDouble();
		System.out.print("digite o terceiro peso: ");
		p3 = sc.nextDouble();
		res = (n1*p1+n2*p2+n3*p3)/(p1+p2+p3);
		System.out.print("A média é: "+ res);
		

	}

}
