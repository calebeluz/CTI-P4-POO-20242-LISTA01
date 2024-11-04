package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num, num2,r1,r2;
	
		System.out.println("digite o número: ");
		num = sc.nextDouble();
		System.out.println("digite o número: ");
		num2 = sc.nextDouble();
		
	
		if (num > 0 && num2 > 0) {
			r1 = Math.pow(num, num2);
			r2 = Math.pow(num2,num);
			System.out.println(r1);
			System.out.println(r2);
		
		}

	}

}
